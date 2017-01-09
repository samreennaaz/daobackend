package com.back.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.back.model.Supplier;
@ComponentScan("com")
@Repository("SupplierDaoImpl")
@Transactional
public class SupplierDaoImpl implements SupplierDao {
	@Autowired
	private SessionFactory sessionFactory;
	public void addSupplier(Supplier supplier) {
		Session session=sessionFactory.getCurrentSession();
		session.save(supplier);
		System.out.println("supplier done");
		
	}

}
