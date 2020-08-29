package com.melvyn.sfgpetclinic.services.springdatajpa;

import com.melvyn.sfgpetclinic.model.Pet;
import com.melvyn.sfgpetclinic.repositories.PetRepository;
import com.melvyn.sfgpetclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Melvyn on 29/Aug/2020
 */
@Service
@Profile("springdatajpa")
public class PetSDJpaService implements PetService {

    private final PetRepository petRepository;

    public PetSDJpaService (PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Set<Pet> findAll () {
        Set<Pet> pets = new HashSet<>();
        petRepository.findAll ().forEach (pets::add);
        return pets;
    }

    @Override
    public Pet findByID (Long aLong) {
        return petRepository.findById (aLong).orElse (null);
    }

    @Override
    public Pet save (Pet object) {
        return petRepository.save (object);
    }

    @Override
    public void delete (Pet object) {
        petRepository.delete (object);
    }

    @Override
    public void deleteById (Long aLong) {
        petRepository.deleteById (aLong);

    }
}
