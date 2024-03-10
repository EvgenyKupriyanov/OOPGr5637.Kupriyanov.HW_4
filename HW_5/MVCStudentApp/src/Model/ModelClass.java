package Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

public class ModelClass implements iGetModel {
    private List<Student> students;
    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    public void setAllStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public void removeStudent(int id, List<Student> students) {
        List<Student> newList = new ArrayList<>();
        students.remove(id - 1);
        this.students = students;


    }


    public ModelClass(List<Student> students) {
        this.students = students;
    }

}
