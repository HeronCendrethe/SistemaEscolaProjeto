package br.com.sisesc.demo.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table (name = "class")
public class ClassEntity {

    @Id
    private UUID id;
    private MatterEntity matterEntity;


}
