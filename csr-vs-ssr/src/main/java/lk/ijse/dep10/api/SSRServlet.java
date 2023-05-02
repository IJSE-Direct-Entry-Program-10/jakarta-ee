package lk.ijse.dep10.api;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet(name = "SSRServlet", value = "/ssr")
public class SSRServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String text = "SSR - Server-Side Rendering via Servlet";
        response.getWriter().println("<html><head></head><body>");
        response.getWriter().println("<h1>" + text + "</h1>");
        response.getWriter().println("<h2>" + LocalDateTime.now() + "</h2>");
        response.getWriter().println("<ol>");
        for (var str : new String[]{"First", "Second", "Third", "Fourth", "Fifth"}) {
            response.getWriter().println("<li>"+ str +"</li>");
        }
        response.getWriter().println("</ol>");
        response.getWriter().println("</body></html>");
    }
}
