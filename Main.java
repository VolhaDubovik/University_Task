package by.issoft.university;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student st1 = new Student("Ivan", "Ivanov");
        st1.addMark("Math", 5);
        st1.addMark("Phisics", 5);
        st1.addMark("English", 3);

        Student st2 = new Student("Petr", "Petrov");
        st2.addMark("Math", 2);
        st2.addMark("Phisics", 5);
        st2.addMark("English", 5);

        Student st3 = new Student("Sidor", "Sidorov");
        st3.addMark("Math", 3);
        st3.addMark("Phisics", 4);
        st3.addMark("English", 2);


        Group gr1 = new Group("411802");
        gr1.addStudent(st1);
        gr1.addStudent(st2);
        gr1.addStudent(st3);


        GroupLogic groupLogic = new GroupLogic();

        System.out.println( "Средний балл группы: ");
        double avrMarkGroup = groupLogic.calcAvrMark(gr1);
        System.out.println("Группа1 = " + avrMarkGroup);

        System.out.println( " ");

        System.out.println( "Средний балл студентов: ");
        double avrMarkStudent1 = groupLogic.calcAvrMark(st1);
        System.out.println("[Иван Иванов] = " +avrMarkStudent1);

        double avrMarkStudent2 = groupLogic.calcAvrMark(st2);
        System.out.println("[Петр Петров] = " +avrMarkStudent2);

        double avrMarkStudent3 = groupLogic.calcAvrMark(st3);
        System.out.println("[Сидор Сидоров] = " + avrMarkStudent3);


        System.out.println( " ");


        GroupConsoleView view = new GroupConsoleView();

        List<Student> stA = groupLogic.findAStudentsWithAMark(gr1);
        System.out.println( "Список отличников: ");
        view.printALevelStudents(stA);

        System.out.println( " ");

        List<Student> stF = groupLogic.findFStudentsWithFMark(gr1);
        System.out.println( "Список студентов, имеющик [2]: ");
        view.printFLevelStudents(stF);

    }

}
