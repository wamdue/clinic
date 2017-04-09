package net.clinic;

import net.clinic.logic.Clinic;
import net.clinic.logic.Customer;
import net.clinic.logic.pets.Dog;
import org.junit.Test;
import net.clinic.logic.pets.Pet;

import java.util.Map;

import static org.junit.Assert.*;

/**
 * @author Wamdue
 * @version 1.0
 * @since 09.04.2017
 */
public class TestClinic {
    @Test
    public void testMap()
    {
        Pet pet = new Dog("Muhtar", 2);
        Customer customer = new Customer("Vasya", pet);
        Map<Integer, Customer> map = Clinic.getMap();
        map.put(Clinic.getNextId(), customer);
        assertEquals(1, Clinic.getMap().size());
    }
}
