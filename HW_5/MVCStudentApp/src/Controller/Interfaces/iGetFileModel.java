package Controller.Interfaces;

import Model.Domain.Student;

import java.util.List;
//Добавил новый интерфейс для разделения записи и работы в консоле
public interface iGetFileModel {

    public void saveAllStudentToFile(List<Student> students);
    public List<Student> getAllStudents();


}
