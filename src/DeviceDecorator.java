public abstract class DeviceDecorator implements ManageableDevice {
    protected ManageableDevice wrappedDevice;

    public DeviceDecorator(ManageableDevice wrappedDevice) {
        this.wrappedDevice = wrappedDevice;
    }

    @Override
    public void turnOn() { wrappedDevice.turnOn(); }

    @Override
    public void turnOff() { wrappedDevice.turnOff(); }

    @Override
    public String getStatus() { return wrappedDevice.getStatus(); }

    @Override
    public String getId() { return wrappedDevice.getId(); }

    @Override
    public String getMacAddress() { return wrappedDevice.getMacAddress(); }
}