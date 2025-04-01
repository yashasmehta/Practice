package dsa.linkedlist;

class Solution {
    public Node addTwoNumbers(Node l1, Node l2) {
        Node curr1 = l1;
        Node curr2 = l2;
        Node head = null;
        Node tail = null;
        int sum = 0;
        while(curr1 != null && curr2 != null) {
            sum += curr1.data + curr2.data;
            int rem;
            Node newNode = new Node();
            if(sum > 9) {
                rem = sum % 10;
                sum = sum / 10;
                newNode.data = rem;
            } else {
                newNode.data = sum;
                sum = 0;
            }

            if(head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }

            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        if(curr1 == null) {
            while(curr2 != null) {
                Node newNode = new Node(curr2.data);

                sum += newNode.data;
                if(sum > 9) {
                    int rem = sum % 10;
                    sum = sum / 10;
                    newNode.data = rem;
                } else {
                    newNode.data = sum;
                    sum = 0;
                }

                tail.next= newNode;
                tail = newNode;
                curr2 = curr2.next;
            }
        } else {
            while(curr1 != null) {
                Node newNode = new Node(curr1.data);
                sum += newNode.data;
                if(sum > 9) {
                    int rem = sum % 10;
                    sum = sum / 10;
                    newNode.data = rem;
                } else {
                    newNode.data = sum;
                    sum = 0;
                }
                tail.next= newNode;
                tail = newNode;
                curr1 = curr1.next;
            }
        }

        if(sum != 0) {
            Node newNode = new Node(sum);
            tail.next= newNode;
            tail = newNode;
        }

        return head;
    }

    public static void main(String[] args) {
        /*MyLinkedList l1 = new MyLinkedList();
        l1.insert(2);
        l1.insert(4);
        l1.insert(3);

        MyLinkedList l2 = new MyLinkedList();
        l2.insert(5);
        l2.insert(6);
        l2.insert(4);*/

        MyLinkedList l1 = new MyLinkedList();
        l1.insert(9);
        l1.insert(9);
        l1.insert(9);
        l1.insert(9);
        l1.insert(9);
        l1.insert(9);
        l1.insert(9);

        MyLinkedList l2 = new MyLinkedList();
        l2.insert(9);
        l2.insert(9);
        l2.insert(9);
        l2.insert(9);


        Solution solution = new Solution();
        Node head3 = solution.addTwoNumbers(l1.head, l2.head);

        Node curr = head3;
        while(curr != null) {
            System.out.println(curr.data + " -> ");
            curr = curr.next;
        }
    }
}

/*
class ListNode {
    int data;
    ListNode next;
    ListNode() {}
    ListNode(int data) { this.data = data; }
    ListNode(int data, ListNode next) { this.data = data; this.next = next; }
}*/

/*    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = null;
        ListNode t3 = null;

        ListNode curr1 = l1;
        ListNode curr2 = l2;

        int sum = 0;
        int carry = 0;

        while(curr1 != null || curr2 != null) {
            int val1 = curr1 == null ? 0 : curr1.val;
            int val2 = curr2 == null ? 0 : curr2.val;
            sum = val1 + val2 + carry;

            carry = sum / 10;
            sum = sum % 10;

            if(l3 == null) {
                l3 = new ListNode(sum);
                t3 = l3;
            } else {
                ListNode node = new ListNode(sum);
                t3.next = node;
                t3 = node;
            }

            if(curr1 != null) {
                curr1 = curr1.next;
            }
            if(curr2 != null) {
                curr2 = curr2.next;
            }
        }

        if(carry != 0) {
            ListNode temp = new ListNode(carry);
            t3.next = temp;
        }

        return l3;
    }*/
