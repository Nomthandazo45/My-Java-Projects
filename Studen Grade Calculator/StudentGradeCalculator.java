import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // asking marks obtained in each subject
        System.out.print("Enter marks obtained in biology: ");
        int biologyMarks = scanner.nextInt();

        System.out.print("Enter marks obtained in geography: ");
        int geographyMarks = scanner.nextInt();

        System.out.print("Enter marks obtained in chemistry: ");
        int chemistryMarks = scanner.nextInt();

        scanner.close();
        
        // setting up values
        int totalMarks = biologyMarks + geographyMarks + chemistryMarks + ...;
        int numberOfSubjects = 3; // Assuming there are 3 subjects
        double averagePercentage = (double) totalMarks / numberOfSubjects;

        String grade;
        // giving grades to percentages
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade: " + grade);
    }
}
