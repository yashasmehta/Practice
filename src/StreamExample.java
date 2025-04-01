import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,1,4,7,10);

        list.stream()
                .filter(val -> val>=3)
                .peek(val -> System.out.println("After Filter: " + val))
                .map(val -> -1 * val)
                .peek(val -> System.out.println("After Negation: " + val))
                .sorted()
                .peek(val -> System.out.println("After Sorting: " + val))
                .count();
    }
}
