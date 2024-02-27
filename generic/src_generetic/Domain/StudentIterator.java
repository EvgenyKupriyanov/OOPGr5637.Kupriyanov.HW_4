package Domain;

import java.util.Iterator;
import java.util.List;

public class StudentIterator<V,M> implements Iterator<Student<V,M>> {
    private int counter;
    private List<Student<V,M>> students;

    public StudentIterator(List<Student<V,M>> students) {
        this.students = students;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < students.size();
    }

    @Override
    public Student next() {
        if (!hasNext()) {
            return null;
        }
        // counter++;
        return students.get(counter++);
    }

}
