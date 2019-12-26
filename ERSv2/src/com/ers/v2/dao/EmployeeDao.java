package com.ers.v2.dao;

import java.util.List;

import com.ers.v2.models.Employee;



public interface EmployeeDao {
	public boolean createEmployee(Employee e);
	public List<Employee> getEmployee();
	public List<Employee> getEmployee(int id);
	public int loginEmployee(String userName, String passWord);
	public boolean changeEmployeeUname(String name,int id);
	public boolean changeEmployeePass(String pass, int id);
	public boolean changeEmployeeCredentials(String name, String pass, int id);
}
