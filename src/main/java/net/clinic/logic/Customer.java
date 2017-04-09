package net.clinic.logic;

import net.clinic.logic.pets.Pet;

/**
 * @author Wamdue
 * @version 1.0
 * @since 05.04.2017
 */
public class Customer {

    private String name;
    private Pet pet;

    public Customer(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getName() {
        return name;
    }
}
