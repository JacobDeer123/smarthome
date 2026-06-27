public class ThermostatAdapter implements ManageableDevice {
    private LegacyThermostat legacyThermostat;
    private String id;
    private String macAddress;
    private HeatingStrategy currentStrategy;

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

    public void setStrategy(HeatingStrategy strategy) {
        this.currentStrategy = strategy;
    }

    public void adjustTemperature(boolean isSomeoneHome) {
        if (currentStrategy != null) {
            double target = currentStrategy.calculateTargetTemperature(legacyThermostat.fetchCurrentTemperature(), isSomeoneHome);
            System.out.println("Ustawiam temperaturę na podstawie strategii: " + target + "°C");
        } else {
            System.out.println("Strategia grzewcza nie została ustawiona.");
        }
    }

    @Override
    public void accept(DeviceVisitor visitor) {
        visitor.visit(this);
    }
}