package practise;
import java.util.*;
public class Assignment_1 { 
	
	
	public static void useList() {
        List<String> list = new ArrayList<>();
        list.add("Porsche 911");
        list.add("Lamborghini");
        list.add("BMW m4 Competition"); 
        list.add("BMW m4 Competition");
        System.out.println("Car Name  (List): " + list);
    }

    public static void useSet() {
        Set<String> set = new HashSet<>();
        set.add("Sujay");
        set.add("Sunny");
        set.add("Sneh");
        set.add("Sujay"); 
        System.out.println("Student Name  (Set): " + set);
    }

    public static void main(String[] args) {
        useList();
        System.out.println();
        useSet();
    }

}
