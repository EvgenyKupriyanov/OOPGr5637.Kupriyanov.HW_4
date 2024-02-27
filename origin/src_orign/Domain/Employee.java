package Domain;

public class Employee extends WorkingPerson {
    private String special;



    public Employee(String name, int age, String special) {
        super(name, age);
        this.special = special;
    }


    @Override
    public String toString() {
        return super.toString() +
                ", специальность: " + special;
    }

    public String getSpecial() {
        return special;
    }
}
