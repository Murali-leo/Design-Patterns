package visitor;

public class CSVFile implements VisitorPattern {

    @Override
    public void saveCircle(Circle circle) {
        System.out.println("Saving circel File....");
    }

    @Override
    public void saveRectangle(Rectangle rectangle) {
        System.out.println("Saving Rectangle File....");
    }

    @Override
    public void saveTriangle(Triangle triangle) {
       System.out.println("Saving Triangle File...");
    }
    
}
