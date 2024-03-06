//Создан Decorator с целью ввода Logger.
public class Decorator implements iCalculat{
    Calculator dec;
    Logger logger;

    public Decorator(Calculator dec, Logger logger) {
        this.dec = dec;
        this.logger = logger;
    }

    @Override
    public void addit(int a, int b, int c, int d) {
        int first = a + c;
        int second = b + d;
        logger.log(String.format("Введены значения первого комплесного числа (%d + %d) и второго комлексного числа (%d + %di).", a, b, c, d));
        System.out.println("Результат: " + first + " + " + second + "i");
        logger.log("Получен результат сложения.");
    }

    public void subtr(int a, int b, int c, int d) {
        int first = a - c;
        int second = b - d;
        logger.log(String.format("Введены значения первого комплесного числа (%d + %d) и второго комлексного числа (%d + %di).", a, b, c, d));
        System.out.println("Результат: " + first + " + " + second + "i");
        logger.log("Получен результат вычитания.");
    }

    @Override
    public void mult(int a, int b, int c, int d) {
        int first = a * c - b * d;
        int second = b * c + a * d;
        logger.log(String.format("Введены значения первого комплесного числа (%d + %d) и второго комлексного числа (%d + %di).", a, b, c, d));
        System.out.println("Результат: " + first + " + " + second + "i");
        logger.log("Получен результат умножения.");
    }

    @Override
    public void division(int a, int b, int c, int d) {
        double first = (double) (a * c + b * d) / (c * c + d * d);
        double second = (double) (b * c - a * d) / (c * c + d * d);
        logger.log(String.format("Введены значения первого комплесного числа (%d + %d) и второго комлексного числа (%d + %di).", a, b, c, d));
        System.out.println("Результат: " + first + " + " + second + "i");
        logger.log("Получен результат деления.");
    }
}
