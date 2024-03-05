package OCP;
//Класс наследник Vehicle
public class Car extends Vehicle {
    int maxSpeed;
    public Car(String type, int maxSpeed) {
        super(type);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }
}
