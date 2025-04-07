import java.util.*;

public class HashMap_Demo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Aman", 101);
        map.put("Sujay", 102);
        map.put("Riya", 103);

        System.out.println("Initial Map: " + map);
        map.put("Sujay", 999);
        map.remove("Aman");

        System.out.println("Updated Map: " + map);
        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());
    }
}