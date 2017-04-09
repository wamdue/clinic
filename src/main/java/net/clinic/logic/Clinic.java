package net.clinic.logic;

import net.clinic.logic.pets.Pet;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Wamdue
 * @version 1.0
 * @since 05.04.2017
 */
public class Clinic {

    private static final AtomicInteger counter = new AtomicInteger(0);
    private static final ConcurrentHashMap<Integer, Customer> customers = new ConcurrentHashMap<>();

    public void addCustomer(Customer customer){
        customers.put(counter.getAndIncrement(), customer);
    }

    public void removeCustomer(int id){
        customers.remove(id);
    }

    public static Collection<Customer> getCustomersList(){
        return customers.values();
    }

    public static Map<Integer, Customer> findCustomer(String name)
    {
        HashMap<Integer, Customer> map = new HashMap<>();

        if(name != null && name != "")
            for(Map.Entry<Integer, Customer> cust : customers.entrySet()){
                if(cust.getValue().getName().contains(name))
                    map.put(cust.getKey(), cust.getValue());
            }

        return map;
    }

    public static Pet getCustomerPets(int id){
        return customers.get(id).getPet();
    }

    public static int getNextId(){
        return counter.getAndIncrement();
    }

    public static int getCurrentId(){
        return counter.get();
    }

    public static Map<Integer, Customer> getMap(){
        return customers;
    }


    public Collection<Pet> getPetsList()
    {
        Collection<Pet> pets = new CopyOnWriteArrayList<Pet>();

        getCustomersList().forEach((x) -> pets.add(x.getPet()));

        return pets;
    }

}
