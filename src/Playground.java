import java.util.Map;
import java.util.HashMap;

public class Playground {
    public static void main(String[] args) {
        Map<String,Float> productPrice = new HashMap<>();
        productPrice.put("apple", 2.49F);
        productPrice.put("potato", 1.49F);
        productPrice.put("banana", 1.99F);

        System.out.println(productPrice);

        System.out.println(productPrice.get("apple"));

    }
}
