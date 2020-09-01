package com.melvyn.sfgpetclinic.services.springdatajpa;

import com.melvyn.sfgpetclinic.model.Speciality;
import com.melvyn.sfgpetclinic.repositories.SpecialtyRepository;
import com.melvyn.sfgpetclinic.services.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Melvyn on 29/Aug/2020
 */
@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService implements SpecialtyService {

    private final SpecialtyRepository specialtyRepository;

    public SpecialitySDJpaService (SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    @Override
    public Set<Speciality> findAll () {
        Set<Speciality> specialities = new HashSet<>();
        specialtyRepository.findAll ().forEach (specialities::add);
        return specialities;
    }

    @Override
    public Speciality findByID (Long aLong) {
        return specialtyRepository.findById (aLong).orElse (null);
    }

    @Override
    public Speciality save (Speciality object) {
        return specialtyRepository.save (object);
    }

    @Override
    public void delete (Speciality object) {
        specialtyRepository.delete (object);
    }

    @Override
    public void deleteById (Long aLong) {
        specialtyRepository.deleteById (aLong);
    }
}
