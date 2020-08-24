package com.melvyn.sfgpetclinic.model;

import java.util.Set;

/**
 * Created by Melvyn on 13/Aug/2020
 */
public class Vet extends Person {

    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities () {
        return specialities;
    }

    public void setSpecialities (Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
