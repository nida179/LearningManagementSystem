import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int seatNo;
    private List<Course> courses = new ArrayList<>(100);

    // Null Constructor:
    Student(){
        this.name = "unknown";
        this.seatNo = 0;
        this.courses = new ArrayList<>();
    }
    // Parameterized Constructor:
    Student(String name , int seatNo){
        this.name = name;
        this.seatNo = seatNo;
        this.courses = new ArrayList<>();
    }
    // Copy Constructor:
    Student(Student other){
        this.name = other.name;
        this.seatNo = other.seatNo;
        this.courses = new ArrayList<>();
        for(Course c : other.courses){
            this.courses.add(new Course(c));
        }
    }
    public boolean addCourse(Course c){
        if(courses.contains(c)) return false;
        else {
            courses.add(c);
            return true;
        }
    }
    public boolean removeCourse(Course c) {
        if (courses.contains(c)){
            courses.remove(c); // remove the course
        return true;
    }
        else {
            return false;
        }
    }
    // getters and setters:
    public String getName(){
        return name;
    }
    public int getSeatNo(){
        return seatNo;
    }
    public void set(String name , int seatNo){
        this.name = name;
        this.seatNo = seatNo;
    }
    public List<Course> getCourses(){
        return courses;
    }
    public void setCourses(List<Course> courses){
        this.courses = courses;
    }
    public String toString(){
        return "STUDENT NAME: "+name+"\nSEATNO: "+seatNo+"\nCOURSES: "+courses;
    }

}
