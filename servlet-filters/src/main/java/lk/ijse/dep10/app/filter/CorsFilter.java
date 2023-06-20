package lk.ijse.dep10.app.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//@WebFilter(filterName = "CorsFilter", urlPatterns = "/*")
public class CorsFilter extends HttpFilter {

    public CorsFilter() {
        System.out.println("CorsFilter: Constructor");
        System.out.println(getFilterConfig());
    }

    @Override
    public void init() throws ServletException {
        System.out.println("CorsFilter: Init()");
        System.out.println(getFilterConfig());
    }

    @Override
    public void destroy() {
        System.out.println("CorsFilter: Destroy()");
    }

    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        System.out.println("CorsFilter: Incoming Request");
        String origin = req.getHeader("Origin");
        if (origin == null){
            System.out.println("CorsFilter: Bad Request, CORS Policy Violation");
            res.sendError(HttpServletResponse.SC_BAD_REQUEST, "CORS Policy Violation");
            return;
        }

        res.setHeader("Access-Control-Allow-Origin", origin);

        System.out.println("CorsFilter: Dispatch to the next handler");
        chain.doFilter(req, res);
        System.out.println("CorsFilter: Outgoing Response");


    }
}
