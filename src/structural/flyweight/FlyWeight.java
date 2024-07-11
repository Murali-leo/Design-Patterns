package structural.flyweight;

import java.util.Random;
public class FlyWeight {

    private ShapeFactory shapeFactory;
    private Random random;
    private String[] color = {"Red", "Green", "Blue"};

    public FlyWeight(){
        shapeFactory = new ShapeFactory();
        random = new Random();
    }

    public void run(){
        for(int i = 0; i <= 30; i++){
            Rectangle rectangle = (Rectangle) shapeFactory.getRectangle(getRandomColor());
            rectangle.setLength(getCoordinates());
            rectangle.setBreadth(getCoordinates());
            rectangle.draw();
        }
    }

    private int getCoordinates() {
        return random.nextInt(50);
    }

    private String getRandomColor() {
        return color[random.nextInt(color.length)];
    }

    
}
