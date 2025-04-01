public class MooresVotingAlgorithm {

    public int findMajorityElement(int[] arr) {
        int ansIndex = 0;
        int count = 1;

        for(int i=1;i<arr.length;i++) {
            if(arr[i] == arr[ansIndex]) {
                count++;
            } else {
                count--;
            }

            if(count == 0) {
                ansIndex = i;
                count = 1;
            }
        }
        int result = 0;

        for(int i=0;i<arr.length;i++) {
            if(arr[i] == arr[ansIndex]) {
                result++;
            }
        }

        if(result > arr.length/2) {
            return arr[ansIndex];
        }

        return -1;
    }

    public int findMajorityElement2(int[] arr) {
        int count = 0;
        int eligibleIndex = 0;

        for(int i=1 ; i<arr.length; i++) {
            if(arr[i] == arr[eligibleIndex]) {
                count++;
            } else {
                count--;
            }

            if(count == 0) {
                eligibleIndex = i;
                count = 1;
            }
        }

        int ansCount = 0;
        for(int i=0 ; i<arr.length; i++) {
            if(arr[i] == arr[eligibleIndex]) {
                ansCount++;
            }
        }

        if(ansCount > (arr.length/2)) {
            return arr[eligibleIndex];
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,5,1,1};
        MooresVotingAlgorithm algorithm = new MooresVotingAlgorithm();
        System.out.println(algorithm.findMajorityElement2(arr));
    }
}
