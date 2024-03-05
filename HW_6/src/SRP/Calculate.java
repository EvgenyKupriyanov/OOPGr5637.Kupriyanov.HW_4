package SRP;
//Метод расчета зарплаты
public class Calculate {

    public void calculateNetSalary(int baseSalary) {
        int tax = (int) (baseSalary * 0.25);
        int salary = baseSalary - tax;
        System.out.println("Salary - " + salary);
    }
}
