package com.melvyn.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created by Melvyn on 13/Aug/2020
 */
@Setter
@Getter
@MappedSuperclass
public class Person extends BaseEntity {

    @Column(name = "first_name")        // Snake case
    private String firstName;           // Camel Case

    @Column(name = "last_name")
    private String lastName;

}
