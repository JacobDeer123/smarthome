import java.time.LocalDateTime;

public class EnergyMonitoringDecorator extends DeviceDecorator {

    public EnergyMonitoringDecorator(ManageableDevice wrappedDevice) {
        super(wrappedDevice);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("[MONITORING ENERGII]: Urządzenie (ID: " + getId() + ") uruchomione o " + LocalDateTime.now());
    }
}