package com.melvyn.sfgpetclinic.model;

/**
 * Created by Melvyn on 24/Aug/2020
 */
public class Speciality extends BaseEntity {

    private String description;

    public String getDescription () {
        return description;
    }

    public void setDescription (String description) {
        this.description = description;
    }
}
