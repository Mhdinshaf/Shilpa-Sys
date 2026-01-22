package edu.icet.service.impl;

import edu.icet.dto.StudentDto;
import edu.icet.entity.StudentEntity;
import edu.icet.repository.StudentRepository;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    final StudentRepository studentRepository;

    final ModelMapper modelMapper;

    @Override
    public void addStudent(StudentDto student) {
        StudentEntity studentEntity=modelMapper.map(student, StudentEntity.class);
        studentRepository.save(studentEntity);
    }

    @Override
    public void updateStudent(StudentDto student) {
        StudentEntity studentEntity=modelMapper.map(student, StudentEntity.class);
        studentRepository.save(studentEntity);
    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }

    @Override
    public StudentDto searchByID(Integer id) {
        StudentEntity studentEntity=studentRepository.findById(id).get();
        StudentDto studentDto=modelMapper.map(studentEntity, StudentDto.class);
        return studentDto;
    }

    @Override
    public List<StudentDto> getAll() {
        List<StudentEntity> studentEntities=studentRepository.findAll();
        ArrayList<StudentDto> studentDtoArrayList=new ArrayList<>();
        studentEntities.forEach(studentEntity -> {
            StudentDto studentDto=modelMapper.map(studentEntity, StudentDto.class);
            studentDtoArrayList.add(studentDto);
        });
        return  studentDtoArrayList;
    }
}
