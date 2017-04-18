package exam.service;

import exam.dao.AddStudentDao;
import exam.dao.AddStudentDaoImpl;

public class AddStudentServiceImpl implements AddStudentService {

	@Override
	public void addStudent(int id, String fname, String lname, String DOB, String major, String email, int phone,
			String address, String city, String state, int zip, String country) {
		// TODO Auto-generated method stub
		AddStudentDao addStudentDao=new AddStudentDaoImpl();
		addStudentDao.addStudent(id, fname, lname, DOB, major, email, phone, address, city, state, zip, country);
	}

}
