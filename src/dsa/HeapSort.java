package dsa;

public class HeapSort {
    public void sort(int[] a, int n) {
        // convert to heap
        buildHeap(a, n);

        // sort
        for(int i=n;i>1;i--) {
            //swap first element with i as first element in heap is always the largest
            swap(a, 1, i);

            // convert remaining part to heap
            heapify(a, i-1, 1);
        }

    }
    public void buildHeap(int[] a, int n) {
        for(int i=n/2; i>=1;i--) {
            heapify(a, n, i);
        }
    }

    public void heapify(int[] a, int n, int i) {
        int largest = i;
        int l = 2 * i;
        int r = 2 * i + 1;

        if(l<=n && a[l] > a[largest]) {
            largest = l;
        }

        if(r<=n && a[r] > a[largest]) {
            largest = r;
        }

        if(largest != i) {
            swap(a, largest, i);
            heapify(a, n, largest);
        }
    }

    public void swap(int[] a, int largest, int i) {
        int temp = a[largest];
        a[largest] = a[i];
        a[i] = temp;
    }

    public static void main(String[] args) {
        int[] a = {-1, 40, 10, 30, 50, 60, 15};
        HeapSort heapSort = new HeapSort();
        //heapSort.buildHeap(a, 6);
        heapSort.sort(a, 6);
        for(int i=1;i<=6;i++) {
            System.out.println(a[i]);
        }
    }
}
