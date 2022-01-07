package br.com.sisesc.demo.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table (name = "matter")
public class MatterEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer workLoad;
    @ManyToOne(fetch = FetchType.LAZY)
    TeacherEntity teacherEntity;

}
