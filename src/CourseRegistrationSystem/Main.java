package CourseRegistrationSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CourseRegistrationSystem system = new CourseRegistrationSystem();

        // Adding some courses to the system
        system.addCourse(new Course("CS101", " Bachelor of Technology in Computer Science and Engineering", "Computer Science Engineering", 30, "MWF 9-10AM"));
        system.addCourse(new Course("MCA201","Master of Computer Applications", "Computer Applications", 25, "TTh 11-12:30PM"));
        system.addCourse(new Course("MBA301", "Masters in Business Administration", "Business", 20, "MWF 1-2PM"));

        // Adding some students to the system
        system.addStudent(new Student("23MCA59", "Vishal Singh"));
        system.addStudent(new Student("23CS59", "Khushi singh"));
        system.addStudent(new Student("23MCA04", "Deepak kumar"));
        system.addStudent(new Student("23MCA57", "Upasna Kumari"));

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
        	
            System.out.println("\n1. List available courses");
            System.out.println("2. Register for a course");
            System.out.println("3. Drop a course");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            switch (choice) {
                case 1:
                    system.displayCourses();
                    break;
                case 2:
                    System.out.print("Enter your student ID: ");
                    String studentID = scanner.nextLine();
                    System.out.print("Enter the course code: ");
                    String courseCode = scanner.nextLine();
                    if (system.registerStudentForCourse(studentID, courseCode)) {
                        System.out.println("Course registered successfully.");
                    } else {
                        System.out.println("Registration failed. The course might be full or not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter your student ID: ");
                    studentID = scanner.nextLine();
                    System.out.print("Enter the course code: ");
                    courseCode = scanner.nextLine();
                    system.dropCourseForStudent(studentID, courseCode);
                    System.out.println("Course dropped successfully.");
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}

