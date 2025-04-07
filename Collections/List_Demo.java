import java.util.*;

public class List_Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Sujay");
        list.add("Naman");
        list.add("Sujoy");

        System.out.println("Initial List:");
        System.out.println(list);

        list.set(1, "Aman");
        list.remove(0);
        list.add("Rahul");
        System.out.println("Modified List:");
        System.out.println(list);

        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("List contains 'Sujoy': " + list.contains("Sujoy"));
        Collections.sort(list);
        System.out.println("Sorted List:");
        System.out.println(list);
    }
}