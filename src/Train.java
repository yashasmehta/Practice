public class Train {
    Coach head;
    Coach tail;

    public Train() {
        head = null;
        tail = null;
    }

    public static void main(String[] args) {
        // Pass the input as a VM Argument seperated by "-"

        String input = args[0];
        String[] inputArray = input.split("-");
        Train train = new Train();

        for (String s : inputArray) {
            train.addCoach(s);
        }

        System.out.print("Input: ");
        train.printTrain();
        train.reverseCoach();
        System.out.print("Output: ");
        train.printTrain();
    }

    public void addCoach(String coachName) {
        Coach coach = new Coach(coachName);

        if(tail != null) {
            tail.next = coach;
            tail = coach;
        } else {
            head = coach;
            tail = coach;
            head.next = null;
            tail.next = null;
        }
    }

    public void reverseCoach() {
        Coach prev = null;
        Coach current = head;
        Coach next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        tail = head;
        head = prev;
    }

    public void printTrain() {
        Coach curr = head;

        while(curr != null) {
            System.out.print(curr.coachName + "-");
            curr = curr.next;
        }
        System.out.println();
    }

    static class Coach {
        String coachName;
        Coach next;

        Coach(String coachName) {
            this.coachName = coachName;
        }
    }
}
