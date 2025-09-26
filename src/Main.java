public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Course oop = new Course("OOPS","352");
        Course cps = new Course("CPS","451");
        Course ds = new Course("DISCRETE STRUCTURE","362");
        Course dld = new Course("DIGITAL LOGIC DESIGN","365");
        Course la = new Course("LINEAR ALGEBRA","369");
        Course pst = new Course("PST","371");

        System.out.println(oop.clone());
        oop.set("OOP","751");
        System.out.println(oop);

        Student s1 = new Student("NIDA", 115);
        Student s2 = new Student("AYESHA",43);
        Student s3 = new Student("MAHNOOR",58);

        s1.addCourse(oop);
        s1.removeCourse(oop);
        s1.addCourse(dld);
        s1.addCourse(ds);
        s2.addCourse(oop);
        s2.addCourse(ds);
        s2.addCourse(pst);
        s3.addCourse(oop);
        s3.addCourse(dld);
        s3.addCourse(ds);

        boolean b = s1.removeCourse(dld);
        System.out.println(b);
        s1.addCourse(dld);


        CourseList cc = new CourseList();
        cc.addCourse(oop);
        cc.addCourse(cps);
        cc.addCourse(ds);
        cc.addCourse(dld);
        cc.addCourse(la);
        cc.addCourse(pst);


        StudentList s = new StudentList();
        s.addStudent(s1);
        s.addStudent(s2);
        s.addStudent(s3);
        s.display();
        System.out.println("************");
        System.out.println("==COURSE CATALOG==");
        System.out.println("************");
        System.out.println(cc.getCourses());

        System.out.println();
        System.out.println();
        System.out.println(s1);

        s.searchBySeatNumber("115");
        s.searchByCourse("oops");
    }
}
