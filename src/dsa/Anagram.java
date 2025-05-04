package dsa;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

//Output

//[eat, tea, ate]

//[bat]

//[tan, nat]
        Map<String, List<String>> map = new HashMap<>();
        List<String> list;
        for(String str : strs) {
            if(!map.containsKey(sort(str))) {
                list = new ArrayList<>();
                list.add(str);
                map.put(sort(str), list);
            } else {
                List<String> value = map.get(sort(str));
                value.add(str);
                map.put(sort(str), value);
            }
        }

        for (Map.Entry<String, List<String>> stringListEntry : map.entrySet()) {
            System.out.println(stringListEntry.getValue());
        }
    }

    private static String sort(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return String.valueOf(charArray);
    }
}