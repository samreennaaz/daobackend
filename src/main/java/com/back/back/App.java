package com.back.back;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.back.configuration.ApplicationConfig;
import com.back.dao.ProductDao;
import com.back.dao.UsersDao;
import com.back.model.Product;
import com.back.model.Users;

public class App 
{
	public static void main(String [] args)
	{
		AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(ApplicationConfig.class);
	
		//annotationConfigApplicationContext.refresh();
		UsersDao userDao=(UsersDao)annotationConfigApplicationContext.getBean("userDaoImpl");
		Users user=new Users();
		user.setUsername("test");
		user.setPassword("test");
		userDao.registerUser(user);
		ProductDao p=(ProductDao)annotationConfigApplicationContext.getBean("productDaoImpl");
		Product product=new Product();
		product.setPname("test");
		product.setPrice(900.0f);
		p.addProduct(product);
		
	}
}