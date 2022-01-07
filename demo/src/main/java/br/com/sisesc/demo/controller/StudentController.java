package br.com.sisesc.demo.controller;

import br.com.sisesc.demo.service.StudentService;
import br.com.sisesc.demo.vo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Heron Cendrethe
 * */
@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/create-student")
    public ResponseEntity<?> createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @GetMapping("/find-student-by-id/{studentId}")
    public ResponseEntity<Student> findStudentById(@PathVariable Integer studentId){
       return studentService.findStudentById(studentId);
    }
}
