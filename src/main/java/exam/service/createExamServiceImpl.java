package exam.service;

import exam.dao.CreateExamDao;
import exam.dao.createExamDaoImpl;

public class createExamServiceImpl implements CreateExamService {

	@Override
	public void createExam(String examId, String examName, String category, String date, String startTime,
			String endTime, String location, String sem, String year, String deadline) {
		// TODO Auto-generated method stub
		CreateExamDao createStudentDao=new createExamDaoImpl();
		createStudentDao.createExam(examId, examName, category, date, startTime, endTime, location, sem, year, deadline);
	}

}
