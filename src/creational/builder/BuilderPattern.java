package creational.builder;

public class BuilderPattern {

    public static void main(String[] args) {
        Student student = new Student.Builder("Nani","JNTUK").age(22).build();
        System.out.println(student);
    }
    
}
