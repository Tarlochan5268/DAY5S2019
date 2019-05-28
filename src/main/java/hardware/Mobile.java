package hardware;

public class Mobile extends Computer {
    private String operatingSystemName;
    private boolean canMakeCall;
    private String providerName; //Rogers , Bell , TELUS

    public Mobile() {
    }

    public Mobile(int id, String companyname, String operatingSystemName, boolean canMakeCall, String providerName) {
        super(id, companyname);
        this.operatingSystemName = operatingSystemName;
        this.canMakeCall = canMakeCall;
        this.providerName = providerName;
    }

    public Mobile(String operatingSystemName, boolean canMakeCall, String providerName) {
        this.operatingSystemName = operatingSystemName;
        this.canMakeCall = canMakeCall;
        this.providerName = providerName;
    }

    public String getOperatingSystemName() {
        return operatingSystemName;
    }

    public void setOperatingSystemName(String operatingSystemName) {
        this.operatingSystemName = operatingSystemName;
    }

    public boolean isCanMakeCall() {
        return canMakeCall;
    }

    public void setCanMakeCall(boolean canMakeCall) {
        this.canMakeCall = canMakeCall;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }
}
