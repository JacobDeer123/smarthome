public class MovingState implements BlindState {
    @Override
    public void open(SmartBlind blind) { System.out.println("Ignoruję: roleta jest aktualnie w ruchu."); }

    @Override
    public void close(SmartBlind blind) { System.out.println("Ignoruję: roleta jest aktualnie w ruchu."); }

    @Override
    public void stop(SmartBlind blind) {
        System.out.println("Awaryjne zatrzymywanie rolety...");
        blind.setState(new OpenedState());
    }
}