package set18.people;

public class Staff extends Employee{

    protected String title;

    public Staff(String name, String address, String phoneNumber,
                 String emailAddress, String office, double salary,
                 String title) {
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "office='" + office + '\'' +
                ", salary='" + salary + '\'' +
                ", dateHired=" + dateHired +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
