package set18.people;

public class Faculty extends Employee{

    protected String officeHours, rank;

    public Faculty(String name, String address, String phoneNumber,
                   String emailAddress, String office, double salary,
                   String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "office='" + office + '\'' +
                ", salary='" + salary + '\'' +
                ", dateHired=" + dateHired +
                ", officeHours='" + officeHours + '\'' +
                ", rank='" + rank + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
