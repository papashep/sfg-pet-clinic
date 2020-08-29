package com.melvyn.sfgpetclinic.repositories;

import com.melvyn.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Melvyn on 29/Aug/2020
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
