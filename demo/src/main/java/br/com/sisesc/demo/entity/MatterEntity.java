package br.com.sisesc.demo.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table (name = "matter")
public class MatterEntity {

    @Id @GeneratedValue
    private UUID id;
    private Integer workLoad;

}
