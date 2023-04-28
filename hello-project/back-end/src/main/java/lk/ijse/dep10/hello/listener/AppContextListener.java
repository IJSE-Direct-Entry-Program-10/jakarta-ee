package lk.ijse.dep10.hello.listener;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.SQLException;

@WebListener
public class AppContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        BasicDataSource dbcp = new BasicDataSource();
        dbcp.setUrl("jdbc:mysql://localhost:3306/dep10_hello");
        dbcp.setUsername("root");
        dbcp.setPassword("mysql");
        dbcp.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dbcp.setInitialSize(10);
        dbcp.setMaxTotal(50);
        ServletContext servletContext = sce.getServletContext();
        servletContext.setAttribute("dbcp", dbcp);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        BasicDataSource dbcp = (BasicDataSource) servletContext.getAttribute("dbcp");
        try {
            dbcp.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
