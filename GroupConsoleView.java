package by.issoft.university;

import java.util.List;

public class GroupConsoleView {


    void printFLevelStudents(List<Student> students) {
        for(Student f: students)
        {
            System.out.println(  f.getStudentName() + " " + f.getStudentSurname());

        }

    }

    void printALevelStudents(List<Student> students) {
        for(Student a: students)
        {
            System.out.println(  a.getStudentName() + " " + a.getStudentSurname());

        }

    }

}
