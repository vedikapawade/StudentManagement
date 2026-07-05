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

    // Add Student
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    // Get All Students
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    // Get Student By Id
    public Student getStudentById(int id) {
        return repository.findById(id).orElse(null);
    }

    // Update Student
    public Student updateStudent(int id, Student student) {
        Student existingStudent = repository.findById(id).orElse(null);

        if (existingStudent != null) {
            existingStudent.setName(student.getName());
            existingStudent.setAge(student.getAge());
            existingStudent.setCourse(student.getCourse());
            existingStudent.setCity(student.getCity());

            return repository.save(existingStudent);
        }

        return null;
    }

    // Delete Student
    public String deleteStudent(int id) {
        repository.deleteById(id);
        return "Student Deleted Successfully";
    }
}