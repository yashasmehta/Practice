import java.util.*;

public class TopPerformers {

    public int[] giveTopPerformers(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int e : arr) {
            if(map.get(e) == null) {
                map.put(e, 1);
            } else {
                map.put(e, map.get(e) + 1);
            }
        }

        // 1 - 1, 3 - 1, 5 - 2, 11 - 2, 12- 2

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((o1, o2) -> {
            if(o1.getValue() < o2.getValue()) {
                return 1;
            } else if(o1.getValue() > o2.getValue()) {
                return -1;
            } else {
                return 0;
            }
        });

        int[] result = new int[k];
        int j = 0;

        for(int i= list.size()- k; i>=0;i--) {
            result[j++] = list.get(i).getKey();
        }
        return result;
    }

    public static void main(String[] args) {
        TopPerformers topPerformers = new TopPerformers();

        int[] array = {1,3,5,11,12,11,12,5};
        int k = 3;

        int[] result = topPerformers.giveTopPerformers(array, k);

        for(int res : result) {
            System.out.println(res);
        }
    }
}
