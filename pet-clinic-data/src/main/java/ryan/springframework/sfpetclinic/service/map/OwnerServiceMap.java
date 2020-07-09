package ryan.springframework.sfpetclinic.service.map;

import org.springframework.stereotype.Service;
import ryan.springframework.sfpetclinic.model.Owner;
import ryan.springframework.sfpetclinic.service.OwnerService;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {


    @Override
    public Owner findById(Long id) {
        return super.findByID(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object);
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

    @Override
    public Set<Owner> findByLastName(String lastName) {
        return null;
    }
}
