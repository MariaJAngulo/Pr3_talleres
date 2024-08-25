package co.edu.uniquindio.agendacitasfx.adendamiento_citasfx.Services;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
