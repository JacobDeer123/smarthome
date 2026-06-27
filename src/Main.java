public class Main {
    public static void main(String[] args) {
        try{
            SmartDevice sm = new SmartDevice.Builder("10", "witam1").withmacAddress("10").build();
            System.out.println(sm.getId() + "  " + sm.getRoom() + " " + sm.getMacAddress());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}