package solidprinciples.interfacesegregation;

public class CEO implements ICEO{

    @Override
    public void salary() {
        System.out.println("Pritning Salary");
    }

    @Override
    public void makeDecisions() {
        System.out.println("Making Decisions");
    }

    @Override
    public void addStocks() {
       System.out.println("Adding Stocks");
    }

    @Override
    public void addBonus() {
       System.out.println("Giving Bonus ");
    }
    
}
