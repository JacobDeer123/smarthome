import java.util.ArrayList;
import java.util.List;

public class MotionSensor {
    private String id;
    private List<SensorObserver> observers = new ArrayList<>();

    public MotionSensor(String id) {
        this.id = id;
    }

    public void attach(SensorObserver observer) {
        observers.add(observer);
    }

    public void detach(SensorObserver observer) {
        observers.remove(observer);
    }

    public void detectMotion() {
        System.out.println("[Czujnik " + id + "]: Wykryto ruch!");
        for (SensorObserver observer : observers) {
            observer.onSensorTriggered(this.id, "Aktywność w strefie monitorowanej.");
        }
    }
}