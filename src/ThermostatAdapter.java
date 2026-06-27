public class ThermostatAdapter implements ManageableDevice {
    private LegacyThermostat legacyThermostat;
    private String id;
    private String macAddress;

    public ThermostatAdapter(String id, String macAddress, LegacyThermostat legacyThermostat) {
        this.id = id;
        this.macAddress = macAddress;
        this.legacyThermostat = legacyThermostat;
    }

    @Override
    public void turnOn() {
        legacyThermostat.enableHeating();
    }

    @Override
    public void turnOff() {
        legacyThermostat.disableHeating();
    }

    @Override
    public String getStatus() {
        return "Stary termostat, obecna temperatura: " + legacyThermostat.fetchCurrentTemperature() + "°C";
    }

    @Override
    public String getId() { return id; }

    @Override
    public String getMacAddress() { return macAddress; }
}