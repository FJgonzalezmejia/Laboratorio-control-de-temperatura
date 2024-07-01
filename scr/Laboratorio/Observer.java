// Interfaz Observer
public interface Observer {
    void update(int temperature);
}

// Interfaz Subject
public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(int temperature);
}
