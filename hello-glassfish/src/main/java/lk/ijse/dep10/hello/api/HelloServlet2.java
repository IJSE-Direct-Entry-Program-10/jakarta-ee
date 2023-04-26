package lk.ijse.dep10.hello.api;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class HelloServlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet(): " + req.getRemoteAddr());
        resp.getWriter().println("Hello I am from the HelloServlet2's doGet() method");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost(): " + req.getRemoteAddr());
        resp.getWriter().println("Hello I am from the HelloServlet2's doPost() method");
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPut(): " + req.getRemoteAddr());
        resp.getWriter().println("Hello I am from the HelloServlet2's doPut() method");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doDelete(): " + req.getRemoteAddr());
        resp.getWriter().println("Hello I am from the HelloServlet2's doDelete() method");
    }

}
