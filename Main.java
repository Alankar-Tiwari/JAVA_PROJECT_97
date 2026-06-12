import java.util.Scanner;
//student class
class Student {
    private String name;//student name
    private int[] marks;//array to store

    // Constructor
    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    // Method to calculate average
    public double calculateAverage() {
        int sum = 0;
        //calculate total marks
        for (int m : marks) {
            sum += m;
        }
        //return average
        return (double) sum / marks.length;
    }

    // Method to assign grade on average
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
        //display all marks
        System.out.print("Marks: ");
        for (int m : marks) {
            System.out.print(m + " ");
        }
        //display average and grade
        double avg = calculateAverage();
        System.out.println("\nAverage: " + avg);
        System.out.println("Grade: " + assignGrade());
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input student name
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        //input number of subjects
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        //create array for marks
        int[] marks = new int[n];
        //input marks
        System.out.println("Enter marks:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        //create student object
        Student s1 = new Student(name, marks);
        //display result
        System.out.println("\n--- Student Details ---");
        s1.displayDetails();
    }
}
