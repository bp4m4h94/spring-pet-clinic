package ryan.springframework.springpetclinic.service.map;

import ryan.springframework.springpetclinic.model.Pet;
import ryan.springframework.springpetclinic.service.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Pet findById(Long id) {
        return super.findByID(id);
    }

    @Override
    public Pet save(Long id, Pet object) {
        return super.save(id, object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }
}
