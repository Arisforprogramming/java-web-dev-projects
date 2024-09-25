import java.util.ArrayList;

public class Course {
    private String courseName;
    private String instructor;
    private ArrayList<Student> enrolledStudents;

    public Course (String courseName, String instructor){
        this.courseName = courseName;
        this.instructor = instructor;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName(){
        return courseName;
    }
    public String getInstructor(){
        return instructor;
    }
    public ArrayList <Student> getEnrolledStudents(){
        return enrolledStudents;
    }

    public void setCourseName(String aCourseName){
        courseName = aCourseName;
    }
    public void setInstructor(String aInstructor){
        instructor = aInstructor;
    }
    public void addStudent(Student student){
        enrolledStudents.add(student);
    }
}
