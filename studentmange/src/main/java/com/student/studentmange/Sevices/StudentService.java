package com.student.studentmange.Sevices;

import java.util.List;


import com.student.studentmange.Entity.Student;

public interface StudentService {

    public List<Student> getStudents();

    public Student addStudent(Student student);

    public String DeleteAllStudent();

    public Student updateStudent(Student student,Long studentId);

    public Student getStudent(Long studentId);
    
}
