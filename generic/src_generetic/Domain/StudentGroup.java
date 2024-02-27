package Domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup<V,M> implements Iterable<Student<V,M>>, Comparable<StudentGroup<V,M>> {
    private List<Student<V,M>> group;
    private M idGroup;
    private List<V> sgroup = new ArrayList<>();


    public StudentGroup(List<Student<V,M>> group, M idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    public List<Student<V,M>> getGroup() {
        return group;
    }

    public void setGroup(List<Student<V,M>> group) {
        this.group = group;
    }

    public M getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(M idGroup) {
        this.idGroup = idGroup;
    }


    public List<V> sgroup() {
        sgroup = new ArrayList<>();
        for (int i = 0; i < group.size(); i++) {
            sgroup.add(group.get(i).getName());
        }
        return sgroup;
    }


    @Override
    public String toString() {

        return "StudentGroup{" +
                "ID группы: " + idGroup +
                ", количество студентов: " + group.size() +
                ", cписок студентов: " + sgroup() +
                '}'; //+ //group.get(group.size()).getName() +


    }
    @Override
    public Iterator<Student<V,M>> iterator() {
        return new StudentIterator<V,M>(group);

    }

    // Компаратор для сортировки групп по количеству стундетов в них и по номеру группы
    @Override
    public int compareTo(StudentGroup<V,M> o) {
        if (this.group.size() > o.group.size()) {
            return 1;
        }
        if (this.group.size() < o.group.size()) {
            return -1;
        }
        if ((int) this.idGroup > (int) o.idGroup) {
            return 1;
        }
        if ((int) this.idGroup < (int) o.idGroup) {
            return -1;
        }
        return 0;
    }



    // @Override
    // public Iterator<Student> iterator() {
    // return new Iterator<Student>() {

    // private int counter;

    // @Override
    // public boolean hasNext() {

    // if(counter<group.size())
    // {
    // return true;
    // }
    // else
    // {
    // return false;
    // }
    // }

    // @Override
    // public Student next() {
    // return group.get(counter++);
    // }

    // };

    // }


}
