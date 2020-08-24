package com.melvyn.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Melvyn on 13/Aug/2020
 */
public class Vet extends Person {

    private Set<Speciality> specialities = new HashSet<>(); // Initialize this to stop a NullPointerException

    public Set<Speciality> getSpecialities () {
        return specialities;
    }

    public void setSpecialities (Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
