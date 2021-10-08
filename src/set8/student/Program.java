package set8.student;

public class Program {

    public static void main(String[] args) {
        Student eligible = new Student("Eli", 5.67);
        Student notEligible = new Student("Not", 4.75);

        System.out.println("Eligible: " + isStudentEligible(eligible) + "; Balance: " + eligible.balance);
        System.out.println("Not Eligible: " + isStudentEligible(notEligible) + "; Balance: " + notEligible.balance);
    }

    public static boolean isStudentEligible(Student student) {
        final double stip = 100.0;
        final double minGrade = 5.5;

        if (minGrade <= student.grade) {
            student.balance += stip;
            return true;
        }

        return false;

    }

}
