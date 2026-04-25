import java.util.ArrayList;
import java.util.List;

public class HomeHub {
    private List<Object> devices = new ArrayList<>();
    private static HomeHub instance = new HomeHub();

    private HomeHub(){

    }

    public static HomeHub getInstance() {
        return instance;
    }
}
