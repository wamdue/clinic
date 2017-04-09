package net.clinic.servlet;

import net.clinic.logic.Clinic;
import net.clinic.logic.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @author Wamdue
 * @version 1.0
 * @since 05.04.2017
 */
public class CustomersViewServlet extends HttpServlet {

    private Map<Integer, Customer> customers = Clinic.getMap();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("customers", customers);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/views/ViewCustomers.jsp");

        System.out.println(customers);
        dispatcher.forward(req, resp);
    }
}
