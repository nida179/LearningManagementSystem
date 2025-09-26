import java.util.ArrayList;
import java.util.List;
import java.lang.Cloneable;

public class CourseList  implements Cloneable{
    private List<Course> courses = new ArrayList<Course>(100);

    CourseList(){
        this.courses = new ArrayList<>();
    }
    CourseList(ArrayList<Course> courses){
        this.courses = courses;
    }
    CourseList(CourseList other){
        this.courses = new ArrayList<>();
        for(Course c: other.courses){
            this.courses.add(new Course(c)); // uses copy constructor
        }
    }
    public boolean addCourse(Course course){
        if(courses.contains(course)) return false;
        else {
            courses.add(course);
        }
        return true;
    }
    public boolean removeCourse(Course course){
        if(courses.contains(course)){
            courses.remove(course);
            return true; // removed
        }
        else{
            return false;  //nothing to remove
        }
    }
    public Object clone() throws CloneNotSupportedException{
        CourseList copy = (CourseList) super.clone();
        copy.courses = new ArrayList<>();
        for(Course c : this.courses){
            copy.courses.add((Course) c.clone());
        }
        return copy;
    }
    public List<Course> getCourses(){
        return courses;
    }
    @Override
    public String toString(){
        return "COURSELIST: "+courses.toString();
    }
}
