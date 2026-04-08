import java.util.Scanner;

public class CGPACalculator {
    static byte gradePoint(char grade) {
        switch (grade) {
            case 'A':
                return 5;
            case 'B':
                return 4;
            case 'C':
                return 3;
            case 'D':
                return 2;
            case 'E':
                return 1;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner result = new Scanner(System.in);
        System.out.println("Enter the Student's name or matric number: ");
        String name = result.nextLine();
        System.out.println("Enter the number of courses: ");
        int courses = result.nextInt();

        int totalCoursePoints = 0;
        int totalCreditUnits = 0;

        for (int i = 1;  i <= courses; i++) {
            System.out.println("Enter the credit unit for course " + i + ": ");
            int creditUnit = result.nextInt();
            System.out.println("Enter the student's grade for course " + i + ": ");
            char grade = result.next().charAt(0);
            char gradeUpper = Character.toUpperCase(grade);

            totalCoursePoints += (creditUnit * gradePoint(gradeUpper));
            totalCreditUnits += creditUnit;
        }

        double cgpa = (double) totalCoursePoints / (double) totalCreditUnits;
        System.out.printf("The CGPA of %s is %.2f", name, cgpa);
    }
}
