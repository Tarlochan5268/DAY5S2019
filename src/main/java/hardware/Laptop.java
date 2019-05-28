package hardware;

public class Laptop extends Computer
{
    private String screensize;
    private Float weight;

    public Laptop() {
    }

    public Laptop(int id, String companyname, String screensize, Float weight) {
        super(id, companyname);
        this.screensize = screensize;
        this.weight = weight;
    }

    public Laptop(String screensize, Float weight) {
        this.screensize = screensize;
        this.weight = weight;
    }

    public String getScreensize() {
        return screensize;
    }

    public void setScreensize(String screensize) {
        this.screensize = screensize;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }
}
