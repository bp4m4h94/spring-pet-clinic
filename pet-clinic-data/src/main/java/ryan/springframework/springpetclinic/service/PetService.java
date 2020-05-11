package ryan.springframework.springpetclinic.service;

import ryan.springframework.springpetclinic.model.Owner;
import ryan.springframework.springpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(String id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
