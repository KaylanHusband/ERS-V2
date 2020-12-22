package com.ers.v2.actions;

import com.ers.v2.daoImpl.EmployeeDaoImpl;

public class test {
	private static EmployeeDaoImpl emp = new EmployeeDaoImpl();
	public static void main(String[] args) {
		System.out.println(emp.loginEmployee("kaylanhusband@gmail.com","kayjay709"));
	}

}
