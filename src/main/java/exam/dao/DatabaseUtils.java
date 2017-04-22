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
        createTableQueries.put("users", "create table if not exists users (userid int(9) not null ,pwd varchar(32) not null,primary key (userid))");
        createTableQueries.put("student","create table if not exists student(student_id int(10) not null ,First_name varchar(32) not null,Last_name varchar(32) not null,DOB date not null,Email_Id varchar(32) not null,Phone int(10) not null,Major varchar(32) not null,Address varchar(32) not null,City varchar(32) not null,State varchar(32) not null,Zipcode int(5) not null,Country varchar(32) not null,primary key(student_id))");
        createTableQueries.put("exam","create table exam(exam_id varchar(10) not null ,Exam_name varchar(32) not null,Category varchar(32) not null,Exam_date date not null,Start_time time not null,End_time time not null,Sem varchar(32) not null,academic_year date not null,Location varchar(32) not null,deadline date not null,primary key(exam_id))");
        createTableQueries.put("student_exam","create table if not exists student_exam(student_id int(10) not null,exam_id varchar(10) not null,primary key(student_id,exam_id),result varchar(10) not null,publish boolean default false,grade varchar(2) not null,FOREIGN KEY (student_id) REFERENCES student(student_id),FOREIGN KEY (exam_id) REFERENCES exam(exam_id) )");
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
