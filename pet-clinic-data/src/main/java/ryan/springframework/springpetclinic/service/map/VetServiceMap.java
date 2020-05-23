package ryan.springframework.springpetclinic.service.map;

import ryan.springframework.springpetclinic.model.Owner;
import ryan.springframework.springpetclinic.model.Vet;
import ryan.springframework.springpetclinic.service.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Vet findById(Long id) {
        return super.findByID(id);
    }

    @Override
    public Vet save(Long id, Vet object) {
        return super.save(id, object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }
}
