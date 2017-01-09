package com.back.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.back.model.Product;


@Repository("productDaoImpl")
@Transactional
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private SessionFactory sessionFactory;
	public void addProduct(Product product) {
		Session session=sessionFactory.getCurrentSession();
		session.save(product);
		System.out.println("product saved");
		
	}

}
