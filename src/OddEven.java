public class OddEven {
    public String oddOrEven(int num) {
        if((num & 1) == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        OddEven oddEven = new OddEven();
        System.out.println("The number is " + oddEven.oddOrEven(2));
    }
}
