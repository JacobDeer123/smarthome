public class ClosedState implements BlindState {
    @Override
    public void open(SmartBlind blind) {
        System.out.println("Otwieranie rolety...");
        blind.setState(new MovingState());
        blind.setState(new OpenedState());
    }
    @Override
    public void close(SmartBlind blind) { System.out.println("Roleta jest już całkowicie zamknięta."); }
    @Override
    public void stop(SmartBlind blind) { System.out.println("Roleta nie jest obecnie w ruchu."); }
}