package com.login.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.login.constants.LoginRegistrationConstants;
import com.login.entities.ServiceStatus;
import com.login.entities.UserDetails;
import com.login.entities.UserLoginInfo;
import com.login.exception.LoginRegistrationException;
import com.login.handler.UserRegisterHandler;

@Repository
public class LoginRegistrationDAOImpl implements LoginRegistrationDAO {
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Override
	public ServiceStatus registerUser(UserDetails userDetails) throws LoginRegistrationException {
		boolean result = false;
		ServiceStatus status = new ServiceStatus();
		UserRegisterHandler handler = new UserRegisterHandler();
		Map<String, String> paramMap = handler.getParamMap(userDetails);
		String sql = handler.getSQL();
		int rowCount = namedParameterJdbcTemplate.update(sql, paramMap);
		
		result = rowCount == 1;
		if(result) {
			status.setStatusCode(LoginRegistrationConstants.SERVICE_STATUS_SUCCESS);
			status.setDescription(LoginRegistrationConstants.REG_STATUS_SUCCESS_DESC);
		} else {
			status.setStatusCode(LoginRegistrationConstants.SERVICE_STATUS_FAIL);
			status.setDescription(LoginRegistrationConstants.REG_STATUS_FAIL_DESC);
		}
		return status;
	}

	@Override
	public UserDetails authenticate(UserLoginInfo userLoginInfo) throws LoginRegistrationException {
		// TODO Auto-generated method stub
		return null;
	}

}
