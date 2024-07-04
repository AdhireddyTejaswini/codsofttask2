import java.util.Scanner;
public class StudentGradeCaluculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        double[] marks = new double[numSubjects];
        for (int i = 0; i < numSubjects; i++){
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextDouble();
        }

        double totalMarks = 0;
        for (double mark : marks) {
            totalMarks += mark;
        }
        double averagePercentage = totalMarks / numSubjects;

        String grade = calculateGrade(averagePercentage);

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + String.format("%.2f", averagePercentage) + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
    public static String calculateGrade(double averagePercentage){
        if (averagePercentage >= 90) {
            return "A";
        } else if (averagePercentage >= 80) {
            return "B";
        } else if (averagePercentage >= 70) {
            return "c";
        } else if (averagePercentage >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    
}
