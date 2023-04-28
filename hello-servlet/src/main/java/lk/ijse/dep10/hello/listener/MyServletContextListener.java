package lk.ijse.dep10.hello.listener;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class MyServletContextListener implements ServletContextListener {

    static{
        System.out.println("MyServletContextListener class object is beign initialized" + Thread.currentThread());
    }

    public MyServletContextListener() {
        System.out.println("MyServletContextListener(): " + Thread.currentThread());
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        System.out.println("Servlet Context Memory Location: " + servletContext);
        System.out.println(servletContext.getContextPath());
        System.out.println(Thread.currentThread() + ": Context has been just initialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println(Thread.currentThread() + ": My app is about to exit!");
    }
}
