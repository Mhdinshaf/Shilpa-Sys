package edu.icet.controller;

import edu.icet.dto.StudentDto;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Student")
@RequiredArgsConstructor
public class StudentController  {

    final StudentService studentService;


    @PostMapping("/Add")
    public void addStudent(StudentDto student) {
        studentService.addStudent(student);
    }

    @PutMapping("/Update")
    public void updateStudent(StudentDto student) {
        studentService.updateStudent(student);
    }

    @DeleteMapping("/Delete-by-id/{id}")
    public void deleteStudent(Integer id) {
        studentService.deleteStudent(id);

    }
    @GetMapping("/Search-by-id/{id}")
    public void searchByID(Integer id) {
          studentService.searchByID(id);

    }

    @GetMapping("/getAll")
    public List<StudentDto> getAll() {
        return studentService.getAll();
    }
}
