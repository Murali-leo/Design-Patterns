package visitor;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
    List<Shape> name = new ArrayList<>();
        name.add(new Circle());
        name.add(new Rectangle());
        name.add(new Triangle());
    VisitorPattern save = new CSVFile();
    for(Shape shape : name){
        shape.accept(save);
    }
    }
}
