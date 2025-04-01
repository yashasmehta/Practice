public class MaxArea {
    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxArea = -1;

        while(i < j) {
            maxArea = Math.max(Math.min(height[i], height[j]) * Math.abs(i - j), maxArea);

            if(height[i] < height[j]){
                i++;
            } else{
                j--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {2,3,4,5,18,17,6};
        System.out.println(maxArea(height));
    }
}