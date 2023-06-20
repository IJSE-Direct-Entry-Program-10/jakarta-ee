package lk.ijse.dep10.app.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class Filter2 extends HttpFilter {

    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        System.out.println("Filter2: Incoming Request");
        System.out.println("Filter2: Dispatch to the next handler");
        chain.doFilter(req, res);
        System.out.println("Filter2: Outgoing Response");
    }
}
