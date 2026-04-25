public class SmartDevice {
    private String id;
    private String name;
    private String room;
    private String macAddress;
    private double firmwareVersion;

    private SmartDevice(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.room = builder.room;
        this.macAddress = builder.macAddress;
        this.firmwareVersion = builder.firmwareVersion;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRoom() {
        return room;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public double getFirmwareVersion() {
        return firmwareVersion;
    }

    public static class Builder{
        private String id;
        private String name;
        private String room = "lazienka";
        private String macAddress = "12:34:34:62:87:45:87:98:22";
        private double firmwareVersion = 0.0;

        public Builder(String id, String name){
            this.id = id;
            this.name = name;
        }

        public Builder withRoom(String room){
            this.room=room;
            return this;
        }

        public Builder withmacAddress(String macAddress) throws InvalidMacAddressException{
            if (macAddress.length() < 17 || !macAddress.contains(":")){
                throw new InvalidMacAddressException("blad adresu MAC");
            }
            this.macAddress = macAddress;
            return this;
        }

        public Builder withFirmwareVersion(double firmwareVersion){
            this.firmwareVersion=firmwareVersion;
            return this;
        }

        public SmartDevice build(){
            return new SmartDevice(this);
        }
    }


}
