public class Main {
    public static void main(String[] args) {
        // Crear una instancia de WeatherStation
        WeatherStation weatherStation = new WeatherStation();

        // Crear instancias de los observadores y agregarlos a la estación meteorológica
        Observer tempDisplay = new TemperatureDisplay();
        Observer weatherWarning = new WeatherWarning();

        weatherStation.addObserver(tempDisplay);
        weatherStation.addObserver(weatherWarning);

        // Cambiar la temperatura de la estación dos veces
        weatherStation.setTemperature(25);
        weatherStation.setTemperature(35);
    }
}
