public class SmartHomeFacade {
    private HomeHub homeHub;

    public SmartHomeFacade(HomeHub homeHub) {
        this.homeHub = homeHub;
    }

    public void goodNightRoutine() {
        System.out.println("Uruchamianie trybu: Good Night");
        for (ManageableDevice device : homeHub.getDevices()) {
            device.turnOff();
        }
    }

    public void movieMode() {
        System.out.println("Uruchamianie trybu: Movie Mode");
        for (ManageableDevice device : homeHub.getDevices()) {
            device.turnOff();
        }
    }
}