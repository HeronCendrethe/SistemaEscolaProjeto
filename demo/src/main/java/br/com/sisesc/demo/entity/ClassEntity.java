package br.com.sisesc.demo.entity;

import javax.persistence.*;
import java.util.UUID;
/**
 * @author Heron Cendrethe
 * */
@Entity
@Table (name = "class")
public class ClassEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private MatterEntity matterEntity;
    @OneToOne(fetch = FetchType.LAZY,mappedBy = "classEntity")
    private StudentEntity studentEntity;


}
