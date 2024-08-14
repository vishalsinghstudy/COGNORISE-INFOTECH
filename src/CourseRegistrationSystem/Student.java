package CourseRegistrationSystem;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentID;
    private String name;
    private List<Course> registeredCourses;

    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        this.registeredCourses = new ArrayList<>();
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public List<Course> getRegisteredCourses() {
        return registeredCourses;
    }

    public boolean registerCourse(Course course) {
        if (course.registerStudent()) {
            registeredCourses.add(course);
            return true;
        } else {
            return false;
        }
    }

    public void dropCourse(Course course) {
        course.dropStudent();
        registeredCourses.remove(course);
    }
}

