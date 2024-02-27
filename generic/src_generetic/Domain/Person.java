package Domain;

public class Person<V,M> {
    private V name;
    private M age;

    public Person(V name, M age) {
        this.name = name;
        this.age = age;
    }

    public V getName() {
        return name;
    }

    public void setName(V name) {
        this.name = name;
    }

    public int getAge() {
        return (int) age;
    }

    public void setAge(M age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", возраст: " + age;
    }

}
