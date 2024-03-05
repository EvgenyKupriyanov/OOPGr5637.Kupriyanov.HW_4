package SRP;
// Класс сотрудников
import java.util.Date;

public class Employee {
    private String name;
    private Date dob;
    //private int baseSalary;
    private int baseSalary;
    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

    public int getBaseSalary() {
        return baseSalary;
    }
}
