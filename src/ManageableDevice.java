public interface ManageableDevice {
    void turnOn();
    void turnOff();
    String getStatus();

    String getId();
    String getMacAddress();
}