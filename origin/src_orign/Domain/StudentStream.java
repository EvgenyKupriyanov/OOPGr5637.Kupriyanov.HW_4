package Domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// Класс для потока групп, показывающий поток и список групп.
public class StudentStream implements Iterable<StudentGroup>{
    private int numStream;
    private List<String> strgroup = new ArrayList<>();

    private List<StudentGroup> grList; // Список групп одного потока

    public StudentStream(int numStream) {
        grList = new ArrayList<>();
        this.numStream = numStream;
    }

    public int getNumStream() {
        return numStream;
    }

    public List<StudentGroup> getGrList() {
        return grList;
    }

    public void add(StudentGroup group) {
        grList.add(group);
    }

    public List<String> strgroup() {
        strgroup = new ArrayList<>();
        for (int i = 0; i < grList.size(); i++) {
            for (int j = 0; j < grList.get(i).getGroup().size(); j++) {
                strgroup.add(grList.get(i).getGroup().get(j).getName());
            }

        }
        return  strgroup;
    }

    @Override
    public String toString() {

        return "Номер потока: " + numStream +
                ", количество групп: " + grList.size() +
                ", список групп: " + strgroup() +
                '.';
    }

    //Итератор групп студентов
    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupIterator(grList);
    }

}
