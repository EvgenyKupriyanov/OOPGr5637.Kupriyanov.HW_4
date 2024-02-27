package Domain;

import java.util.Iterator;
import java.util.List;
// Итератор для группы студентов
public class GroupIterator<V,M> implements Iterator<StudentGroup<V,M>>{
    private int counter;
    private List<StudentGroup<V,M>> groups;

    public GroupIterator(List<StudentGroup<V,M>> groups) {
        this.groups = groups;
        this.counter = 0;
    }


    public boolean hasNext() {
        return counter < groups.size();
    }

    public StudentGroup<V,M> next() {
        if (!hasNext()) {
            return null;
        }
        // counter++;
        return groups.get(counter++);
    }

}
