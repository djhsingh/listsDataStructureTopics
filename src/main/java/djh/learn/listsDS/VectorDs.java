package djh.learn.listsDS;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorDs {
    public static void main(String[] args) {
        Vector<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("John","Adam",53533));
        employeeList.add(new Employee("Timm","burton",3433));
        employeeList.add(new Employee("Paul","Geferry",8777));
        employeeList.add(new Employee("Hanna","Montana",77575));

        System.out.println(employeeList);
        employeeList.add(2,new Employee("Rahul","Sharma",1234));
        System.out.println(employeeList);

        employeeList.set(1,new Employee("Timber","lake",122334));
        System.out.println(employeeList);

        System.out.println(employeeList.isEmpty());
        System.out.println(employeeList.size());
        System.out.println(employeeList.stream().anyMatch(e -> e.getFirstName().equalsIgnoreCase("Hanna")));
        System.out.println(employeeList.elements());

    }
}
