package exam.dao;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class createExamDaoImpl implements CreateExamDao{

	@Override
	public void createExam(String examId, String examName, String category, String date, String startTime,
			String endTime, String location, String sem, String year, String deadline) {
		// TODO Auto-generated method stub
		try{
			Connection connection = DatabaseUtils.getConnection();
			PreparedStatement statement=connection.prepareStatement("insert into exam(exam_id,Exam_name,Category,Exam_date,Start_time,End_time,Sem,academic_year ,Location,deadline) values(?,?,?,?,?,?,?,?,?,?)");
			statement.setString(1, examId);
			statement.setString(2, examName);
			statement.setString(3, category);
			statement.setString(4, date);
			statement.setString(5, startTime);
			statement.setString(6, endTime);
			statement.setString(7, sem);
			statement.setString(8, year);
			statement.setString(9, location);
			statement.setString(10, deadline);
			int status=statement.executeUpdate();
			if(status>0)
			{
				JOptionPane.showMessageDialog(null, "Created Exam");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Exam Creation Failed");

			}
		}
		catch(SQLException sq)
		{
			sq.printStackTrace();
		}
	}

}
