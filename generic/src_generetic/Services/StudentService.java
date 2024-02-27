package Services;

import java.util.ArrayList;
import java.util.List;

import Domain.Employee;
import Domain.Person;
import Domain.PersonComparator;
import Domain.Student;

public class StudentService<V,M> implements iPersonService<Student<V,M>>  {

    private int count;
    private List<Student<V,M>> students;

    public StudentService() {
        this.students = new ArrayList<>();
    }

    @Override
    public List<Student<V,M>> getAll() {
        return students;
    }

    @Override
    public void create(Student<V,M> arg) {
        Student<V,M> stud = new Student(arg.getName(), arg.getAge());
        count++;
        students.add(stud);
    }

//    @Override
//    public void create(String name, int age) {
//        Student stud = new Student(name, age);
//        count++;
//        students.add(stud);
//    }

    public void sortByFIO()
    {
        PersonComparator<V, M, Student<V, M>> persComp = new PersonComparator<>();
        students.sort(persComp);
    }
}
