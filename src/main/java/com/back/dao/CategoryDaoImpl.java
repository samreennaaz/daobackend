package com.back.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.back.model.Category;

@Repository("categoryDaoImpl")
@Transactional
public abstract class CategoryDaoImpl implements CategoryDao {
	@Autowired
	private SessionFactory sessionFactory;
	public void CategoryDao(Category category) {
		Session session=sessionFactory.getCurrentSession();
		session.save(category);
		System.out.println("category done");
		
		
	}
}