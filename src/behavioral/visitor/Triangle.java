package visitor;

public class Triangle implements Shape{

    @Override
    public void accept(VisitorPattern vistor) {
        vistor.saveTriangle(this);
    }
    
}
