import java.util.Scanner;

public class CGPA_Calculator {
    static byte gradePoint(char grade) {
        if  (grade == 'A' || grade == 'a') return 5;
        else if (grade == 'B' || grade == 'b') return 4;
        else if (grade == 'C' || grade == 'c') return 3;
        else if (grade == 'D' || grade == 'd') return 2;
        else if (grade == 'E' || grade == 'e') return 1;
        else return 0;
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

            totalCoursePoints += (creditUnit * gradePoint(grade));
            totalCreditUnits += creditUnit;
        }

        double cgpa = (double) totalCoursePoints / (double) totalCreditUnits;
        System.out.println("The CGPA of " + name + " is " + cgpa );
    }
}
