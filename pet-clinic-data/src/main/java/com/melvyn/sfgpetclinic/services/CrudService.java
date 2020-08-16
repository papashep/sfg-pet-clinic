package com.melvyn.sfgpetclinic.services;

import java.util.Set;

/**
 * Created by Melvyn on 16/Aug/2020
 */
public interface CrudService<T,ID> {

    Set<T> findAll ();

    T findByID(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);

}
