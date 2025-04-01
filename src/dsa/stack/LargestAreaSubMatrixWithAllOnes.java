package dsa.stack;

public class LargestAreaSubMatrixWithAllOnes {
    private MaxAreaInHistogram maxAreaInHistogram;

    public LargestAreaSubMatrixWithAllOnes(MaxAreaInHistogram maxAreaInHistogram) {
        this.maxAreaInHistogram = maxAreaInHistogram;
    }

    public int maxAreaSubMatrix(int[][] a, int n) {
        int[] currRow = a[0];
        int maxArea = maxAreaInHistogram.maxArea(currRow, n);

        for(int i=1;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(a[i][j] == 1) {
                   currRow[i] += a[i][j];
                } else {
                    currRow[i] = 0;
                }

                int currArea = maxAreaInHistogram.maxArea(currRow, n);
                maxArea = Math.max(maxArea, currArea);
            }
        }
        
        return maxArea;
    }
    public static void main(String[] args) {
        int[][] a = {
                {0,1,1,1,1,0},
                {1,1,1,1,0,1},
                {1,1,0,1,1,1},
                {1,1,1,1,1,0}};

        LargestAreaSubMatrixWithAllOnes obj = 
                new LargestAreaSubMatrixWithAllOnes(new MaxAreaInHistogram());

        System.out.println("Max Area: " + obj.maxAreaSubMatrix(a, a.length));
    }
}
