package service;

import model.Student;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void initializeStudents() {
        students.add(new Student("Aiperi", 113, 4.0));
        students.add(new Student("Mirana", 114, 3.0));
        students.add(new Student("Nazik", 115, 2.0));
        students.add(new Student("Aibiyke", 116, 3.9));
        students.add(new Student("Dilya", 117, 2.0));
        System.out.println("Student list was initialized");
    }

    public void removeLowGPA() {
        students.removeIf(s-> s.getGpa() < 2.0);
    }

    public void findHighestGPA() {
        // TODO: Find and print student with highest GPA
        Student TopStudent = students.get(0);
        for (Student s : students) {
            if (s.getGpa() > TopStudent.getGpa()) {
                TopStudent = s;
            }
        }
        System.out.println("Student with highest gpa :" +TopStudent);
    }

    public void insertAtIndex() {
        // TODO: Insert new student at index 2
        if (students.size() >= 2) {
            students.add(2, new Student("Kasym", 118, 3.5));
            System.out.println("Kasym was added to students");
        }
    }

    public void  printStudents() {
        // TODO: Print using Iterator
        System.out.println("-----Current Students------");

        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student s = iterator.next();
            System.out.println(s);
        }
    }
}
