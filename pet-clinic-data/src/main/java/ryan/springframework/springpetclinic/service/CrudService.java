package ryan.springframework.springpetclinic.service;

import ryan.springframework.springpetclinic.model.Owner;

import java.util.Set;

public interface CrudService<T, ID> {

    Set<T> findByLastName(String lastName);

    T findById(ID id);

    T save(T object);

    void deleteById(ID id);

    void delete(T object);

    Set<T> findAll();
}
