import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");
        colors.add("Black");
        colors.add("White");

        System.out.println("Colors: " + colors);

        colors.set(0, "Orange");
        System.out.println("Colors: " + colors);

        for (String color : colors) {
            System.out.println(color +" length :"+ color.length());
        }
    }
}