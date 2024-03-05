import DIP.CarStart;
import DIP.DieselEngine;
import DIP.PetrolEngine;
import ISP.Circle;
import ISP.Cube;
import LSP.Rectangle;
import LSP.Square;
import OCP.Bus;
import OCP.Car;
import OCP.SpeedCalculation;
import SRP.Calculate;
import SRP.Employee;

import java.util.Date;

public class Main {
    public static void main(String[] args) {


        System.out.println("_____________Задание 1__________________");
        //Задание 1. Переписать код в соответствии с Single Responsibility Principle.
        //Подсказка: вынесите метод calculateNetSalary() в отдельный класс

        //Разделил калькулятор и сотрудника по разным методам. Теперь можем изменять или добавлять
        //новый класс сотрудника и считать зарпату без имзения кода калькулятора.
        Date date = new Date();
        Employee worker1 = new Employee("Vova",date, 20000);
        System.out.println(worker1.getEmpInfo());
        Calculate calc = new Calculate();
        calc.calculateNetSalary(worker1.getBaseSalary());
        System.out.println("________________________________________");



        System.out.println("_____________Задание 2__________________");
        //Задание 2. Переписать код SpeedCalculation в соответствии с Open-Closed Principle.
        //Подсказка: создайте два дополнительных класса Car и Bus(наследников Vehicle), напишите
        //метод calculateAllowedSpeed(). Использование этого метода позволит сделать класс
        //SpeedCalculation соответствующим OCP

        //Создал метод для расчета скорости. В методе сделал вход для двух значений.
        //Это обеспечит универсальность в какой-степени, то есть теперь мы не зависим от
        //класса исходных данных, только сами значения.
        Car car1 = new Car("car", 200);
        Bus bus1 = new Bus("bus", 120);
        Car moto1 = new Car("moto", 180);

        SpeedCalculation calcCar = new SpeedCalculation();
        SpeedCalculation calcBus = new SpeedCalculation();
        SpeedCalculation calcMoto = new SpeedCalculation();

        System.out.println("MaxSpeed car = " + calcCar.calculateAllowedSpeed(car1.getType(), car1.getMaxSpeed()));
        System.out.println("MaxSpeed bus = " + calcBus.calculateAllowedSpeed(bus1.getType(), bus1.getMaxSpeed()));
        System.out.println("MaxSpeed moto = " + calcMoto.calculateAllowedSpeed(moto1.getType(), moto1.getMaxSpeed()));
        System.out.println("________________________________________");



        System.out.println("_____________Задание 3__________________");
        //Задание 3. Переписать код в соответствии с Interface Segregation Principle.
        //Подсказка: круг не объемная фигура и этому классу не нужен метод volume().

        //Разделил интерфейсы на два Volume и Area.
        //Area отвечает за площадь (применима для всех),
        //Volume отвечате за объем (только куб).
        Circle circ = new Circle(23);
        Cube cube = new Cube(7);

        System.out.println("Cube - area: " + cube.area() + "; volume: " + cube.volume() + ".");
        System.out.println("Circle - area: " + circ.area());
        System.out.println("________________________________________");



        System.out.println("_____________Задание 4__________________");
        //Задание 4. Переписать код в соответствии с Liskov Substitution Principle.
        //Сделал два разных класса. Из класса Square убрал, все кроме расчета площади.
        //Для квадрата использовал только высоту. Можно и ширину, это не принципально.
        // Правильнее там делать проверку для защиты от ввода разных чисел.

        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        rectangle.setWidth(10);
        rectangle.setHeight(6);

        square.setWidth(10);
        square.setHeight(10);

        System.out.println("Площадь прямоугольника - " + square.area(rectangle));
        square.areaSqrt(square);

        System.out.println("________________________________________");



        System.out.println("_____________Задание 5__________________");
        //Задание 5. Переписать код в соответствии с Dependency Inversion Principle.
        //Разорвать зависимость классов Car и PetrolEngine. У машины же может быть DieselEngine.

        //Разрыв машиы и двигателя достиг созданием двух классов дивгателей.
        //Теперь можно в машину добавлять любой двигатель, а также можно создать дополнительный тип двигателя.
        DieselEngine dt = new DieselEngine("Diesil 3.0");
        PetrolEngine pt = new PetrolEngine("Petrol 2.0");

        CarStart car11 = new CarStart("BMW", dt);
        CarStart car12 = new CarStart("AUDI", pt);

        System.out.println(car11);
        car11.start();
        System.out.println(car12);
        car12.start();
        System.out.println("________________________________________");






    }
}