package Domain;

public class Employee<V,M> extends WorkingPerson<V,M> {
    private V special;



    public Employee(V name, M age, V special) {
        super(name, age);
        this.special = special;
    }


    @Override
    public String toString() {
        return super.toString() +
                ", специальность: " + special;
    }

    public V getSpecial() {
        return special;
    }
}
