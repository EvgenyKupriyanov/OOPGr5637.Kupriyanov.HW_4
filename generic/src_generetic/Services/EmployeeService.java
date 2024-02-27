package Services;

import java.util.ArrayList;
import java.util.List;

import Domain.Employee;
import Domain.Person;
import Domain.PersonComparator;
import Domain.Student;

public class EmployeeService<V,M> implements iPersonService<Employee<V,M>> {

    private int count;
    private List<Employee<V,M>> employees;

    public EmployeeService() {
        this.employees = new ArrayList<>();
    }

    @Override
    public List<Employee<V,M>> getAll() {
        return employees;
    }
// Переопределил метод для выдачи в консоль полно йинофрмации вклюая специальность
    @Override
    public void create(Employee<V,M> arg) {
        Employee<V,M> epls = new Employee(arg.getName(), arg.getAge(), arg.getSpecial());
        count++;
        employees.add(epls);
    }

//    @Override
//    public void create(String name, int age) {
//        Employee epls = new Employee(name, age, "basic");
//        count++;
//        employees.add(epls);
//    }

    public void sortByFIO()
    {
        PersonComparator<V, M, Employee<V, M>> persComp = new PersonComparator<>();
        employees.sort(persComp);
    }

    @Override
    public String toString() {
        return "Список рабочих - " +
                employees +
                '.';
    }
}
