package edu.miu.cs.cs425;

import edu.miu.cs.cs425.model.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

@SpringBootApplication
public class MyStudentRecordsMgmtApp {

    public static void main(String[] args) {
        SpringApplication.run(MyStudentRecordsMgmtApp.class, args);

        var students = new Student[]{
                new Student(110001,"Dave", LocalDate.of(1951,11,18)),
                new Student(110002,"Anna", LocalDate.of(1990,12,7)),
                new Student(110003,"Erica", LocalDate.of(1974,1,31)),
                new Student(110004,"Carlos", LocalDate.of(2009,8,22)),
                new Student(110005,"Bob", LocalDate.of(1994,8,5))
        };

        System.out.println("Students sorted by name");
        printListOfStudents(students);

        System.out.println("=".repeat(30));
        System.out.println("Students sorted by admission date in descending order");

        getListOfPlatinumAlumniStudents(students);

    }


    public static void printListOfStudents(Student[] students){
        Arrays.stream(students).
                sorted(Comparator.comparing(Student::getName)).
                forEach(System.out::println);
    }

    public static void getListOfPlatinumAlumniStudents(Student[] students){
        Arrays.stream(students).
                filter(student -> LocalDate.now().getYear() -
                        student.getDateOfAdmission().getYear() >= 30).
                sorted((s1, s2) -> Integer.compare(s1.getDateOfAdmission().getYear(), s2.getDateOfAdmission().getYear()))
                .forEach(System.out::println);
    }

}
