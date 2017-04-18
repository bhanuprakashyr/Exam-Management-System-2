package exam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDaoImpl implements LoginDao{
	@Override
	public boolean isValidateLoginCredentials(String userName, String credentials)  {
		int rowCount=0;
		try{
			Connection connection = DatabaseUtils.getConnection();		
			PreparedStatement statement=connection.prepareStatement("select count(*) from user where id=? and password=?");
			statement.setString(1, userName);
			statement.setString(2, credentials);
			ResultSet resultSet= statement.executeQuery();
			while(resultSet.next())
			{
				rowCount=resultSet.getInt(1);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		if(rowCount>0)
		{
			System.out.println("Student present in user table"+userName);
			return true;
		}
		else
		{
			System.out.println("Student not present in user table"+userName);
			return false;
		}

	}
}
