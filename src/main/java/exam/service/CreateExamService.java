package exam.service;

public interface CreateExamService {

	void createExam(String examId,String examName,String category,String date,String startTime,String endTime,String location,String sem,String year,String deadline);
	}
