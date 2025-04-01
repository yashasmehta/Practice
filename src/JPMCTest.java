import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class JPMCTest {
   // list of cars brands-
   public static void main(String[] args) {
       List<String> cars = Arrays.asList("Hyundai", "Maruti","Honda");

       
   }
}

interface Transformer {
    String transform(String str);
}

class Upper implements Transformer {

    @Override
    public String transform(String str) {
        return str.toUpperCase();
    }
}

class Lower implements Transformer {

    @Override
    public String transform(String str) {
        return str.toLowerCase();
    }
}