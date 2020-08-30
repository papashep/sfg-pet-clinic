package com.melvyn.sfgpetclinic.services.map;

import com.melvyn.sfgpetclinic.model.Visit;
import com.melvyn.sfgpetclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Melvyn on 30/Aug/2020
 */
@Service
@Profile({"default", "map"})
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Set<Visit> findAll () {
        return super.findAll ();
    }

    @Override
    public Visit findByID (Long id) {
        return super.findByID (id);
    }

    @Override
    public Visit save( Visit visit ) {
        if( visit.getPet() == null || visit.getPet().getOwner() == null
                                   || visit.getPet ().getId () == null
                                   || visit.getPet ().getOwner ().getId () == null ) {
            throw new RuntimeException ("Invalid Visit");
        }
        return super.save (visit);
    }

    @Override
    public void delete (Visit object) {
        super.delete (object);
    }

    @Override
    public void deleteById (Long id) {
        super.deleteById (id);
    }

}
