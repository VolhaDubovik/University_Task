package by.issoft.university;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String studentName;
    private String studentSurname;
    List<Mark> marks = new ArrayList<>();

    public Student(String studentName, String studentSurname, List<Mark> marks) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.marks = marks;
    }

    public Student(String studentName, String studentSurname) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
    }

    public void addMark(String subject, int mark) {
        marks.add(new Mark(subject, mark));
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public List<Mark> getMarks() {
        return marks;
    }

    public void setMarks(List<Mark> marks) {
        this.marks = marks;
    }
}
