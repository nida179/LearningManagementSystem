import java.lang.Cloneable;

public class Course implements Cloneable {
    private String courseName;
    private String courseCode;

    Course(){
        this.courseName = "unknown";
        this.courseCode = "unknown";
    }
    Course(String courseName , String courseCode){
        this.courseName = courseName;
        this.courseCode = courseCode;
    }
    Course(Course other){
        this.courseName = other.courseName;
        this.courseCode = other.courseCode;
    }
    public String getCourseName(){
        return courseName;
    }
    public String getCourseCode(){
        return courseCode;
    }
    public void set(String name , String code){
        this.courseName = name;
        this.courseCode = code;
    }

    public String toString(){
        return "COURSE_NAME: "+courseName+" , COURSE_CODE: "+courseCode;
    }

    // This make a shallow copy of the object: (Because here, I have used the ArrayList)
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
