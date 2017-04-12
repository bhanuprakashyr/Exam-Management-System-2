package exam.service;

import exam.dao.LoginDao;
import exam.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService {

    @Override
    public boolean isValidateLoginCredentials(String userName, String credentials) {
        LoginDao loginDao = new LoginDaoImpl();
        boolean isValidUser = loginDao.isValidateLoginCredentials(userName, credentials);
        return isValidUser;
    }
}
