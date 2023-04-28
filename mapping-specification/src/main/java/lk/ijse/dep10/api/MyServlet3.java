package lk.ijse.dep10.api;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@WebServlet(name = "MyServlet2", urlPatterns = "/dep/*/*")
public class MyServlet3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
            out.println("<body style='display: flex; flex-direction: column; justify-content: center; align-items: center; height: 95vh;'>\n" +
                    "<h1>Hello I am from My Servlet 2</h1>\n" +
                    "<h2>Server time is now: "+ LocalDateTime.now() +"</h2>\n" +
                    "</body>");
        }
    }
}
