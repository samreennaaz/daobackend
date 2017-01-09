package com.back.model;
import javax.persistence.*;

import org.springframework.context.annotation.ComponentScan;
@Entity
@ComponentScan("com")
public class Category {
	@Id@GeneratedValue
	private int CategoryId;
	private String CategoryName;
	public int getCategoryId() {
		return CategoryId;
	}
	public void setCategoryId(int categoryId) {
		CategoryId = categoryId;
	}
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	public void Name(String string) {
		// TODO Auto-generated method stub
		
	}
	public void Id(int i) {
		// TODO Auto-generated method stub
		
	}

}
