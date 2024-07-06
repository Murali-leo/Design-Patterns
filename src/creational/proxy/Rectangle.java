package creational.proxy;

public class Rectangle extends Shape {

    public Rectangle(int width, int height) {
        super(width, height);
    }

    @Override
    public void draw() {
        System.out.println("Rectangle width : "+width+" height : "+height);
    }

    @Override
    public Shape clonShape() {
       return new Rectangle(width, height);
    }

    
}
