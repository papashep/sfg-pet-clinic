package com.melvyn.sfgpetclinic.services.map;

import com.melvyn.sfgpetclinic.model.PetType;
import com.melvyn.sfgpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Melvyn on 24/Aug/2020
 */
@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll () {
        return super.findAll ();
    }

    @Override
    public PetType findByID (Long id) {
        return super.findByID (id);
    }

    @Override
    public PetType save (PetType object) {
        return super.save (object);
    }

    @Override
    public void delete (PetType object) {
        super.delete (object);
    }

    @Override
    public void deleteById (Long id) {
        super.deleteById (id);
    }
}
