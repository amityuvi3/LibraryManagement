package com.tr.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.model.RegistrationBean;
@Repository
public interface RegistrationBeanRepository extends JpaRepository<RegistrationBean, Integer>{

	@Query("select rb  from RegistrationBean rb where userId=?1 and password=?2")
	RegistrationBean loginValidation(String userId, String password);
	
	@Query("select rb  from RegistrationBean rb where userId=?1")
	RegistrationBean userIdValidation(String userId);
	
	@Transactional
    @Modifying
    @Query("delete from RegistrationBean rb where user_id=?1")
    void deleteByUserId(@Param("userId") String userId);
	
	@Query("select rb  from RegistrationBean rb where category=?1")
    List<RegistrationBean> getLibrarianDetails(String category);


}

