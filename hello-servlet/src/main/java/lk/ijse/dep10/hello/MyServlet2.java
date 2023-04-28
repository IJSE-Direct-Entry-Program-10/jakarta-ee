package lk.ijse.dep10.hello;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet(name = "MyServlet2", urlPatterns = "/edf")
public class MyServlet2 extends HttpServlet {

    static{
        System.out.println("My Servlet 2 Class Object is being Initialized By: " + Thread.currentThread());
    }

    public MyServlet2() {
        System.out.println("My Servlet 2 Constructor(): " + Thread.currentThread());
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Init(ServletConfig): " + Thread.currentThread());
        super.init(config);
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Init(): " + Thread.currentThread());
        System.out.println(getServletConfig());
        System.out.println(getServletConfig().getServletContext());
        System.out.println(getServletContext().getContextPath());
    }

    @Override
    public void destroy() {
        System.out.println("Destroy(): " + Thread.currentThread());
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Service(req,res): " + Thread.currentThread());
        super.service(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("MyServlet2: doGet(): " + Thread.currentThread());
        resp.getWriter().println("I am from the MyServlet2: doGet()");
    }
}
