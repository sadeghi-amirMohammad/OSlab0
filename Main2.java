import java.util.*;

class Student {
    String firstName;
    String lastName;
    String sid;

    public Student(String firstName, String lastName, String sid) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sid = sid;
    }


}

public class Main {
    public static void main(String[] args) {
        // لیستی از اطلاعات دانشجویان
        Vector<Student> students = new Vector<>();
        students.add(new Student("ida", "darvishi", "1401012268002"));
        students.add(new Student("arefeh", "rassafian", "1401012268010"));
        students.add(new Student("Amirhossein", "Jamei", "1401012268076"));
        students.add(new Student("Najme", "Kouhsar", "1401012268021"));


        // مرتب‌سازی بر اساس نام
        students.sort(Comparator.comparing(student -> student.firstName));
        System.out.println("Sorted by First Name:");
        for (Student value : students) {
            System.out.println(value.firstName + "," + value.lastName + "," + value.sid);
        }


        // مرتب‌سازی بر اساس نام خانوادگی
        students.sort(Comparator.comparing(student -> student.lastName));
        System.out.println("\nSorted by Last Name:");
        for (Student value : students) {
            System.out.println(value.firstName + "," + value.lastName + "," + value.sid);
        }


        // مرتب‌سازی بر اساس شماره دانشجویی
        students.sort(Comparator.comparing(student -> student.sid));
        System.out.println("\nSorted by SID:");
        for (Student value : students) {
            System.out.println(value.firstName + "," + value.lastName + "," + value.sid);
        }



    }
}