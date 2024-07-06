package creational.proxy;

public class Square extends Shape{

    public Square(int width, int height) {
        super(width, height);
    }

    @Override
    public void draw() {
        System.out.println("Square width : "+width+" height : "+height);
    }

    @Override
    public Shape clonShape() {
       return new Square(width, height);
    }


    
}
