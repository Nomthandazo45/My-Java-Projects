import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // asking marks obtained in each subject
        System.out.print("Enter marks obtained in Biology: ");
        int biologyMarks = scanner.nextInt();

        System.out.print("Enter marks obtained in Geography: ");
        int geographyMarks = scanner.nextInt();

        System.out.print("Enter marks obtained in Physics: ");
        int physicsMarks = scanner.nextInt();

        System.out.print("Enter marks obtained in Mathematics: ");
        int mathematicsMarks = scanner.nextInt();

        System.out.print("Enter marks obtained in Life Orientation: ");
        int lifeorientationMarks = scanner.nextInt();

        System.out.print("Enter marks obtained in English: ");
        int englishMarks = scanner.nextInt();

        System.out.print("Enter marks obtained in Sesotho: ");
        int sesothoMarks = scanner.nextInt();

        scanner.close();
        
        // setting up values
        int totalMarks = biologyMarks + geographyMarks + physicsMarks + mathematicsMarks + lifeorientationMarks + englishMarks + sesothoMarks;
        int numberOfSubjects = 7;
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

