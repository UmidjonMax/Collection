import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {
    public static void main(String[] args) {

        ArrayList<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Orange");
        items.add("Grapes");
        items.add("Mango");

        // Qidiriladigan element
        String searchItem = "Banana";

        // Elementni qidirish
        if (items.contains(searchItem)) {
            System.out.println(searchItem + " topildi.");
        } else {
            System.out.println(searchItem + " topilmadi.");
        }
        ArrayList<String> copied = new ArrayList<>(items);
        System.out.println("Copied: "+copied);

        Collections.shuffle(items);
        System.out.println("Shuffled: " + items);
    }
}
