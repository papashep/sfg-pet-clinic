package com.melvyn.sfgpetclinic.services.map;

import com.melvyn.sfgpetclinic.model.Pet;
import com.melvyn.sfgpetclinic.services.PetService;

import java.util.Set;

/**
 * Created by Melvyn on 16/Aug/2020
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll () {
        return super.findAll ();
    }

    @Override
    public Pet findByID (Long id) {
        return super.findByID (id);
    }

    @Override
    public Pet save (Pet object) {
        return super.save (object.getId (), object);
    }

    @Override
    public void delete (Pet object) {
        super.delete (object);
    }

    @Override
    public void deleteById (Long id) {
        super.deleteById (id);
    }

}
