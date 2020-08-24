package com.melvyn.sfgpetclinic.bootstrap;

import com.melvyn.sfgpetclinic.model.Owner;
import com.melvyn.sfgpetclinic.model.PetType;
import com.melvyn.sfgpetclinic.model.Vet;
import com.melvyn.sfgpetclinic.services.OwnerService;
import com.melvyn.sfgpetclinic.services.PetTypeService;
import com.melvyn.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Melvyn on 18/Aug/2020
 */
/*
    CommandLineRunner is a Spring Boot Class
 */

@Component  // This a Spring Bean it gets registered in the Spring context, what happens under the covers of Spring is
            // this is going to execute it. So when the context is up and ready it is go to call this 'run' method.
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader (OwnerService ownerService,
                       VetService vetService,
                       PetTypeService petTypeService) {                        // We need to generate the constructor
                                                                               // Spring will do an auto @Autowired
        this.ownerService = ownerService;           // Auto injected into the constructor
        this.vetService = vetService;               // Auto injected into the constructor
        this.petTypeService = petTypeService;       // Auto injected into the constructor
    }

    @Override
    public void run (String... args) throws Exception {

        PetType dog = new PetType ();
        dog.setName ("Dog");
        PetType savedDogPetType = petTypeService.save (dog);

        PetType cat = new PetType ();
        cat.setName ("Cat");
        PetType savedCatPetType = petTypeService.save (cat);

        PetType tiger = new PetType ();
        tiger.setName ("Tiger");
        PetType savedTigerPetType = petTypeService.save (tiger);

        Owner owner1 = new Owner ();
        owner1.setFirstName ("Michael");
        owner1.setLastName ("Weston");

        ownerService.save (owner1);

        Owner owner2 = new Owner ();
        owner2.setFirstName ("Fiona");
        owner2.setLastName ("Glenanne");

        ownerService.save (owner2);

        Owner owner3 = new Owner ();
        owner3.setFirstName ("Angela");
        owner3.setLastName ("Shepherd");

        ownerService.save (owner3);

        System.out.println ("Loaded Owners....");

        Vet vet1 = new Vet ();
        vet1.setFirstName ("Sam");
        vet1.setLastName ("Axe");

        vetService.save (vet1);

        Vet vet2 = new Vet ();
        vet2.setFirstName ("Jessie");
        vet2.setLastName ("Porter");

        vetService.save (vet2);

        Vet vet3 = new Vet ();
        vet3.setFirstName ("Martin");
        vet3.setLastName ("Shepherd");

        vetService.save (vet3);

        System.out.println ("Loaded Vets....");


    }
}
