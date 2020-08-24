package com.melvyn.sfgpetclinic.services.map;

import com.melvyn.sfgpetclinic.model.Speciality;
import com.melvyn.sfgpetclinic.services.SpecialtiesService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Melvyn on 24/Aug/2020
 */
@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialtiesService {
    @Override
    public Set<Speciality> findAll () {
        return super.findAll ();
    }

    @Override
    public Speciality findByID (Long id) {
        return super.findByID (id);
    }

    @Override
    public Speciality save (Speciality object) {
        return super.save (object);
    }

    @Override
    public void delete (Speciality object) {
        super.delete (object);
    }

    @Override
    public void deleteById (Long id) {
        super.deleteById (id);
    }
}
