package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    Map<String, Shape> shapes;

    public ShapeFactory(){
        shapes = new HashMap<>();
    }

    public Shape getRectangle(String color){
        if(shapes.containsKey(color)){
            return shapes.get(color);
        }
        System.out.println("Creating new Rectangle >> ");
        Shape shape = new Rectangle(color);
        shapes.put(color, shape);
        return shape;
    }
}
