package by.issoft.university;

import java.util.ArrayList;
import java.util.List;

public class GroupLogic {
    public double calcAvrMark(Group group) {
        double avrMark = 0;

        List<Student> students = group.getStudents();

        for (Student st : students) {
            avrMark = avrMark + calcAvrMark(st);
        }

        avrMark = avrMark / students.size();

        return avrMark;
    }

    double calcAvrMark(Student student) {
        double avrMark = 0;

        List<Mark> marks = student.getMarks();

        for (Mark mark : marks) {
            avrMark = avrMark + mark.getMark();
        }

        avrMark = avrMark / marks.size();

        return avrMark;
    }

    //двоишники
    List<Student> findFStudents(Group group) {
        List<Student> fListStudents = new ArrayList<>();
        List<Student> students = group.getStudents();
        for (Student st : students) {
            if (hasFMark(st)) {
                fListStudents.add(st);
            }
        }

        return fListStudents;
    }

    boolean hasFMark(Student student) {
        List<Mark> marks = student.getMarks();
        for (Mark mark : marks) {
            if (mark.getMark() <= 2) {

                return true;
            }
        }
        return false;
    }

    List<Mark> takeFSubjects(Student student) {
        List<Mark> fSubjectsList = new ArrayList<>();
        List<Mark> marks = student.getMarks();
        for (Mark mark : marks) {
            if (mark.getMark() <= 2) {
                fSubjectsList.add(mark);
            }
        }

        return fSubjectsList;
    }

    List<Student> findFStudentsWithFMark(Group group) {
        List<Student> fListStudents = new ArrayList<>();

        List<Student> students = group.getStudents();
        for (Student st : students) {
            List<Mark> fMarks;
            if (hasFMark(st)) {
                fMarks = takeFSubjects(st);
                Student stView = new Student(st.getStudentName(), st.getStudentSurname(), fMarks);
                fListStudents.add(stView);
            }
        }

        return fListStudents;
    }


    // отличники
    boolean hasAMark(Student student) {
        List<Mark> marks = student.getMarks();
        for (Mark mark : marks) {
            if (mark.getMark() == 5) {

                return true;
            }
        }
        return false;
    }

    List<Mark> takeASubjects(Student student) {
        List<Mark> aSubjectsList = new ArrayList<>();
        List<Mark> marks = student.getMarks();
        for (Mark mark : marks) {
            if (mark.getMark() == 5) {
                aSubjectsList.add(mark);
            }
        }

        return aSubjectsList;
    }

    List<Student> findAStudentsWithAMark(Group group) {
        List<Student> aListStudents = new ArrayList<>();

        List<Student> students = group.getStudents();
        for (Student st : students) {
            List<Mark> aMarks;
            if (hasAMark(st)) {
                aMarks = takeASubjects(st);
                Student stView = new Student(st.getStudentName(), st.getStudentSurname(), aMarks);
                aListStudents.add(stView); // добавление в результирующий список
            }
        }

        return aListStudents;
    }


}
