public class Main {
    public static void main(String[] args) {
        SmartDevice sm = new SmartDevice.Builder("10", "witam").build();
        System.out.println(sm.getId() + "  " + sm.getRoom() + " " + sm.getMacAddress());
    }
}