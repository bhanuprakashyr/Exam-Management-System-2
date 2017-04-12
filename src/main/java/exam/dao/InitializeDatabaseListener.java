package exam.dao;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.sql.Connection;
import java.sql.SQLException;

@WebListener
public class InitializeDatabaseListener implements ServletContextListener {



    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        Connection connection = DatabaseUtils.getConnection();
        try {
            connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        DatabaseUtils.getDatabaseTablesInfo().forEach((k,v)-> DatabaseUtils.createTable((String) v));

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }



}
