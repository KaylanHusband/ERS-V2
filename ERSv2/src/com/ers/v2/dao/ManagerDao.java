package com.ers.v2.dao;

import com.ers.v2.models.Manager;

public interface ManagerDao {
	public boolean createManager(Manager m);
	public int loginManager(String userName, String passWord);
}
