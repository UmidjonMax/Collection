import java.util.ArrayList;
import java.util.Collections;

public class ArrayList3 {
    public static <T> ArrayList<T> getSubList(ArrayList<T> list, int firstIndex, int lastIndex) {
        return new ArrayList<>(list.subList(firstIndex, lastIndex + 1));
    }
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Orange");
        items.add("Grapes");
        items.add("Mango");

        Collections.reverse(items);
        System.out.println("reversed: " + items);

        ArrayList<String> subList = getSubList(items, 1, 3);
        System.out.println(subList);


    }
}
