package set18.people;

public class TestProgram {

    public static void main(String[] args) {

        Person person = new Person("Diego", "Mexico",
                "0888102030", "diegomail@abv.me");
        Student student = new Student("Student", "Berlin",
                "0231323334", "student@stu.net", "First semester");
        Employee employee = new Employee("Empl", "Munich",
                "0304052122", "empl@company.com", "Strass",
                5000.50);
        Faculty faculty = new Faculty("Zoe", "Plovdiv",
                "1234567890", "faculty@mail.com",
                "Ulitsa", 320.12, "9-17", "One");
        Staff staff = new Staff("John", "Varna",
                "9876543210", "nhoj@mail.bg", "Bulevard",
                1000, "Chief");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }

}
