// Observador concreto TemperatureDisplay
public class TemperatureDisplay implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("Temperature Display: Current temperature is " + temperature);
    }
}

// Observador concreto WeatherWarning
public class WeatherWarning implements Observer {
    @Override
    public void update(int temperature) {
        if (temperature > 30) {
            System.out.println("Weather Warning: High temperature alert! Temperature is " + temperature);
        }
    }
}
