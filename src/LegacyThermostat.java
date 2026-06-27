public class LegacyThermostat {
    public void enableHeating() {
        System.out.println("[Legacy API] Ogrzewanie zostało włączone.");
    }

    public void disableHeating() {
        System.out.println("[Legacy API] Ogrzewanie zostało wyłączone.");
    }

    public double fetchCurrentTemperature() {
        return 22.0;
    }
}