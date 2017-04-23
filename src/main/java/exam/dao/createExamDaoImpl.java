package exam.dao;

import java.sql.Connection;
import javax.swing.JOptionPane;

import exam.Exam;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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

	@Override
	public List<String> getCategory() {
		List<String> list = new ArrayList<>();
		try{
			Connection connection = DatabaseUtils.getConnection();
			PreparedStatement statement=connection.prepareStatement("select Category from exams ");

			ResultSet resultSet=statement.executeQuery();
			while(resultSet.next())
			{
				list.add(resultSet.getString(1));
			}


		}
		catch(SQLException sq)		
		{
			sq.printStackTrace();
		}
		return list;
	}


	@Override
	public List<String> getExams(String category) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		try{
			Connection connection = DatabaseUtils.getConnection();
			PreparedStatement statement=connection.prepareStatement("select exam_name from exams where Category=? ");
statement.setString(1, category);
			ResultSet resultSet=statement.executeQuery();
			while(resultSet.next())
			{
				list.add(resultSet.getString(1));
			}


		}
		catch(SQLException sq)		
		{
			sq.printStackTrace();
		}
		return list;
		
	}

	@Override
	public Exam getExamDetails(String category, String exam) {
		// TODO Auto-generated method stub
		Exam aExam=new Exam();
		try{
			Connection connection = DatabaseUtils.getConnection();
			PreparedStatement statement=connection.prepareStatement("select * from exams where Category=? and exam_name=?");
statement.setString(1, category);
statement.setString(1, exam);
			ResultSet resultSet=statement.executeQuery();
			while(resultSet.next())
			{
				aExam.setExam_id(resultSet.getString(1));
				aExam.setExam_name(resultSet.getString(2));
				aExam.setCategory(resultSet.getString(3));
				aExam.setExam_date(resultSet.getString(4));
				aExam.setStart_time(resultSet.getString(5));
				aExam.setEnd_time(resultSet.getString(6));
				aExam.setSemester(resultSet.getString(7));
				aExam.setYear(resultSet.getString(8));
				aExam.setLocation(resultSet.getString(9));
				aExam.setDeadline(resultSet.getString(10));
			}
		}
		catch(SQLException sq)		
		{
			sq.printStackTrace();
		}
		return aExam;
	}

	
	
	
}
