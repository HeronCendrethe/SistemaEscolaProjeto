package br.com.sisesc.demo.vo;

import br.com.sisesc.demo.entity.AddressEntity;
import br.com.sisesc.demo.entity.ClassEntity;
import br.com.sisesc.demo.entity.GuardianEntity;
import br.com.sisesc.demo.entity.StudentEntity;
import com.sun.istack.NotNull;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
/**
 * @author Heron Cendrethe
 * */
public class Student {


    private String nameStudent;
    private String cpf;
    private String dateOfBirthday;


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


    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public void setStudent (StudentEntity studentEntity)
    {
        setCpf(studentEntity.getCpf());
        setDateOfBirthday(studentEntity.getDateOfBirthday());
        setNameStudent(studentEntity.getNameStudent());


    }
}
