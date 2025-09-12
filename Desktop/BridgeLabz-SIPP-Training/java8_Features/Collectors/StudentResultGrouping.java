package Collectors;

import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    String gradeLevel;

    public Student(String name, String gradeLevel) {
        this.name = name;
        this.gradeLevel = gradeLevel;
    }

    public String getName() {
        return name;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }
}

public class StudentResultGrouping {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", "Grade 10"),
            new Student("Bob", "Grade 10"),
            new Student("Charlie", "Grade 11"),
            new Student("David", "Grade 12"),
            new Student("Eva", "Grade 11"),
            new Student("Frank", "Grade 12")
        );

        // Group students by grade level and collect names
        Map<String, List<String>> studentsByGrade = students.stream()
            .collect(Collectors.groupingBy(
                Student::getGradeLevel,
                Collectors.mapping(Student::getName, Collectors.toList())
            ));

        System.out.println("=== Students Grouped by Grade ===");
        studentsByGrade.forEach((grade, names) -> 
            System.out.println(grade + " → " + names));
    }
}
