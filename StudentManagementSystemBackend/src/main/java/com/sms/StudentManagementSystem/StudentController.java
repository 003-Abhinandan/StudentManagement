package com.sms.StudentManagementSystem;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentservice;

    @RequestMapping("/test")
    public String firsthandler(){
        return "testing!";
    }

    @RequestMapping("/addStudent")
    public Student addStudent(@RequestBody Student student){

        return studentservice.setStudent(student);
    }

}
