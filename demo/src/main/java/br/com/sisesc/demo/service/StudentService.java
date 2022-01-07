package br.com.sisesc.demo.service;

import br.com.sisesc.demo.entity.StudentEntity;
import br.com.sisesc.demo.repository.StudentRepository;
import br.com.sisesc.demo.vo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Heron Cendrethe
* */
@Service
public class StudentService {

    private static final Logger logger = Logger.getLogger(StudentService.class.getName());
    @Autowired
    private StudentRepository studentRepository;

    public ResponseEntity<?> createStudent(Student student){
        try{
            StudentEntity studentEntity = new StudentEntity();
            studentEntity.setEntity(student);
            studentRepository.save(studentEntity);
        }catch (Exception e) {
            logger.log(Level.WARNING, "it was not possible to register the student ->" + student.getNameStudent() + "review and trying again!");
        }
        return ResponseEntity.ok(student.getNameStudent());
    }

    public ResponseEntity<Student> findStudentById(Integer Id){
        Student student = new Student();
        student.setStudent(studentRepository.findStudentById(Id));
        return ResponseEntity.ok(student);
    }

}
