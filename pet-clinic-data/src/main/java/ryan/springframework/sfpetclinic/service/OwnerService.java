package ryan.springframework.sfpetclinic.service;

import ryan.springframework.sfpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    Set<Owner> findByLastName(String lastName);

}
