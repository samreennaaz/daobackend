package com.back.model;
import javax.persistence.*;
@Entity
public class Supplier {
	@Id@GeneratedValue
private int SupplierId;
private String SupplierName;
private String SupplierAddress;
public int getSupplierId() {
	return SupplierId;
}
public void setSupplierId(int supplierId) {
	SupplierId = supplierId;
}
public String getSupplierName() {
	return SupplierName;
}
public void setSupplierName(String supplierName) {
	SupplierName = supplierName;
}
public String getSupplierAddress() {
	return SupplierAddress;
}
public void setSupplierAddress(String supplierAddress) {
	SupplierAddress = supplierAddress;
}

public static void Name(String string) {
	// TODO Auto-generated method stub
	
}
public void Id(int i) {
	// TODO Auto-generated method stub
	
}
public static void Address(Object hyderabad) {
	// TODO Auto-generated method stub
	
}
}
