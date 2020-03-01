public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ThirdPartyDisplay third = new ThirdPartyDisplay(weatherData);
        weatherData.setMeasurements(80,45,30.4f);
        weatherData.setMeasurements(80,42,55.4f);

    }
}
