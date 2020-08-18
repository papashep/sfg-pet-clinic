package com.melvyn.sfgpetclinic.services.map;

import com.melvyn.sfgpetclinic.model.Vet;
import com.melvyn.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Melvyn on 16/Aug/2020
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll () {
        return super.findAll ();
    }

    @Override
    public Vet findByID (Long id) {
        return super.findByID (id);
    }

    @Override
    public Vet save (Vet object) {
        return super.save (object.getId (), object);
    }

    @Override
    public void delete (Vet object) {
        super.delete (object);
    }

    @Override
    public void deleteById (Long id) {
        super.deleteById (id);
    }
}
