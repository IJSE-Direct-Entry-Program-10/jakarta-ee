package lk.ijse.dep10.hello.api;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.apache.commons.dbcp2.BasicDataSource;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "CustomerServlet", value = "/customers")
public class CustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BasicDataSource pool = (BasicDataSource) getServletContext().getAttribute("pool");
        try (Connection connection = pool.getConnection()) {
            Statement stm = connection.createStatement();
            ResultSet rst = stm.executeQuery("SELECT * FROM Customer");
            request.setAttribute("resultSet", rst);
            getServletContext().getRequestDispatcher("/WEB-INF/page/list-all-customers.jsp")
                    .forward(request, response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
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
                getServletContext().getRequestDispatcher("/WEB-INF/page/customer-exists-error.jsp")
                        .forward(request, response);
                return;
            }

            PreparedStatement stm = connection
                    .prepareStatement("INSERT INTO Customer (id, name, address) VALUES (?, ?, ?)");
            stm.setString(1, id);
            stm.setString(2, name);
            stm.setString(3, address);
            stm.executeUpdate();

            getServletContext().getRequestDispatcher("/WEB-INF/page/successful-customer-response.jsp")
                    .forward(request, response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
