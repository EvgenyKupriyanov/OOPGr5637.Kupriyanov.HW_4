package DIP;
//Класс дизельного двигателя
public class PetrolEngine implements iEngine {
    String engine;

    public PetrolEngine(String engine) {
        this.engine = engine;
    }
    public void start() {
        System.out.println("Бензиновый двигатель включен");
    }

    public String getEngineType() {
        return engine;
    }
}
