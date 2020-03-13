package com.service;
import org.springframework.stereotype.Service;

import com.model.BookBean;
import com.model.RegistrationBean;

@Service
public interface LibraryMgmtDao {
	
	public double register(RegistrationBean registrationBean);
	public RegistrationBean validateLogin(RegistrationBean registrartionBean);
	public BookBean bookValidation(int bookId);
	public RegistrationBean validateUserId(RegistrationBean registrartionBean);
}
