package Controller.Interfaces;

import java.util.Collection;
import java.util.List;

import Model.Domain.Student;

public interface iGetModel {
    public List<Student> getAllStudents();

    public void setAllStudents(List<Student> students);
// Метод удаления контакта
    public void removeStudent(int id, List<Student> students);
}

