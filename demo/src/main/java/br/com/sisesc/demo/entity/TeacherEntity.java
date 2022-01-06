package br.com.sisesc.demo.entity;

import com.sun.istack.NotNull;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.UUID;

@Entity
@Table (name = "teacher")
public class TeacherEntity {
    
    @Id @GeneratedValue
    private UUID id;
    @NotNull @NotEmpty
    @Length(min = 10)
    private String nameTeacher;
    @NotNull @NotEmpty @Length(min = 11)
    private String cpf;
    @ManyToOne(fetch = FetchType.LAZY)
    private AddressEntity addressEntity;
    private String dateOfBirthday;
    @OneToOne
    private MatterEntity matterEntity;

    
    
    
    
    


}
