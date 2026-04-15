import java.util.Scanner;

class Student {
    private String name;
    private int[] marks;

    // Constructor
    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    // Method to calculate average
    public double calculateAverage() {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return (double) sum / marks.length;
    }

    // Method to assign grade
    public String assignGrade() {
        double avg = calculateAverage();

        if (avg >= 90) return "A";
        else if (avg >= 75) return "B";
        else if (avg >= 60) return "C";
        else if (avg >= 50) return "D";
        else return "F";
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Student Name: " + name);

        System.out.print("Marks: ");
        for (int m : marks) {
            System.out.print(m + " ");
        }

        double avg = calculateAverage();
        System.out.println("\nAverage: " + avg);
        System.out.println("Grade: " + assignGrade());
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        System.out.println("Enter marks:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        Student s1 = new Student(name, marks);

        System.out.println("\n--- Student Details ---");
        s1.displayDetails();
    }
}