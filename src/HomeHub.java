import java.util.ArrayList;
import java.util.List;

public class HomeHub {
    private List<ManageableDevice> devices = new ArrayList<>();
    private static HomeHub instance = new HomeHub();

    private HomeHub(){}

    public static HomeHub getInstance() {
        return instance;
    }

    public void registerDevice(ManageableDevice device) throws DuplicateDeviceException {
        for (ManageableDevice manageableDevice : devices) {
            if (manageableDevice.getMacAddress().equals(device.getMacAddress()) || manageableDevice.getId().equals(device.getId())){
                throw new DuplicateDeviceException("Jest juz takie urzadzenie o takim adresie ip lub MAC");
            }
        }
        devices.add(device);
    }

    public List<ManageableDevice> getDevices() {
        return devices;
    }

    public List<ManageableDevice> getDevicesByRoom(String room){
        return devices;
    }
}