import java.util.ArrayList;
import java.util.Collections;

public class ArrsyList5 {
    public static void main(String[] args) {
        ArrayList<String> items1 = new ArrayList<>();
        items1.add("Apple");
        items1.add("Banana");
        items1.add("Orange");

        ArrayList<String> items2 = new ArrayList<>();
        items2.add("Mango");
        items2.add("Grapes");
        items2.add("Orange");

        Collections.swap(items1, 0, 2);
        System.out.println("almashgan: "+items1);

        ArrayList<String> unitedItems = new ArrayList<>(items1);
        unitedItems.addAll(items2);
        System.out.println("birlashgan: " + unitedItems);

        items1.ensureCapacity(6);
        items1.add("Peach");
        items1.add("Kiwi");
        items1.add("Pomegranate");
        System.out.println(items1);
    }
}
