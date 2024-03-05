package DIP;
//Конструктор машины. Собираем машину с двигателем и заводим.
public class CarStart {
    private iEngine engine;
    private String name;
    public CarStart(String name, iEngine engine) {
        this.engine = engine;
        this.name = name;
    }
    public void start() {
        this.engine.start();
    }

    @Override
    public String toString() {
        return name + " двигатель " + engine.getEngineType() + '.';
    }
}
