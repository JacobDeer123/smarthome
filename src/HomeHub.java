import java.util.ArrayList;
import java.util.List;

public class HomeHub {
    private List<SmartDevice> devices = new ArrayList<>();
    private static HomeHub instance = new HomeHub();

    private HomeHub(){

    }

    public static HomeHub getInstance() {
        return instance;
    }

    public void registerDevice(SmartDevice device) throws DuplicateDeviceException{
        for (SmartDevice smartDevice : devices) {
            if (smartDevice.getMacAddress() == device.getMacAddress() || smartDevice.getId() == device.getId()){
                throw new DuplicateDeviceException("jest juz takie urzadzenie o takim adresie ip lub MAC");
            }
        }
        devices.add(device);
    }
}
