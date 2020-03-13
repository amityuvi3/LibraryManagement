package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.BookBean;
import com.model.RegistrationBean;
import com.tr.repository.BookBeanRepository;
import com.tr.repository.RegistrationBeanRepository;
@Service
public class LibraryMgmtDaoImpl implements LibraryMgmtDao {

	@Autowired
	RegistrationBeanRepository 	registrationBeanRepository;
	
	@Autowired
	 BookBeanRepository bookBeanRepository;
	@Override
	public RegistrationBean validateLogin(RegistrationBean registrartionBean) {
		
		return registrationBeanRepository.loginValidation(registrartionBean.getUserId(), registrartionBean.getPassword());
	}
	
	@Override
	public RegistrationBean validateUserId(RegistrationBean registrartionBean) {
		
		return registrationBeanRepository.userIdValidation(registrartionBean.getUserId());
	}
	

	@Override
	public double register(RegistrationBean registrationBean) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public BookBean bookValidation(int bookId) {
		
		return bookBeanRepository.bookValidation(bookId);
	}

}
