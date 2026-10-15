import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        while (true) {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    updateStudent();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    System.out.println("Exiting... Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    // 1. Add Student
    static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        // Check duplicate ID
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("Student ID already exists!");
                return;
            }
        }

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Year: ");
        int year = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();

        students.add(new Student(id, name, dept, year, phone));
        System.out.println("Student Added Successfully!");
    }

    // 2. View Students
    static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found!");
        } else {
            System.out.println("\n--- Student List ---");
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    // 3. Search Student
    static void searchStudent() {
        System.out.print("Enter Student ID to search: ");
        int id = sc.nextInt();

        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("Student Found: " + s);
                return;
            }
        }
        System.out.println("Student not found!");
    }

    // 4. Update Student
    static void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Student s : students) {
            if (s.getId() == id) {
                System.out.print("Enter New Name: ");
                String name = sc.nextLine();

                System.out.print("Enter New Department: ");
                String dept = sc.nextLine();

                System.out.print("Enter New Year: ");
                int year = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter New Phone: ");
                String phone = sc.nextLine();

                s.setName(name);
                s.setDepartment(dept);
                s.setYear(year);
                s.setPhone(phone);

                System.out.println("Student Updated Successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    // 5. Delete Student
    static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt();

        for (Student s : students) {
            if (s.getId() == id) {
                students.remove(s);
                System.out.println("Student Deleted Successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }
}