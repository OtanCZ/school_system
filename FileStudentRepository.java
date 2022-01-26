package com.src.schoolsystem.logic;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FileStudentRepository implements StudentRepository {

    private static final String FILE_NAME = "./students.csv";

    @Override
    public List<Student> readStudent() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream(FILE_NAME));
        List<Student> students = new LinkedList<>();
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] row = line.trim().split(";");
            Student student = new Student(row[0]);
           // Subjects subjects = Subjects.valueOf(row[1]);
           // int grade = Integer.parseInt(row[2]);

            try {
                for (int i = 1; i < row.length; i+=2) {
                    Subjects  subjects = Subjects.valueOf(row[i]);
                    int grade = Integer.parseInt(row[i + 1]);
                    student.addGrade(subjects, grade);
                }

            } catch (Exception e) {
                System.out.println(e);
            }
            students.add(student);
        }

        //System.out.println(scanner.nextLine());
        //System.out.println(scanner.hasNextLine());
        return students;
    }

    @Override
    public void writeStudents(List<Student> students) throws IOException {
        String data = generateString(students);
        FileWriter fileWriter = new FileWriter(new File(FILE_NAME));
        fileWriter.write(data);
        fileWriter.flush();
        fileWriter.close();
    }

    private String generateString(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {

        }
        return null;
    }
}
