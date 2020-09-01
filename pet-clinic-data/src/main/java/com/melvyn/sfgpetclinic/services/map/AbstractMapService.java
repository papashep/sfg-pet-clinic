package com.melvyn.sfgpetclinic.services.map;

import com.melvyn.sfgpetclinic.model.BaseEntity;

import java.util.*;

/**
 * Created by Melvyn on 16/Aug/2020
 */
public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findByID(ID id) {
        return map.get (id);
    }

    T save(T object) {
        if (object != null) {
            if (object.getId () == null) {
                object.setId ((getNextId ()));
            }
            map.put (object.getId (),object);
        } else {
            throw new RuntimeException ("Object cannot be null");
        }

        return object;
    }

    void deleteById(ID id) {
        map.remove (id);
    }

    void delete(T object) {
        map.entrySet ().removeIf (entry -> entry.getValue ().equals (object));
    }

    private Long getNextId() {
        Long nextId = null;
        try {
            nextId = Collections.max(map.keySet ()) + 1;
        } catch (NoSuchElementException e){
            nextId = 1L;
        }
        return nextId;
    }
}
