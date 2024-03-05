package OCP;
//Класс наследник Vehicle
public class Bus extends Vehicle{
    int maxSpeed;
    public Bus(String type, int maxSpeed) {
        super(type);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }
}

