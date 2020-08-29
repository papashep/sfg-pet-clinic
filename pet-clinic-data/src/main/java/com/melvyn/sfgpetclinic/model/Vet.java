package com.melvyn.sfgpetclinic.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Melvyn on 13/Aug/2020
 */
@Entity
@Table(name = "vets")
public class Vet extends Person {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialties",
            joinColumns = @JoinColumn(name = "vet_id"),
            inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private Set<Speciality> specialities = new HashSet<>(); // Initialize this to stop a NullPointerException

    public Set<Speciality> getSpecialities () {
        return specialities;
    }

    public void setSpecialities (Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
