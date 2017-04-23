package exam.dao;

import java.util.List;

import exam.Exam;

public interface CreateExamDao {
	void createExam(String examId,String examName,String category,String date,String startTime,String endTime,String location,String sem,String year,String deadline);
	List<String> getCategory();
	List<String> getExams(String category);
	Exam getExamDetails(String category,String exam);
}
