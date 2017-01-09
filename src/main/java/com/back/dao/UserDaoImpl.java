package com.back.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.back.model.Users;

@Repository("userDaoImpl")
@Transactional
public class UserDaoImpl implements UsersDao {
	@Autowired
	private SessionFactory sessionFactory;
	private static final org.slf4j.Logger logger=LoggerFactory.getLogger(UserDaoImpl.class);
	public void registerUser(Users user) {
		logger.info("good bye");
		Session session=sessionFactory.getCurrentSession();
		session.save(user);
		System.out.println("user saved");
	
}
}