package exam.dao;

import java.sql.Connection;

public class LoginDaoImpl implements LoginDao{
    @Override
    public boolean isValidateLoginCredentials(String userName, String credentials) {
        Connection connection = DatabaseUtils.getConnection();
        return false;
    }
}
