package domainmodel;

public class Employee {
    private static int id;
    private int employeeId;
    private String name;
    private String position;
    private int salary;
    private String departmant;

    {
        departmant = "IT";
    }


    public Employee() {
        this("Elene", "developer", 102);
    }

    private Employee(String name, String position, int salary, String departmant) {
        employeeId = id++;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.departmant = departmant;
    }

    public Employee(String name, String position, int salary){
        this(name, position, salary, "IT");

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", departmant='" + departmant + '\'' +
                '}';
    }
}
