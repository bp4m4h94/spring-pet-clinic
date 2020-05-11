package ryan.springframework.springpetclinic.service;

import ryan.springframework.springpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastName);

    Owner findById(String id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
