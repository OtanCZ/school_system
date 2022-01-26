package com.src.schoolsystem.logic;
import java.util.*;

public class Student {
    private String name;
    private Map<Subjects, List<Integer>> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Subjects, List<Integer>> getGrades() {
        return grades;
    }

    public void setGrades(HashMap<Subjects, List<Integer>> grades) {
        this.grades = grades;
    }

    public void addGrade(Subjects subject, int grade){
        if (!grades.containsKey(subject)) {
            grades.put(subject, new ArrayList<>());
        }
        grades.get(subject).add(grade);
    }

    public float subjectAverage(Subjects subject){
        int sum = 0;
        int length = 0;

        if (!grades.containsKey(subject)) {
            return 0;
        }

        for (int i = 0; i < grades.get(subject).size(); i++) {
            sum += grades.get(subject).get(i);
            length++;
        }

        float avg = sum / (float) length;
        return avg;
    }

    public float calculateAverageOfStudent(){
        System.out.println(getName() + " má průměry: ");
        float total = 0;
        int subjects = 0;

        for (int i = 0; i < Subjects.values().length; i++) {
            if(!(subjectAverage(Subjects.values()[i]) == 0)){
                System.out.println(Subjects.values()[i] + " - " + subjectAverage(Subjects.values()[i]));
                total += subjectAverage(Subjects.values()[i]);
                subjects++;
            }
        }
        total /= subjects;
        System.out.println("Průměr předmětů je: " + total);
        return total;
    }


    public float calculateAverageOfStudent(boolean muted){
        float total = 0;
        int subjects = 0;

        for (int i = 0; i < Subjects.values().length; i++) {
            if(!(subjectAverage(Subjects.values()[i]) == 0)){
                total += subjectAverage(Subjects.values()[i]);
                subjects++;
            }
        }
        total /= subjects;
        return total;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }
}
