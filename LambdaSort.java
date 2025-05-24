import java.util.*;

public class LambdaSort {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Banana", "Apple", "Mango", "Orange"));
        Collections.sort(list, (a, b) -> a.compareToIgnoreCase(b));
        list.forEach(System.out::println);
    }
}
