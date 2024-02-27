package Services;

import Domain.PersonComparator;
import Domain.Teacher;

import java.util.ArrayList;
import java.util.List;
// Сервис добавления нового учителя + сортировка по имени
public class TeacherService implements iPersonService<Teacher>{

    private int count;
    private List<Teacher> listTeach;

    public TeacherService() {
        this.listTeach = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return listTeach;
    }

    // Переопределил метод чтобы в консоль выводилась вся информацию включая степень
    @Override
    public void create(Teacher arg) {
        Teacher teacher = new Teacher(arg.getName(), arg.getAge(), arg.getAcadDegree() );
        count++;
        listTeach.add(teacher);
    }



    public void sortByFIOTeach(){
        PersonComparator<Teacher> teachSort = new PersonComparator<Teacher>();
        listTeach.sort(teachSort);
    }


    @Override
    public String toString() {
        return "Список учителей - " + listTeach +
                '.';
    }
}
