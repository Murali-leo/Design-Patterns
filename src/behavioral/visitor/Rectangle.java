package visitor;

public class Rectangle implements Shape{

    @Override
    public void accept(VisitorPattern vistor) {
        vistor.saveRectangle(this);
    }
    
}
