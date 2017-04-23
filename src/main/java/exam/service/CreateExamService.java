package exam.service;

import java.util.List;

import exam.Exam;

public interface CreateExamService {

	void createExam(String examId,String examName,String category,String date,String startTime,String endTime,String location,String sem,String year,String deadline);
	List<String> getCategory();
	List<String> getExam(String category);
	Exam getExamDetails(String category,String exam);
}
