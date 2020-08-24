package com.melvyn.sfgpetclinic.services.map;

import com.melvyn.sfgpetclinic.model.Speciality;
import com.melvyn.sfgpetclinic.model.Vet;
import com.melvyn.sfgpetclinic.services.SpecialtyService;
import com.melvyn.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Melvyn on 16/Aug/2020
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialtyService specialtyService;

    public VetServiceMap (SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

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

        if ( object.getSpecialities ().size () > 0 ) {
            object.getSpecialities ().forEach (speciality -> {
                if ( speciality.getId () == null ) {
                    Speciality savedSpecialty = specialtyService.save (speciality);
                    speciality.setId (savedSpecialty.getId ());
                }
            });
        }
        return super.save (object);
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
