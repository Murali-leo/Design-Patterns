package observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        WeatherObserver weatherObserver = new WeatherObserver(weatherStation);
        weatherStation.setPressure(100);
        weatherStation.setHumidity(200);
        weatherStation.setTemperature(300);
        weatherObserver.show();
    }
}
