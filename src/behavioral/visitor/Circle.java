package visitor;

public class Circle implements Shape {

    @Override
    public void accept(VisitorPattern visitor) {
        visitor.saveCircle(this);
    }       
}
