import java.util.Scanner;

public class Student {
    private String name;
    private int roll;
    private int[] marks;
    private int numSubjects;

    public Student(int roll, String name, int numSubjects) {
        this.roll = roll;
        this.name = name;
        this.numSubjects = numSubjects;
        this.marks = new int[numSubjects];
    }

    public void inputMarks(Scanner scanner) {
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
    }

    public int calculateTotalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public double calculatePercentage() {
        return (double) calculateTotalMarks() / numSubjects;
    }

    public String getGrade() {
        double percentage = calculatePercentage();
        if (percentage >= 90) return "A+";
        else if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B+";
        else if (percentage >= 60) return "B";
        else if (percentage >= 50) return "C";
        else if (percentage >= 40) return "D";
        else return "E";
    }

    public void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Marks: ");
        for (int i = 0; i < numSubjects; i++) {
            System.out.println("  Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Total Marks: " + calculateTotalMarks());
        System.out.println("Percentage: " + String.format("%.2f", calculatePercentage()) + "%");
        System.out.println("Grade: " + getGrade());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        int roll = scanner.nextInt();

        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();

        Student student = new Student(roll, name, numSubjects);

        student.inputMarks(scanner);

        student.displayDetails();

        scanner.close();
    }
}