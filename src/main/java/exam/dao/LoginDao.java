package exam.dao;


public interface LoginDao {
    boolean isValidateLoginCredentials(String userName, String credentials);

}
