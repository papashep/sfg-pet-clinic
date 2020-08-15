package com.melvyn.sfgpetclinic.model;

import java.io.Serializable;

/**
 * Created by Melvyn on 15/Aug/2020
 */
public class BaseEntity implements Serializable {

    private Long id;    // Recommendation of hibernate is to use box types and not primitive, box types can be
                        // and primitives can not be.


    public Long getId () {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }
}
