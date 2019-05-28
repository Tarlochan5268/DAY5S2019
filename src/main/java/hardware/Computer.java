package hardware;

public class Computer
{
    private int id;
    private String companyname;

    public Computer(int id, String companyname) {
        this.id = id;
        this.companyname = companyname;
    }

    public Computer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public void displayComputerDetails()
    {
        System.out.println(" Computer Id : "+getId());
        System.out.println(" Company Name : "+getCompanyname());
    }
}
