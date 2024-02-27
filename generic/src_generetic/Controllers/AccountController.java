package Controllers;

import java.util.List;

import Domain.Person;
import Domain.Teacher;
import Domain.WorkingPerson;

public class AccountController<V,M> {

    public static <V, M, T extends WorkingPerson<V,M>> void paySalary(T person, M salary) {
        System.out.println(person.getName() + " выплачено зарплата " + salary + "р. ");
    }

    //Загатовка для метода averageAge
    public static <V,M, T extends Person<V,M>> double averageAge(List<T> persons)
    {
        double sum = 0.0;
        for (int i = 0; i < persons.size(); i++) {
            sum += persons.get(i).getAge();
        }
        return sum / persons.size();
    }
}
