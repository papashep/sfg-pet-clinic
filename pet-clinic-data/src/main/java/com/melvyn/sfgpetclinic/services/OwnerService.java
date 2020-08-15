package com.melvyn.sfgpetclinic.services;

import com.melvyn.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by Melvyn on 15/Aug/2020
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
