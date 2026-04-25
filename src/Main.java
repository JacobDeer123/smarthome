public class Main {
    public static void main(String[] args) {
        try{
            SmartDevice sm = new SmartDevice.Builder("10", "witam").withmacAddress("10").build();
            System.out.println(sm.getId() + "  " + sm.getRoom() + " " + sm.getMacAddress());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}