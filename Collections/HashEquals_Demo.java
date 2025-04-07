import java.util.*;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int hashCode() {
        return Objects.hash(id, name);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee e = (Employee) o;
        return id == e.id && name.equals(e.name);
    }
}

public class HashEquals_Demo {
    public static void main(String[] args) {
        Map<Employee, String> map = new HashMap<>();
        Employee e1 = new Employee(1, "Sujay");
        Employee e2 = new Employee(1, "Sujay");

        map.put(e1, "Developer");
        map.put(e2, "Team Lead");

        for (Map.Entry<Employee, String> entry : map.entrySet()) {
            System.out.println(entry.getKey().name + " => " + entry.getValue());
        }
    }
}