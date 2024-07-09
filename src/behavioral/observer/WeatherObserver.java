package observer;

public class WeatherObserver implements Observer {
    private int pressure;
    private int humidity;
    private int temperature;
    private Subject subject;

    public WeatherObserver(Subject subject){
        this.subject = subject;
        this.subject.addObserver(this);
    }


    @Override
    public void update(int pressure, int humidity, int temperature) {
       this.pressure = pressure;
       this.temperature = temperature;
       this.humidity = humidity;
        show();
    }

    public void show(){
        System.out.println("Pressure : "+this.pressure+" temprature : "+this.temperature+" humidity : "+this.humidity);
    }
    
}
