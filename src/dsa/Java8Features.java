package dsa;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8Features {
    public void listToMap() {
        String[] arr = {"k1,v1","k2,v2","k3,v3","k4,v4","k1,v5"};

        Map<String, String> map =
                Arrays.stream(arr)
                        .map(val -> val.split(","))
                        .collect(
                                Collectors.toMap(
                                        val -> val[0],
                                        val -> val[1],
                                        (val1, val2) -> val1));

        map.forEach((key, value) -> System.out.println("Key: " + key + " Value: " + value));
    }

    public static void main(String[] args) {
        Java8Features java8Features = new Java8Features();
        java8Features.listToMap();
    }
}
