package lk.ijse.dep10.hello.listener;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.SQLException;

@WebListener
public class AppContextListener implements ServletContextListener {

    /* Application Context == Servlet Context */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        BasicDataSource pool = new BasicDataSource();
        pool.setUrl("jdbc:mysql://localhost:3306/dep10_hello");
        pool.setUsername("root");
        pool.setPassword("mysql");
        pool.setDriverClassName("com.mysql.cj.jdbc.Driver");

        pool.setInitialSize(10);
        pool.setMaxTotal(50);

        ServletContext servletContext = sce.getServletContext();
        servletContext.setAttribute("pool", pool);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        BasicDataSource pool = (BasicDataSource) servletContext.getAttribute("pool");
        try {
            pool.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
