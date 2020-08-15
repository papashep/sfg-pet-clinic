package com.melvyn.sfgpetclinic.services;

import com.melvyn.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by Melvyn on 15/Aug/2020
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
