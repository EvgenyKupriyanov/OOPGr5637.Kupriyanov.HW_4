package DIP;
//Класс дизельного двигателя
public class DieselEngine implements iEngine {
    String engine;
    public DieselEngine(String engine) {
        this.engine = engine;
    }
    public void start() {
        System.out.println("Дизельный двигатель включен");
    }
    public String getEngineType() {
        return engine;
    }
}
