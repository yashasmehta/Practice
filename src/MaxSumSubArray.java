import java.util.Scanner;

public class MaxSumSubArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       /* System.out.println("Enter Array Size: ");
        int size = scanner.nextInt();*/
       // int[] arr = new int[size];

        int[] arr = {5,4,-1,7,8};
        System.out.println("Enter the elements of the array ::");

       /* for(int i=0; i<size; i++) {
            arr[i] = scanner.nextInt();
        }*/

        MaxSumSubArray maxSumSubArray = new MaxSumSubArray();
        maxSumSubArray.findSubArray(arr);
    }

    public void findSubArray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0;
        int end = 0;
        int k = 0;

        for(int i=0;i<arr.length;i++) {
            sum += arr[i];

            if(maxSum < sum) {
                maxSum = sum;
                start = k;
                end = i;
            }

            if(sum < 0) {
                sum = 0;
                k = i + 1;
            }
        }

        System.out.print("{");

        for(int i=start;i<=end;i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("}");
    }
}
