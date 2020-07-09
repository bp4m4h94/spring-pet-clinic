package ryan.springframework.sfpetclinic.service;

import java.util.Set;

public interface CrudService<T, ID> {

    T findById(ID id);

    T save(T object);

    void deleteById(ID id);

    void delete(T object);

    Set<T> findAll();
}
