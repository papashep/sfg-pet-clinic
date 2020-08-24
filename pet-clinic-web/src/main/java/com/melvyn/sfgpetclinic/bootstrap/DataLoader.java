package com.melvyn.sfgpetclinic.bootstrap;

import com.melvyn.sfgpetclinic.model.*;
import com.melvyn.sfgpetclinic.services.OwnerService;
import com.melvyn.sfgpetclinic.services.PetTypeService;
import com.melvyn.sfgpetclinic.services.SpecialtyService;
import com.melvyn.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

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
    private final SpecialtyService specialtyService;

    public DataLoader (OwnerService ownerService,
                       VetService vetService,
                       PetTypeService petTypeService,
                       SpecialtyService specialtyService) {                    // We need to generate the constructor
                                                                               // Spring will do an auto @Autowired
        this.ownerService = ownerService;           // Auto injected into the constructor
        this.vetService = vetService;               // Auto injected into the constructor
        this.petTypeService = petTypeService;       // Auto injected into the constructor
        this.specialtyService = specialtyService;   // Auto injected into the constructor
    }

    @Override
    public void run (String... args) throws Exception {

        int count = petTypeService.findAll ().size ();

        if ( count == 0 ) {
            loadData ();
        }
    }

    private void loadData () {

        PetType dog = new PetType ();
        dog.setName ("Dog");
        PetType savedDogPetType = petTypeService.save (dog);

        PetType cat = new PetType ();
        cat.setName ("Cat");
        PetType savedCatPetType = petTypeService.save (cat);

        PetType tiger = new PetType ();
        tiger.setName ("Tiger");
        PetType savedTigerPetType = petTypeService.save (tiger);

        System.out.println ("Created Pet Types....");

        Speciality radiology = new Speciality ();
        radiology.setDescription ("Radiology");
        Speciality savedRadiology = specialtyService.save (radiology);

        Speciality surgery = new Speciality ();
        surgery.setDescription ("Surgery");
        Speciality savedSurgery = specialtyService.save (surgery);

        Speciality dentistry = new Speciality ();
        dentistry.setDescription ("Dentistry");
        Speciality savedDentistry = specialtyService.save (dentistry);

        System.out.println ("Created Vet Specialities....");

        Owner owner1 = new Owner ();
        owner1.setFirstName ("Michael");
        owner1.setLastName ("Weston");
        owner1.setAddress ("123 Brickerel");
        owner1.setCity ("Miami");
        owner1.setTelephone ("123123123");

        Pet mikesPet = new Pet ();
        mikesPet.setPetType (savedDogPetType);
        mikesPet.setOwner (owner1);
        mikesPet.setBirthDate (LocalDate.now ());
        mikesPet.setName ("Rosco");
        owner1.getPets ().add(mikesPet);

        ownerService.save (owner1);

        Owner owner2 = new Owner ();
        owner2.setFirstName ("Fiona");
        owner2.setLastName ("Glenanne");
        owner2.setAddress ("123 Brickerel");
        owner2.setCity ("Miami");
        owner2.setTelephone ("123123123");
        Pet fionaCat = new Pet ();
        fionaCat.setPetType (savedCatPetType);
        fionaCat.setOwner (owner2);
        fionaCat.setBirthDate (LocalDate.of (2015,4,16));
        fionaCat.setName ("Twinkle");
        owner2.getPets ().add(fionaCat);

        ownerService.save (owner2);

        Owner owner3 = new Owner ();
        owner3.setFirstName ("Angela");
        owner3.setLastName ("Shepherd");
        owner3.setAddress ("88 Westfield Road");
        owner3.setCity ("Barton Upon Humber");
        owner3.setTelephone ("+44 01652 635727");
        Pet angelaTiger = new Pet ();
        angelaTiger.setPetType (savedTigerPetType);
        angelaTiger.setOwner (owner3);
        angelaTiger.setBirthDate (LocalDate.of (2018,10,19));
        angelaTiger.setName ("Pussy");
        owner3.getPets ().add(angelaTiger);

        ownerService.save (owner3);

        System.out.println ("Loaded Owners....");

        Vet vet1 = new Vet ();
        vet1.setFirstName ("Sam");
        vet1.setLastName ("Axe");
        vet1.getSpecialities ().add (savedRadiology);

        vetService.save (vet1);

        Vet vet2 = new Vet ();
        vet2.setFirstName ("Jessie");
        vet2.setLastName ("Porter");
        vet2.getSpecialities ().add (savedSurgery);

        vetService.save (vet2);

        Vet vet3 = new Vet ();
        vet3.setFirstName ("Martin");
        vet3.setLastName ("Shepherd");
        vet3.getSpecialities ().add (savedDentistry);

        vetService.save (vet3);

        System.out.println ("Loaded Vets....");
    }
}
