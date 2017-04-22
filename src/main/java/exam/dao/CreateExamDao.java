package exam.dao;

public interface CreateExamDao {
	void createExam(String examId,String examName,String category,String date,String startTime,String endTime,String location,String sem,String year,String deadline);
}
