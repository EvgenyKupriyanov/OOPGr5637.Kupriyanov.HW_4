package Services;

import Domain.Person;
import Domain.PersonComparator;
import Domain.Teacher;

import java.util.ArrayList;
import java.util.List;
// Сервис добавления нового учителя + сортировка по имени
public class TeacherService<V,M> implements iPersonService<Teacher<V,M>>{

    private int count;
    private List<Teacher<V,M>> listTeach;

    public TeacherService() {
        this.listTeach = new ArrayList<>();
    }

    @Override
    public List<Teacher<V,M>> getAll() {
        return listTeach;
    }

    // Переопределил метод чтобы в консоль выводилась вся информацию включая степень
    @Override
    public void create(Teacher<V,M> arg) {
        Teacher<V,M> teacher = new Teacher(arg.getName(), arg.getAge(), arg.getAcadDegree() );
        count++;
        listTeach.add(teacher);
    }



    public void sortByFIOTeach(){
        PersonComparator<V,M, Teacher<V,M>> teachSort = new PersonComparator<>();
        listTeach.sort(teachSort);
    }


    @Override
    public String toString() {
        return "Список учителей - " + listTeach +
                '.';
    }
}
