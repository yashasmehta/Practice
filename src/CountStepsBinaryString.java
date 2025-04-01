import java.util.HashMap;
import java.util.Map;

class CountStepsBinaryString {

    static int minimizeReplacements(String str)
    {
        Map<String, Integer> count = new HashMap<>();
        String temp;

        // Loop to count the minimum number
        // of replacements required
        for(int i = 0; i < str.length() - 1; i++)
        {
            temp = str.substring(i, i + 2);
            if (count.containsKey(temp))
                count.put(temp, count.get(temp) + 1);
            else
                count.put(temp, 1);
        }
        return Math.abs(count.get("10") + count.get("01"));
    }

    // Driver code
    public static void main(String args[])
    {

        // Given string
        String str = "001011";
        System.out.print(minimizeReplacements(str));
    }
}

// This code is contributed by gfgking
