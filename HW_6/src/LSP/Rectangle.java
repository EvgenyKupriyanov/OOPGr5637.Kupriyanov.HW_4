package LSP;
// Класс прямоугольника
public class Rectangle {
    private int width;
    private int height;


    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int area(Rectangle rectangle) {
        return rectangle.getHeight() * rectangle.getWidth();
    }
}
