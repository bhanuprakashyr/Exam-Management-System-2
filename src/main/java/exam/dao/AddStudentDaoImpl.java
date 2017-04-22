package exam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AddStudentDaoImpl implements AddStudentDao {
	public void addStudent(int id,String fName,String lName,String DOB,String major,String email,int phone,String address,String city,String state,int zip,String country)
	{
		try{
			Connection connection = DatabaseUtils.getConnection();
			PreparedStatement statement=connection.prepareStatement("insert into student(Student_id,Fname,Lname,DOB,Major,Emailid,Phone,Address ,City,State,Zipcode,Country) values(?,?,?,str_to_date(?, '%Y-%m-%d'),?,?,?,?,?,?,?,?)");
			statement.setInt(1, id);
			statement.setString(2, fName);
			statement.setString(3, lName);
			statement.setString(4, DOB);
			statement.setString(5, major);
			statement.setString(6, email);
			statement.setInt(7, phone);
			statement.setString(8, address);
			statement.setString(9, city);
			statement.setString(10, state);
			statement.setInt(11, zip);
			statement.setString(12, country);
			PreparedStatement statement1=connection.prepareStatement("insert into user(id,password) values(?,?)");
			statement1.setInt(1, id);
			statement1.setInt(2, id);
			int count= statement.executeUpdate();

			if(count>0)
			{
				System.out.println("Successfully added");
				statement1.executeQuery();
			}
			else
			{
				System.out.println("Student record addition failed");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
