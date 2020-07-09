package ryan.springframework.sfpetclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity {

    PetType petType;
    Vet vet;
    LocalDate birthDate;


}
