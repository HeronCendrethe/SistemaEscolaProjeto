package br.com.sisesc.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.UUID;

@Entity
@Table(name = "student")
public class StudentEntity {

    @Id @GeneratedValue
    private UUID id;
    @NotNull @NotEmpty @Length(min = 10)
    private String nameStudent;
    @NotNull @NotEmpty @Length(min = 11)
    private String cpf;
    @JsonIgnore @OneToOne(fetch = FetchType.LAZY)
    private ClassEntity classEntity;
    @JsonIgnore @OneToOne
    private GuardianEntity guardianEntity;
    @OneToOne
    private AddressEntity addressEntity;
    private String dateOfBirthday;


    public StudentEntity() {
    }

}
