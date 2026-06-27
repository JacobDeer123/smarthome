public class DiagnosticsVisitor implements DeviceVisitor {
    private StringBuilder reportBuilder = new StringBuilder();

    @Override
    public void visit(SmartDevice device) {
        reportBuilder.append(" [SmartDevice - ").append(device.getName())
                .append("] MAC: ").append(device.getMacAddress())
                .append(" | Wersja Firmware: ").append(device.getFirmwareVersion())
                .append("\n");
    }

    @Override
    public void visit(ThermostatAdapter thermostat) {
        reportBuilder.append(" [Termostat - ").append(thermostat.getId())
                .append("] ").append(thermostat.getStatus())
                .append("\n");
    }

    @Override
    public void visit(SmartBlind blind) {
        reportBuilder.append(" [Inteligentna Roleta - ").append(blind.getId())
                .append("] ").append(blind.getStatus())
                .append("\n");
    }

    public String getFullReport() {
        return reportBuilder.toString();
    }
}