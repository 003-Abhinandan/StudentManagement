package com.sms.StudentManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    //private ArrayList<Student> studentlist = new ArrayList<>();
    Student student = new Student();
    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getStudent() {
        return null;
    }

    @Override
    public Student setStudent(Student s) {

        student.setName(s.getName());
        student.setRollNo(s.getRollNo());
        student.setStd(s.getStd());
        student.setPhoneNumber(s.getPhoneNumber());
        studentRepository.save(student);
        return s;
    }
}
