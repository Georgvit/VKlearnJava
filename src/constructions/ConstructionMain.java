package constructions;

import domainmodel.Employee;

public class ConstructionMain {
    public static void main(String[] args) {


        Employee employee = new Employee();
        Employee employee2 = new Employee("Egor", "developer", 100);
        Employee employee1 = new Employee("Victor", "developer", 100);
        System.out.println(employee);
        System.out.println(employee2);
        System.out.println(employee1);
    }
}
