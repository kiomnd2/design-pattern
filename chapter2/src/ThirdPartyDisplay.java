public class ThirdPartyDisplay implements Observer, DisplayElement{
    private WeatherData weatherData;
    private float temperature;
    private float humidity;
    private float pressure;

    public ThirdPartyDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Third temp ::" + temperature + " and " + humidity +" and " + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
