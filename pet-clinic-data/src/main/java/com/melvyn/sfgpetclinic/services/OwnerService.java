package com.melvyn.sfgpetclinic.services;

import com.melvyn.sfgpetclinic.model.Owner;

/**
 * Created by Melvyn on 15/Aug/2020
 */
public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
