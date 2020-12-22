package com.ers.v2.actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.ers.v2.daoImpl.EmployeeDaoImpl;
import com.ers.v2.daoImpl.ManagerDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{
	
	private Map<String,Object> userSession;

	private String username;
	private String password;
	
	private EmployeeDaoImpl emplDaoImpl;
	private ManagerDaoImpl manDaoImpl;
	
	
	private static final long serialVersionUID = 1L;
	
	
	@Override
	public String execute() {
		return "success";
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		userSession = session;
//		emplDaoImpl = new EmployeeDaoImpl();
//		manDaoImpl = new ManagerDaoImpl();
//		
//		if(emplDaoImpl.loginEmployee(username, password)!=0) {
//			session.put("Emp_ID", emplDaoImpl.loginEmployee(username, password));
//		}else if(manDaoImpl.loginManager(username, password)!=0) {
//			session.put("Man_ID", manDaoImpl.loginManager(username, password));
//		}
	}
	
	public String userLogin() {
		emplDaoImpl = new EmployeeDaoImpl();
		manDaoImpl = new ManagerDaoImpl();
		if(emplDaoImpl.loginEmployee(username, password)!=0) {
			userSession.put("Emp_ID", emplDaoImpl.loginEmployee(username, password));
			return "employee";
		}else if(manDaoImpl.loginManager(username, password)!=0) {
			return "manager";
		}
			return "fail";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
