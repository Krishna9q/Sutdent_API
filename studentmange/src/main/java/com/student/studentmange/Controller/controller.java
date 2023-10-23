package com.student.studentmange.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.student.studentmange.Entity.Student;
import com.student.studentmange.Sevices.StudentService;

@RestController
public class controller {
    
    @Autowired
    private StudentService studentService;

    //Getting All Student
    @GetMapping("/students")
    public List<Student> getStudents(){

        return this.studentService.getStudents();
    }
    //Getting Single Student
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable String studentId){
        return this.studentService.getStudent(Long.parseLong(studentId));
    }

    // Getting Student By Name
    @GetMapping("/students/name")    
    public List<String> getStudentsName(){
        return this.studentService.getStudentsName();
    }

    //Adding a Student
    @PostMapping("/students")
    public Student addStudent( @RequestBody Student student){

        return this.studentService.addStudent(student);

    }
    //Updating a student
    @PutMapping("/students/{studentId}")
    public Student updateStudent(@RequestBody Student student ,@PathVariable Long studentId){

        return this.studentService.updateStudent(student ,studentId);
    }

    //Deleting all Student
    @DeleteMapping("/students")
    public String DeleteAllStudent(){
        
        return this.studentService.DeleteAllStudent(); 
    }
}
