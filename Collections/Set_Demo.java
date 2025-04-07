import java.util.*;

public class Set_Demo {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red");

        System.out.println("Set Elements: " + colors);
        colors.remove("Green");
        System.out.println("After removal: " + colors);
        System.out.println("Contains Blue: " + colors.contains("Blue"));
    }
}