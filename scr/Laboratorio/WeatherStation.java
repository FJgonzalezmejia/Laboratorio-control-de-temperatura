import java.util.ArrayList;
import java.util.List;

// Clase WeatherStation que implementa Subject
public class WeatherStation implements Subject {
    private List<Observer> observers;
    private int temperature;

    public WeatherStation() {
        this.observers = new ArrayList<>();
        this.temperature = 0;
    }

    @Override
    public void addObserver(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(int temperature) {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    public void setTemperature(int temperature) {
        System.out.println("Setting temperature to " + temperature);
        this.temperature = temperature;
        notifyObservers(this.temperature);
    }
}
