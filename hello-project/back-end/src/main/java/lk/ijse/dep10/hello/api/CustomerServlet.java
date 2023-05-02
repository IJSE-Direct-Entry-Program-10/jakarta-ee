package lk.ijse.dep10.hello.api;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.apache.commons.dbcp2.BasicDataSource;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(name = "CustomerServlet", value = "/customers")
public class CustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String address = request.getParameter("address");

        /* Let's do some server-side data validation */
        if (id == null || !id.matches("C\\d{3}")){
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "ID is empty or invalid");
            return;
        }else if (name == null || !name.trim().matches("[A-Za-z ]+")){
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Name is empty or invalid");
            return;
        }else if (address == null || address.trim().length() < 3){
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Address is empty or invalid");
            return;
        }

        BasicDataSource pool = (BasicDataSource) getServletContext().getAttribute("pool");
        try (Connection connection = pool.getConnection()) {
            /* Server-side business validation */
            PreparedStatement stmExist = connection.prepareStatement("SELECT * FROM Customer WHERE id=?");
            stmExist.setString(1, id);
            if (stmExist.executeQuery().next()){
                response.setStatus(HttpServletResponse.SC_CONFLICT);
                response.setContentType("text/html");
                try (PrintWriter out = response.getWriter()) {
                    out.println("<body style='text-align: center; font-family: Ubuntu'>\n" +
                            "    <h2 style='color: red;'>Customer ID: " + id +" already exists</h2>\n" +
                            "    <p><a href='http://localhost:5000/save-customer.html'>Try again</a></p>\n" +
                            "</body>");
                }
                return;
            }

            PreparedStatement stm = connection
                    .prepareStatement("INSERT INTO Customer (id, name, address) VALUES (?, ?, ?)");
            stm.setString(1, id);
            stm.setString(2, name);
            stm.setString(3, address);
            stm.executeUpdate();

            response.setStatus(HttpServletResponse.SC_CREATED);
            response.setContentType("text/html");
            try (PrintWriter out = response.getWriter()) {
                out.println("<body style='text-align: center; font-family: Ubuntu'>\n" +
                        "    <h2>Customer ID: "+ id +" has been saved successfully</h2>\n" +
                        "    <p>Click to add a <a href='http://localhost:5000/save-customer.html'>new customer</a></p>\n" +
                        "</body>");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
