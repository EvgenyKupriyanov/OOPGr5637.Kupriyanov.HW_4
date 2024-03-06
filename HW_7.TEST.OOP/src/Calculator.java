//Создан класс калькулятора. Созданы методы (действия), которые может выполнить калькулятор.
public class Calculator implements iCalculat{
    @Override
    public void addit(int a, int b, int c, int d) {
        int first = a + c;
        int second = b + d;
        System.out.println("Результат сложения: " + first + " + " + second + "i.");
    }

    public void subtr(int a, int b, int c, int d) {
        int first = a - c;
        int second = b - d;
        System.out.println("Результат вычитания: " + first + " + " + second + "i.");
    }
    @Override
    public void mult(int a, int b, int c, int d) {
        int first = a * c - b * d;
        int second = b * c + a * d;
        System.out.println("Результат умножения: " + first + " + " + second + "i.");
    }

    @Override
    public void division(int a, int b, int c, int d) {
        double first = (double) (a * c + b * d) / (c * c + d * d);
        double second = (double) (b * c - a * d) / (c * c + d * d);
        System.out.println("Результат деления: " + first + " + " + second + "i.");
    }
}
