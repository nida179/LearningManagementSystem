import java.util.ArrayList;
import java.util.List;

public class StudentList implements Cloneable{
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
    public void searchByName(String name){
        for(Student s : students){
            if(name.equalsIgnoreCase(s.getName())){
                System.out.println("STUDENT IS FOUND: "+s.getName()+" SEAT_NUMBER IS: "+s.getSeatNo());
            }
        }
    }
    public boolean searchBySeatNumber(String seatN){
        for(Student s : students){
            if(seatN.equals(s.getSeatNo())){
                System.out.println("STUDENT IS FOUND: "+s.getName()+" SEAT_NUMBER IS: "+s.getSeatNo());
                return true;
            }
        }
        return false;
    }
    public List<Student> searchByCourse(String courseName){
        List<Student> result = new ArrayList<>();
        for(Student s: students){
            for(Course c: s.getCourses()){
                if(c.getCourseName().equalsIgnoreCase(courseName)){
                    result.add(s);
                    break;  // stop checking more courses for this student if the course is found.
                }
            }
        }
        if(result.isEmpty()){
            System.out.println("No student is enrolled in this course!!"+courseName);
        } else {
            System.out.println("Student enrolled in this course are: "+courseName);
            for(Student s: students){
                System.out.println("-"+s.getName()+" (SeatNo: "+s.getSeatNo()+")");
            }
        }
        return result;
    }
    // sorting
    public void sortByName(){
        int  = students.size();
        for(int i =0;i<n-1;i++){
            int min=i;
            for(int j =i+1;j<n;j++){
                String name1 = students.get(j).getName();
                String name2 = students.get(min).getName();
                if(name1.compareTo(name2)<0){
                    min =j;
                }
                // swaping
                Student temp = students.get(min);
                students.set(min,students.get(i));
                sudents.set(i,temp);
         }
    }
    public void sortBySeatNumber(){
        int n = students.size();
        for(int i =0;i<n-1;i++){
            int min=i;
            for(int j =i+1;j<n;j++){
                String name1 = students.get(j).getSeatNo();
                String name2 = students.get(min).getSeatNo();
                if(name1.compareTo(name2)<0){
                    min =j;
                }
                // swaping
                Student temp = students.get(min);
                students.set(min,students.get(i));
                students.set(i,temp);
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
     public Object clone() throws CloneNotSupportedException{
            StudentList copy = (StudentList) super.clone();
            copy.students = new ArrayList<>();
            for (Student c : this.students) {
                copy.students.add((Student) c.clone());
            }
            return copy;
    }
}
