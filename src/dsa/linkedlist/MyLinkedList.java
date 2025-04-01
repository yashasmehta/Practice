package dsa.linkedlist;

public class MyLinkedList {
    Node head;
    Node tail;

    MyLinkedList() {
        head = null;
        tail = null;
    }
    public void insert(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
           // newNode.next = head;
           // head = newNode;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void delete(int data) {
        Node curr = head;
        Node prev;

        if(head.data == data) {
            head = head.next;
            curr = null;
            return;
        }

        while(curr != null) {
            prev = curr;
            curr = curr.next;
            if (curr.data == data) {
                prev.next = curr.next;
                curr = null;
                break;
            }
        }
    }

    public Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        tail = head;
        head = prev;
        return head;
    }

    public Node reverseRecursive(Node head) {
        if(head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseRecursive(head.next);
        Node headNext = head.next;
        headNext.next = head;
        head.next = null;
        return newHead;
    }

    public boolean isPalindrome(Node head) {
        if(head == null) {
            return true;
        }

        Node mid = mid(head);
        Node last = reverse(mid.next);

        Node curr = head;
        while(last != null) {
            if(curr.data != last.data) {
                return false;
            }
            curr = curr.next;
            last = last.next;
        }

        return true;
    }

    private Node mid(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public void print() {
        Node curr = head;
        while(curr != null) {
            System.out.println(curr.data + " -> ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        //myLinkedList.insert(1);
        //myLinkedList.insert(2);
        //myLinkedList.insert(3);
        //myLinkedList.print();
        //myLinkedList.delete(2);
        //System.out.println("After Deletion.... ");
        //myLinkedList.head = myLinkedList.reverse(myLinkedList.head);
        //myLinkedList.head = myLinkedList.reverseRecursive(myLinkedList.head);
        //System.out.println("After Reversal.... ");
        //myLinkedList.print();

        myLinkedList.insert(1);
        myLinkedList.insert(2);
        myLinkedList.insert(3);
        myLinkedList.insert(2);
        myLinkedList.insert(1);

        System.out.println("Is Palindrome: " + myLinkedList.isPalindrome(myLinkedList.head));

    }

}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node() {}
    Node(int data, Node next) { this.data = data; this.next = next;}
}