package com.melvyn.sfgpetclinic.services;

import com.melvyn.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by Melvyn on 15/Aug/2020
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
