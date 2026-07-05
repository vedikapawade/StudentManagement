package com.example.studentmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentmanagement.model.Student;
import com.example.studentmanagement.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Student getStudentById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));
    }

    public Student saveStudent(Student student) {

        if (student == null) {
            throw new RuntimeException("Student cannot be null");
        }

        return repository.save(student);
    }

    public Student updateStudent(Integer id, Student student) {

        Student existingStudent = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        existingStudent.setName(student.getName());
        existingStudent.setAge(student.getAge());
        existingStudent.setCourse(student.getCourse());
        existingStudent.setCity(student.getCity());

        return repository.save(existingStudent);
    }

    public void deleteStudent(Integer id) {

        if (!repository.existsById(id)) {
            throw new RuntimeException("Student not found");
        }

        repository.deleteById(id);
    }
}