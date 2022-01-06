package br.com.sisesc.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "address")
public class AddressEntity {

    private String street;
    @Id
    private String cep;
    private String numberOfHouse;
    private String country;
    private String city;

    public AddressEntity() {
    }
}
