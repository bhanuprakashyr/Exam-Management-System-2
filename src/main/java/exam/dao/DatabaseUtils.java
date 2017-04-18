package exam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;


public class DatabaseUtils {
    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Vivek Patil\\git\\ems.db");
            return connection;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static Map getDatabaseTablesInfo() {
        Map createTableQueries = new HashMap();
        createTableQueries.put("user", "create table if not exists user (id VARCHAR(20), password VARCHAR(20), PRIMARY KEY (id))");
        
        return createTableQueries;
    }
    
    


    public static void createTable(String query) {
        Statement statement = null;
        Connection connection = null;
        try {
            System.out.println("Executing query"+ query);
            connection = getConnection();
            statement = connection.createStatement();
            statement.execute(query);
            statement.close();
            connection.close();
            System.out.println("Successfully complete");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
