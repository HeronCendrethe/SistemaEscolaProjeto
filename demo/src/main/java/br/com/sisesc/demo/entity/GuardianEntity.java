package br.com.sisesc.demo.entity;

import com.sun.istack.NotNull;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table (name = "guardian")
public class GuardianEntity {

    @NotNull @NotEmpty @Length(min = 10)
    private String nameGuardian;
    @NotNull @Id @NotEmpty @Length(min = 10)
    private String cpf;
    @OneToOne(fetch = FetchType.LAZY)
    private AddressEntity addressEntity;
    @NotNull @NotEmpty @Length(min = 10)
    private String contactNumber;
    @OneToOne(fetch = FetchType.LAZY)
    private StudentEntity studentEntity;
}
