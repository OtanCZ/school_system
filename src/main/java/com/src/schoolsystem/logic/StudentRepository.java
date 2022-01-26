package com.src.schoolsystem.logic;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface StudentRepository {

    List<Student> readStudent() throws FileNotFoundException;

    void writeStudents(List<Student> students) throws IOException;
}
