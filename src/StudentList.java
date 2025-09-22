import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private List<Student> students = new ArrayList<>(100);

    StudentList(){
        students = new ArrayList<>();
    }
    // copy constructor (deep copy):
    StudentList(StudentList other){
        this.students = new ArrayList<>();
        for(Student s: students){
            this.students.add(new Student(s)); // calls Student copy constructor
        }
    }
    public boolean addStudent(Student s){
        if(students.contains(s)) return true;
        else {
            students.add(new Student(s)); return false;
        }
    }
    public boolean removeStudent(Student s){
          if(students.contains(s)) {
          students.remove(s);
          return true;
          }
          else {
            return false;
        }
    }
    // get all students:
    public List<Student> getStudents(){
        return students;
    }
    public void display(){
        System.out.println(".....STUDENTLIST..... ");
        for(Student s : students){
            System.out.println("\n"+s);
        }
    }
    public String toString(){
        StringBuilder sb = new StringBuilder("STUDENTLIST: \n");
        for(Student s : students){
            sb.append(s.toString()).append("\n");
        }
        return sb.toString();
    }
}
