package com.melvyn.sfgpetclinic.services.map;

import com.melvyn.sfgpetclinic.model.Owner;
import com.melvyn.sfgpetclinic.model.Pet;
import com.melvyn.sfgpetclinic.services.OwnerService;
import com.melvyn.sfgpetclinic.services.PetService;
import com.melvyn.sfgpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Melvyn on 16/Aug/2020
 */

/*
    Currently this is an implementation that provides a service using an Hashmap.
    We are going to modify the project so we can use an implementation using Spring Data JPA.
    We are comparing using the hashmap persistence to using an SQL database and we should be able to switch
    between the two.
    We will be using Spring to decide which get run at run time.
    See the springdatajpa package for the SQL using Spring Boot Data.

    Note: we have not modified this.
 */
@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerMapService (PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<Owner> findAll () {
        return super.findAll ();
    }

    @Override
    public Owner findByID (Long id) {
        return super.findByID (id);
    }

    @Override
    public Owner save (Owner object) {

        if ( object != null ) {
            if ( object.getPets () != null ) {
                object.getPets ().forEach (pet -> {
                    if ( pet.getPetType () != null ) {
                       if( pet.getPetType ().getId () == null ) {
                          pet.setPetType (petTypeService.save (pet.getPetType ()));
                       }
                    } else {
                        throw new RuntimeException ("Pet Type is required!");
                    }
                    if ( pet.getId () == null ) {
                        Pet savedPet = petService.save ( pet );
                        pet.setId ( savedPet.getId () );
                    }
                });
            }

            return super.save (object);

        } else {
            return null;
        }
    }

    @Override
    public void delete (Owner object) {
        super.delete (object);
    }

    @Override
    public void deleteById (Long id) {
        super.deleteById (id);
    }

    @Override
    public Owner findByLastName (String lastName) {
        return null;
    }
}
