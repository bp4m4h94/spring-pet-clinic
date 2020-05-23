package ryan.springframework.springpetclinic.service;

import ryan.springframework.springpetclinic.model.Owner;
import ryan.springframework.springpetclinic.service.map.AbstractMapService;

import java.util.Set;

public interface CrudService<T, ID> {

     T findById(ID id);

    T save(ID id, T object);

    void deleteById(ID id);

    void delete(T object);

    Set<T> findAll();
}
