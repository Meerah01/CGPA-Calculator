import java.util.Scanner;
// CGPA = (course unit * grade unit) / total course unit
public class StudentCGPA {
    public static void main(String[] args) {
        Scanner result = new Scanner(System.in);
        System.out.println("Enter student's name: ");
        String name = result.nextLine();
        System.out.println("Enter the number of courses: ");
        int courseNumber = result.nextInt();

        int totalCoursePoint = 0;
        int totalCreditUnits = 0;

        for (int i = 1; i <= courseNumber; i++) {
            System.out.println("Enter the credit unit(s) for course " + i + ": ");
            int creditUnit = result.nextInt();
            System.out.println("Enter the grade point for course " + i + ": ");
            int gradePoint = result.nextInt();

             totalCreditUnits += creditUnit;
             totalCoursePoint += creditUnit * gradePoint;
        }
        double cgpa = (double) totalCoursePoint / (double) totalCreditUnits;

        System.out.printf("The CGPA of %s is %.2f", name, cgpa);
    }
}
