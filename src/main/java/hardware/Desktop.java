package hardware;

public class Desktop extends Computer {
    private String keyboardcompanyname;
    private String screentype;

    public Desktop(int id, String companyname, String keyboardcompanyname, String screentype) {
        super(id, companyname);
        this.keyboardcompanyname = keyboardcompanyname;
        this.screentype = screentype;
    }

    public Desktop(String keyboardcompanyname, String screentype) {
        this.keyboardcompanyname = keyboardcompanyname;
        this.screentype = screentype;
    }

    public String getKeyboardcompanyname() {
        return keyboardcompanyname;
    }

    public void setKeyboardcompanyname(String keyboardcompanyname) {
        this.keyboardcompanyname = keyboardcompanyname;
    }

    public String getScreentype() {
        return screentype;
    }

    public void setScreentype(String screentype) {
        this.screentype = screentype;
    }
}
