package lk.ijse.dep10.api;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ServiceServlet", value = "/services")
public class ServiceServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("doGet(): " + request.getParameter("param1"));
        response.getWriter().println("doGet(): " + request.getParameter("param2"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("doPost(): " + request.getParameter("param1"));
        response.getWriter().println("doPost(): " + request.getParameter("param2"));
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("doPut(): " + req.getParameter("param1"));
        response.getWriter().println("doPut(): " + req.getParameter("param2"));
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("doDelete(): " + req.getParameter("param1"));
        response.getWriter().println("doDelete(): " + req.getParameter("param2"));
    }
}
