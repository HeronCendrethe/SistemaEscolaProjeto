package br.com.sisesc.demo.repository;

import br.com.sisesc.demo.entity.StudentEntity;
import br.com.sisesc.demo.vo.Student;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
/**
 * @author Heron Cendrethe
 * */
@Repository
public interface StudentRepository extends PagingAndSortingRepository<StudentEntity,Integer> {

    StudentEntity findStudentById(Integer Id);

}
