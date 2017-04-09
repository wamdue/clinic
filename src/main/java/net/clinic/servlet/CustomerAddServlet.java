package net.clinic.servlet;

import net.clinic.logic.Clinic;
import net.clinic.logic.Customer;
import net.clinic.logic.pets.Dog;
import net.clinic.logic.pets.Pet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @author Wamdue
 * @version 1.0
 * @since 09.04.2017
 */
public class CustomerAddServlet extends HttpServlet {

    private Map<Integer, Customer> cache = Clinic.getMap();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("html/text");

        int id = Clinic.getNextId();
        String name = req.getParameter("customerName");
        String petName = req.getParameter("petName");
        int age = Integer.valueOf(req.getParameter("petAge"));

        Pet pet = new Dog(petName, age);
        Customer cust = new Customer(name, pet);

        this.cache.put(id, cust);

        resp.sendRedirect(String.format("%s%s",req.getContextPath(), "/views/MainFrame.jsp"));
    }
}
