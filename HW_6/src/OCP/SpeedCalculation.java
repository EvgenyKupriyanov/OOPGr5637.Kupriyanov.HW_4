package OCP;
//Метод для расчета скорости. Убрал использование конкретного класса. Переписал на примитивы входных данных.
public class SpeedCalculation {
    public double calculateAllowedSpeed(String type, int maxSpeed) {
        if (type.equalsIgnoreCase("Car")) {
            return maxSpeed * 0.8;
        } else if (type.equalsIgnoreCase("Bus")) {
            return maxSpeed * 0.6;
        }
        return 0.0;
    }
}
