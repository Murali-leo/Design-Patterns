package solidprinciples.interfacesegregation;
/*
 * IntegrationSegregation.java
 * 
 * Software modules should not be to depend upon interfaces that they do not use.
 * In Java a given class may implement as many interfaces as we want.
 * 
 */
public class IntegrationSegregation {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.salary();

        Manager manager = new Manager();
        manager.addBonus();
        manager.hire();
        manager.salary();
        manager.train();

        CEO ceo = new CEO();
        ceo.addBonus();
        ceo.addStocks();
        ceo.makeDecisions();
        ceo.salary();
    }
    
}
