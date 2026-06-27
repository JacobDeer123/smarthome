public class SmartBlind implements ManageableDevice {
    private BlindState state;
    private String id;
    private String macAddress;

    public SmartBlind(String id, String macAddress) {
        this.id = id;
        this.macAddress = macAddress;
        this.state = new ClosedState();
    }

    public void setState(BlindState state) {
        this.state = state;
    }

    public void openBlind() { state.open(this); }
    public void closeBlind() { state.close(this); }
    public void stopBlind() { state.stop(this); }

    @Override public void turnOn() { openBlind(); }
    @Override public void turnOff() { closeBlind(); }
    @Override public String getStatus() { return "Roleta w stanie: " + state.getClass().getSimpleName(); }
    @Override public String getId() { return id; }
    @Override public String getMacAddress() { return macAddress; }
}