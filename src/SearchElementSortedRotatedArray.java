public class SearchElementSortedRotatedArray {

    public static int searchElement(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;

        while(low <= high) {
            int mid = (low + high)/2;

            if(k == arr[mid]) {
                return mid;
            }

            if(arr[low] <= arr[mid]) { // left part sorted
                if(k >= arr[low] && k < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else { // right part sorted
                if(k <= arr[high] && k > arr[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {20,30,40,50,60,5,10};
        int k = 5;

        System.out.println('G' - 'A');

        /*int pos = searchElement(arr, k);

        if(pos == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at position " + pos);
        }*/
    }
}
