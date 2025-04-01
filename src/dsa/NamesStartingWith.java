package dsa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NamesStartingWith {
    public static String str = "hello";
    public String str2 = "hola";
    public void names() {
        List<String> names = Arrays.asList("Yashas", "Sutiya", "Suraj", "Kanika", "Sunda");

        List<String> resultList =
                names.stream()
                        .filter(name -> name.startsWith("Su"))
                        .collect(Collectors.toList());

        System.out.println("Result: " + resultList);

        str = "Hi";
        str2 = "Bye";
        System.out.println("Str: " + str);
        System.out.println("Str2: " + str2);
    }

    public static void test() {
        str = "Hi";
       // str2 = "Bye";
    }

    public static void main(String[] args) {
        NamesStartingWith namesStartingWith = new NamesStartingWith();
        namesStartingWith.names();
    }
}
