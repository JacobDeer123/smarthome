public class Main {
    public static void main(String[] args) {
        try {
            ManageableDevice bulb = DeviceFactory.createLivingRoomBulb("1", "zarowka1");

            ManageableDevice energyMonitoredBulb = new EnergyMonitoringDecorator(bulb);

            HomeHub hub = HomeHub.getInstance();
            hub.registerDevice(energyMonitoredBulb);

            energyMonitoredBulb.turnOn();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}