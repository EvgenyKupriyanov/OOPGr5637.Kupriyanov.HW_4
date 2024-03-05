package LSP;
// Класс квадрата
public class Square extends Rectangle {

    public void areaSqrt(Square square) {
        if (square.getHeight() == square.getWidth()){
            System.out.println("Площадь квадрата - " + square.getHeight() * square.getHeight());
        }
        else{
            System.out.println("Ошибка ввода");
        }

    }

}
