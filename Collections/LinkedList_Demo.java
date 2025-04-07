import java.util.*;

public class LinkedList_Demo {
    public static void main(String[] args) {
        LinkedList<String> sweets = new LinkedList<>();
        sweets.add("Gulab Jamun");
        sweets.add("Ladoo");
        sweets.add("Rasmalai");

        System.out.println("LinkedList: " + sweets);

        sweets.addFirst("Gujiya");
        sweets.addLast("Barfi");
        sweets.remove("Ladoo");

        System.out.println("Updated LinkedList: " + sweets);
        System.out.println("First Element: " + sweets.getFirst());
        System.out.println("Last Element: " + sweets.getLast());
    }
}