package lk.ijse.dep10.hello.api;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.apache.commons.dbcp2.BasicDataSource;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@WebServlet(name = "CustomerServlet", value = "/customers")
public class CustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doPost()");
        BasicDataSource dbcp = (BasicDataSource) getServletContext().getAttribute("dbcp");
        try (Connection connection = dbcp.getConnection()) {
            System.out.println(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
