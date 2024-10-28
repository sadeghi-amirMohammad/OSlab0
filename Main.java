import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    String firstName;
    String lastName;
    String sid;

    public Student(String firstName, String lastName, String sid) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sid='" + sid + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        // لیستی از اطلاعات دانشجویان
        List<Student> students = new ArrayList<>();
        students.add(new Student("ida", "darvishi", "1401012268002"));
        students.add(new Student("arefeh", "rassafian", "1401012268010"));


        // مرتب‌سازی بر اساس نام
        Collections.sort(students, Comparator.comparing(student -> student.firstName));
        System.out.println("Sorted by First Name:");
        students.forEach(System.out::println);

        // مرتب‌سازی بر اساس نام خانوادگی
        Collections.sort(students, Comparator.comparing(student -> student.lastName));
        System.out.println("\nSorted by Last Name:");
        students.forEach(System.out::println);

        // مرتب‌سازی بر اساس شماره دانشجویی
        Collections.sort(students, Comparator.comparing(student -> student.sid));
        System.out.println("\nSorted by SID:");
        students.forEach(System.out::println);
    }
}