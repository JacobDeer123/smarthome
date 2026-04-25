public class DeviceFactory {
    public static SmartDevice createLivingRoomBulb(String id, String name) throws InvalidMacAddressException {
        return new SmartDevice.Builder(id, name).withRoom("Living Room").withmacAddress("10:34:52:21:53:89:10:10:97").withFirmwareVersion(12.1).build();
    }

    public static SmartDevice createBasicThermostat(String id){
        return new SmartDevice.Builder(id, "Thermostat").withFirmwareVersion(1.0).build();
    }
}
