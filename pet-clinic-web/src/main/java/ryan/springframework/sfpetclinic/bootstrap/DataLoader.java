package ryan.springframework.sfpetclinic.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ryan.springframework.sfpetclinic.model.Owner;
import ryan.springframework.sfpetclinic.model.Vet;
import ryan.springframework.sfpetclinic.service.OwnerService;
import ryan.springframework.sfpetclinic.service.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    OwnerService ownerService;

    @Autowired
    VetService vetService;


    @Override
    public void run(String... args) throws Exception {

        Owner owner = new Owner();

        owner.setFirstName("Ryan");
        owner.setLastName("Tsai");
        owner.setId(20200627L);

        Owner owner2 = new Owner();

        owner2.setFirstName("Judy");
        owner2.setLastName("Kou");
        owner2.setId(20200628L);

        ownerService.save(owner);
        ownerService.save(owner2);


        Vet vet = new Vet();
        vet.setFirstName("Ryan");
        vet.setLastName("Tsai");
        vet.setId(20200627L);

        vetService.save(vet);

    }
}
