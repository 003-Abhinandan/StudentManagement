package com.sms.StudentManagementSystem;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "studentlist")
public class Student {
    @Id
    private String id;

        String name;
        String rollNo;
        String std;
        String phoneNumber;

//    public Student(String name, String rollNo, String std, String phoneNumber) {
//        this.name = name;
//        this.rollNo = rollNo;
//        this.std = std;
//        this.phoneNumber = phoneNumber;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getStd() {
        return std;
    }

    public void setStd(String std) {
        this.std = std;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
