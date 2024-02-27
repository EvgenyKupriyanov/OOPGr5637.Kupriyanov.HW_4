package Domain;

public class Teacher<V,M> extends WorkingPerson<V,M> {
    private V acadDegree;

    public Teacher(V firstName, M age, V acadDegree) {
        super(firstName, age);
        this.acadDegree = acadDegree;
    }


    @Override
    public String toString() {
        return super.toString() +
                ", ученая степень / звание: " + acadDegree;
    }

    public V getAcadDegree() {
        return acadDegree;
    }
}
