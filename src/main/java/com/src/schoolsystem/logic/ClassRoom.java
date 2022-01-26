package com.src.schoolsystem.logic;
import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
    private String name;
    private List<Student> students;

    public ClassRoom(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    public ClassRoom(String name) {
        this.name = name;
        this.students = new ArrayList<Student>();
    }

    public void getAverageOfClassForEachSubject(){
        float total[] = new float[Subjects.values().length];
        int totalus [] = new int[Subjects.values().length];
        for (Student student:students) {
            for (int i = 0; i < Subjects.values().length; i++) {
                if(!(student.subjectAverage(Subjects.values()[i]) == 0)){
                    total[i] += student.subjectAverage(Subjects.values()[i]);
                    totalus[i]++;
                }
            }
        }

        for (int i = 0; i < Subjects.values().length; i++) {
            System.out.println("Z " + Subjects.values()[i] + " má třída " + name + " průměr " + total[i]/totalus[i] + ".");
        }
    }

    public float getAverageOfClass(){
        float total = 0;

        for (Student student:students) {
            total += student.calculateAverageOfStudent(true);
        }

        total /= students.size();
        System.out.println("Třída " + name + " má průměr " + total + ".");
        return total;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
