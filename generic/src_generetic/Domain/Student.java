package Domain;

public class Student<V,M> extends Person<V,M> implements Comparable<Student<V,M>> {

    private int id;
    private int generalId;

    public Student(V name, M age) {
        super(name, age);
        this.id = generalId;
        generalId++;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Students [age=" + super.getAge() + ", name=" + super.getName() + ", id=" + id + "]";
    }

    @Override
    public int compareTo(Student<V,M> o) {

        System.out.println(super.getName() + " - " + o.getName());
        if (super.getAge() == o.getAge()) {
            if (id == o.id)
                return 0;
            if (id > o.id)
                return 1;
            else
                return -1;
            // return 0;
        }

        if (super.getAge() > o.getAge())
            return 1;
        else
            return -1;
    }
}
