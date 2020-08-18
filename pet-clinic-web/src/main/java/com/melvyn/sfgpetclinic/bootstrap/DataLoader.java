package com.melvyn.sfgpetclinic.bootstrap;

import com.melvyn.sfgpetclinic.model.Owner;
import com.melvyn.sfgpetclinic.model.Vet;
import com.melvyn.sfgpetclinic.services.OwnerService;
import com.melvyn.sfgpetclinic.services.VetService;
import com.melvyn.sfgpetclinic.services.map.OwnerServiceMap;
import com.melvyn.sfgpetclinic.services.map.VetServiceMap;
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


    public DataLoader () {      // We need to generate the constructor, not using Dependency Injection.
        ownerService = new OwnerServiceMap ();
        vetService = new VetServiceMap ();
    }

    @Override
    public void run (String... args) throws Exception {
        Owner owner1 = new Owner ();
        owner1.setId (1L);
        owner1.setFirstName ("Michael");
        owner1.setLastName ("Weston");

        ownerService.save (owner1);

        Owner owner2 = new Owner ();
        owner2.setId (2L);
        owner2.setFirstName ("Fiona");
        owner2.setLastName ("Glenanne");

        ownerService.save (owner2);

        System.out.println ("Loaded Owners....");

        Vet vet1 = new Vet ();
        vet1.setId (1L);
        vet1.setFirstName ("Sam");
        vet1.setLastName ("Axe");

        vetService.save (vet1);

        Vet vet2 = new Vet ();
        vet2.setId (2L);
        vet2.setFirstName ("Jessie");
        vet2.setLastName ("Porter");

        vetService.save (vet2);

        System.out.println ("Loaded Vets....");


    }
}
