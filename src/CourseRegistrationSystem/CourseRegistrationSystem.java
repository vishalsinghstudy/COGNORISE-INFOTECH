package CourseRegistrationSystem;

import java.util.ArrayList;
import java.util.List;

public class CourseRegistrationSystem {
    private List<Course> courseDatabase;
    private List<Student> studentDatabase;

    public CourseRegistrationSystem() {
        courseDatabase = new ArrayList<>();
        studentDatabase = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courseDatabase.add(course);
    }

    public void addStudent(Student student) {
        studentDatabase.add(student);
    }

    public List<Course> listAvailableCourses() {
        return courseDatabase;
    }

    public boolean registerStudentForCourse(String studentID, String courseCode) {
        Student student = findStudentByID(studentID);
        Course course = findCourseByCode(courseCode);
        if (student != null && course != null) {
            return student.registerCourse(course);
        } else {
            return false;
        }
    }

    public void dropCourseForStudent(String studentID, String courseCode) {
        Student student = findStudentByID(studentID);
        Course course = findCourseByCode(courseCode);
        if (student != null && course != null) {
            student.dropCourse(course);
        }
    }

    private Student findStudentByID(String studentID) {
        for (Student student : studentDatabase) {
            if (student.getStudentID().equals(studentID)) {
                return student;
            }
        }
        return null;
    }

    private Course findCourseByCode(String courseCode) {
        for (Course course : courseDatabase) {
            if (course.getCourseCode().equals(courseCode)) {
                return course;
            }
        }
        return null;
    }

    public void displayCourses() {
        for (Course course : courseDatabase) {
            System.out.println(course.getCourseCode() + ": " + course.getTitle() + " (" + course.getAvailableSlots() + " slots available)");
        }
    }
}

