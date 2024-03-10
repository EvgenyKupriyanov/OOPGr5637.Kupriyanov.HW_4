package Model;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
//Добавил класс HashMap
public class ModelClassHash implements iGetModel {


    private HashMap<Integer, List<Student>> studMap;


    public ModelClassHash(HashMap<Integer, List<Student>> studMap) {
        this.studMap = studMap;
    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public void setAllStudents(List<Student> students) {

    }

    @Override
    public void removeStudent(int id, List<Student> students) {

    }
}




