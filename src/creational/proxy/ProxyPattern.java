package creational.proxy;

public class ProxyPattern {
    public static void main(String[] args) {
        Shape square = new Square(5, 6);
        square.draw();
        Shape squareClone = square.clonShape();
        squareClone.draw();

        Shape rectangle = new Rectangle(7,8);
        rectangle.draw();
        Shape rectangleClone = rectangle.clonShape();
        rectangleClone.draw();
    }
}
