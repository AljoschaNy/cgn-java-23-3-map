package de.neuefische.task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskMain {
    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();
        //List<Student> students = new ArrayList<>();
        Student max = new Student("Max", "Muster", "1");
        Student marie = new Student("Marie", "Muster", "2");

        students.put(max.getMatriculationNumber(), max);
        students.put(marie.getMatriculationNumber(), marie);

        /*School school = new School();
        school.addStudent(marie);
        school.addStudent(max);
        System.out.println(school);
        System.out.println(school.getStudentByMatriculationNumber("4"));*/
    }
}
