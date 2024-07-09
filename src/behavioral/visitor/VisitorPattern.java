package visitor;

public interface VisitorPattern {
    public void saveCircle(Circle circle);
    public void saveRectangle(Rectangle rectangle);
    public void saveTriangle(Triangle triangle);
}
