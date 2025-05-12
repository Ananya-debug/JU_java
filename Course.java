/**
 *  Each course (that is, subject) has a course name, instructor and text book.   
 *  One can set the course data and view the same.   
 */

public class Course {
    private String courseName;
    private Instructor instructor;
    private Textbook textbook;

    public Course(String courseName, Instructor instructor, Textbook textbook) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public void setdata(String courseName, Instructor instructor, Textbook textbook) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public void display() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor Info:");
        instructor.getName();
        System.out.println("Textbook Info:");
        textbook.getTitle();
    }
}
