package net.clinic.servlet;

import net.clinic.logic.Clinic;
import net.clinic.logic.Customer;
import net.clinic.servlet.CustomerAddServlet;
import org.junit.Test;
import org.mockito.Mockito;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @author Wamdue
 * @version 1.0
 * @since 09.04.2017
 */
public class UserCRUDServletTest extends Mockito {

    final Map<Integer, Customer> cache = Clinic.getMap();

    @Test
    public void createCustomer() throws ServletException, IOException{
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);

        when(request.getParameter("customerName")).thenReturn("test");
        when(request.getParameter("petName")).thenReturn("testPet");
        when(request.getParameter("petAge")).thenReturn("-1");

        assertTrue(cache.isEmpty());

        new CustomerAddServlet().doPost(request, response);

        verify(request, atLeastOnce()).getParameter("customerName");
        verify(request, atLeastOnce()).getParameter("petName");
        verify(request, atLeastOnce()).getParameter("petAge");

        assertFalse(cache.isEmpty());
    }
}
