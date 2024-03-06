import java.util.Objects;
import java.util.Scanner;

public class View {


    private iCalculat calculat;
    public View(iCalculat calculat) {
        this.calculat = calculat;
    }

    // В начале закомментирован экземпляр класс калькулятора.
    // После ввода декоратора пришлось закомментировать. С ним в Main можно было только создать Экземпляр класс View
    // и вызвать метод run().
    void run(){
        boolean start = true;
        //Calculator result = new Calculator();
        String command;
        String commandStart;
        while (start == true) {
            commandStart = enterStartCom().toUpperCase(); // Добавил перевод буквы в верхний регистр для стабильности работы.
            if (commandStart.equals("Y")) {
                System.out.println("Введите первое комплексное число.\nФормат числа - a + bi");
                int a = enterNum("\nВведите число a:");
                int b = enterNum("Введите число b:");
                System.out.println("Введите второе комплексное число.\nФормат числа - a + bi");
                int c = enterNum("\nВведите число c:");
                int d = enterNum("Введите число d:");
                command = enterSign();
                if (command.equals("+")) {
                    calculat.addit(a, b, c, d);
                }
                if (command.equals("*")) {
                    calculat.mult(a, b, c, d);
                }
                if (command.equals("/")) {
                    calculat.division(a, b, c, d);
                }
                if (command.equals("-")) {
                    calculat.subtr(a, b, c, d);
                }
                // Создал условие для ввода данных заново. Добавил рекурсию, но закоментировал ее. Она работает.
                // Но для выхода надо вводить N несколько раз.
                if (!command.equals("/"))
                    if (!command.equals("+"))
                        if (!command.equals("*"))
                            if (!command.equals("-")){
                                System.out.println("Ошибка ввода");
                                //run();
                            }
            }
            if (commandStart.equals("N")) {
                System.out.println("Работа завершена!");
                start = false;
            }
            // Создал условие для ввода комнады старта заново.
            if (!commandStart.equals("N"))
                if (!commandStart.equals("Y")){
                    System.out.println("Ошибка ввода");
                    //run();
                }
        }
    }
        //Тут классический ввод числа. В случае если не число, то приложение вылетает.

//    public int enterNum(String name){
//        Scanner num = new Scanner(System.in);
//        System.out.println(name);
//        return num.nextInt();
//    }
    //Тут попытался сделать вывод, что б можно было ошибится при вводе и ввести заново.
    public int enterNum(String name) {
        Scanner num = new Scanner(System.in);
        System.out.println(name);
        String b = num.nextLine();
        String pattern = "\\d+";
        boolean isMatch = b.matches(pattern);
        if (!isMatch) {
            System.out.println("Ошибка ввода");
            return enterNum("Введите заново число:");
        }
        return Integer.parseInt(b);
    }




    public String enterSign(){
        Scanner sign = new Scanner(System.in);
        System.out.println("Введите одно из арифметическмх действий - (+), (-), (*), (/)");
        return sign.nextLine();
    }
    public String enterStartCom(){
        Scanner sign = new Scanner(System.in);
        System.out.println("Введите команду:\n Y - начало работы\n N - завершить");
        return sign.nextLine();
    }

}
