package ryan.springframework.springpetclinic.service.map;

import com.sun.xml.bind.v2.model.core.ID;
import ryan.springframework.springpetclinic.model.Owner;
import ryan.springframework.springpetclinic.service.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {


    @Override
    public Owner findById(Long id) {
        return super.findByID(id);
    }

    @Override
    public Owner save(Long id, Owner object) {
        return super.save(id, object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }
}
