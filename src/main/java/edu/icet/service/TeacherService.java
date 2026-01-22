package edu.icet.service;

import edu.icet.dto.StudentDto;

import java.util.List;

public interface TeacherService {
    void addStudent(StudentDto student);
    void updateStudent(StudentDto student);
    void deleteStudent(Integer id);
    StudentDto searchByID(Integer id);
    List<StudentDto> getAll();
}
