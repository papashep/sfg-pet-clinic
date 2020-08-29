package com.melvyn.sfgpetclinic.services.springdatajpa;

import com.melvyn.sfgpetclinic.model.PetType;
import com.melvyn.sfgpetclinic.repositories.PetTypeRepository;
import com.melvyn.sfgpetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Melvyn on 29/Aug/2020
 */
@Service
@Profile("springdatajpa")
public class PetTypeSDJpaService implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    public PetTypeSDJpaService (PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<PetType> findAll () {
        Set<PetType> petTypes = new HashSet<> ();
        petTypeRepository.findAll ().forEach (petTypes::add);
        return petTypes;
    }

    @Override
    public PetType findByID (Long aLong) {
        return petTypeRepository.findById (aLong).orElse (null);
    }

    @Override
    public PetType save (PetType object) {
        return petTypeRepository.save (object);
    }

    @Override
    public void delete (PetType object) {
        petTypeRepository.delete (object);
    }

    @Override
    public void deleteById (Long aLong) {
        petTypeRepository.deleteById (aLong);
    }
}
