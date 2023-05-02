package lk.ijse.dep10.api;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Map;

@WebServlet(urlPatterns = "/first")
public class FirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("First Servlet");
        resp.getWriter().println("<h1>First Servlet</h1>");

        /* Absolute Path Relative to Root (Servlet Context) */
//        getServletContext().getRequestDispatcher("/second")
//                .forward(req, resp);

        /* Request: Relative where I am right now */
        //req.getRequestDispatcher("./second").include(req, resp);

        getServletContext().getNamedDispatcher("abc")
                        .include(req, resp);

        resp.getWriter().println("<h1>Anea mekawath Penna Please!</h1>");
        System.out.println("End of First Servlet");
    }
}
