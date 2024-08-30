import java.util.ArrayList;

public class ArrayList4 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Green");
        list1.add("Red");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Green");
        list2.add("Black");

        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).equals(list2.get(i))){
                result.add("Yes");
            }else {
                result.add("No");
            }
        }

        System.out.println("Result: " + result);
    }
}
