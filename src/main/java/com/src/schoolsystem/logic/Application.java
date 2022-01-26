package com.src.schoolsystem.logic;

public class Application {

    public static void main(String[] args) throws Exception {

        StudentRepository studentRepository = new FileStudentRepository();
        System.out.println(studentRepository.readStudent());

      /*  Student student = new Student("džou bajdn");
        student.addGrade(Subjects.CZECH, 3);
        student.addGrade(Subjects.CZECH, 5);
        student.addGrade(Subjects.CZECH, 3);
        student.addGrade(Subjects.PROGRAMMING, 3);
        student.addGrade(Subjects.PROGRAMMING, 1);
        student.addGrade(Subjects.PROGRAMMING, 1);
        student.calculateAverageOfStudent();
        System.out.println();

        Student student2 = new Student("Josef Bída");
        student2.addGrade(Subjects.ENGLISH, 3);
        student2.addGrade(Subjects.ENGLISH, 5);
        student2.addGrade(Subjects.CZECH, 3);
        student2.addGrade(Subjects.PROGRAMMING, 3);
        student2.addGrade(Subjects.MATH, 1);
        student2.addGrade(Subjects.MATH, 1);
        student2.calculateAverageOfStudent();
        System.out.println();


        ClassRoom classroom = new ClassRoom("1. Bi");
        classroom.addStudent(student);
        classroom.addStudent(student2);

        classroom.getAverageOfClassForEachSubject();
        classroom.getAverageOfClass();


        System.out.println();
        Student student3 = new Student("Daniel Trumpeš");
        ClassRoom classroom2 = new ClassRoom("3. Bi");
        student3.calculateAverageOfStudent();
        classroom2.getAverageOfClass();
        classroom2.getAverageOfClassForEachSubject();*/
    }
}
