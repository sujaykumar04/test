import java.util.*;

public class ArrayList_Demo {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        System.out.println("Original ArrayList: " + languages);

        languages.remove("Python");
        languages.add(1, "Go");
        languages.set(0, "Rust");

        System.out.println("Modified ArrayList: " + languages);
        System.out.println("Index of 'Go': " + languages.indexOf("Go"));
        System.out.println("Size: " + languages.size());
    }
}