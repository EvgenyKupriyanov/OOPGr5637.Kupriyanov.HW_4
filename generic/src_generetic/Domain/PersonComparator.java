package Domain;

import java.util.Comparator;

public class PersonComparator<V, M, T extends Person<V, M>> implements Comparator<T> {


    @Override
    public int compare(T o1, T o2) {
        String name1 = (String) o1.getName();
        String name2 = (String) o2.getName();
        int res = name1.compareTo(name2);
        if (res == 0) {
            return 0;
        } else {
            return res;
        }
    }
}
