package com.melvyn.sfgpetclinic.services.map;

import com.melvyn.sfgpetclinic.model.Owner;
import com.melvyn.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Melvyn on 16/Aug/2020
 */
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
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
        return super.save (object);
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
