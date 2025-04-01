package dsa;

public class BinarySearch {
    public int search(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while(low <= high) {
            int mid = (low + high) / 2;
            if(key < arr[mid]) {
                high = mid - 1;
            } else if(key > arr[mid]) {
                low = mid + 1;
            }

            if(arr[mid] == key) {
                return mid;
            }
        }

        return -1;
    }

    public int searchRecursive(int[] arr, int key, int low, int high) {
        if(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] == key) {
                return mid;
            }

            if(key < arr[mid]) {
                return searchRecursive(arr, key, low, mid-1);
            } else if(key > arr[mid]) {
                return searchRecursive(arr, key, mid+1, high);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = {1,3,5,7,9,10,34,60};
        System.out.println("Key found by iteration: " + binarySearch.search(arr, 5));
        System.out.println("Key found by Recursion: " + binarySearch.searchRecursive(arr, 34, 0, arr.length-1));
    }
}
