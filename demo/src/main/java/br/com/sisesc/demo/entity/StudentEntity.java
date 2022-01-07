package br.com.sisesc.demo.entity;

import br.com.sisesc.demo.vo.Student;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.UUID;
/**
 * @author Heron Cendrethe
 * */
@Entity
@Table(name = "student")
public class StudentEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull @NotEmpty @Length(min = 10)
    private String nameStudent;
    @NotNull @NotEmpty @Length(min = 11)
    private String cpf;
    @OneToOne(fetch = FetchType.LAZY)
    private ClassEntity classEntity;
    @OneToOne(fetch = FetchType.EAGER)
    private GuardianEntity guardianEntity;
    @OneToOne(fetch = FetchType.LAZY)
    private AddressEntity addressEntity;
    private String dateOfBirthday;

    public StudentEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ClassEntity getClassEntity() {
        return classEntity;
    }

    public void setClassEntity(ClassEntity classEntity) {
        this.classEntity = classEntity;
    }

    public GuardianEntity getGuardianEntity() {
        return guardianEntity;
    }

    public void setGuardianEntity(GuardianEntity guardianEntity) {
        this.guardianEntity = guardianEntity;
    }

    public AddressEntity getAddressEntity() {
        return addressEntity;
    }

    public void setAddressEntity(AddressEntity addressEntity) {
        this.addressEntity = addressEntity;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public void setEntity(Student student){
        setCpf(student.getCpf());
        setNameStudent(student.getNameStudent());
        setDateOfBirthday(student.getDateOfBirthday());
    }

}
