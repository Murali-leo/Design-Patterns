package structural.flyweight;

public class Rectangle implements Shape {
    private int length;
    private int breadth;
    private String color;

    public Rectangle(String color){
        this.color = color;
    }

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getBreadth() {
        return breadth;
    }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle with Color : "+color+" length :"+length+" breadth :"+breadth);
    }

}
