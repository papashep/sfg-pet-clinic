package com.melvyn.sfgpetclinic.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Created by Melvyn on 15/Aug/2020
 */
@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    // Recommendation of hibernate is to use box types and not primitive, box types can be
                        // and primitives can not be.


    public Long getId () {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }
}
