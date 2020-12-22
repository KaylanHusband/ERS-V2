package com.ers.v2.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ers.v2.dao.ManagerDao;
import com.ers.v2.models.Manager;
import com.ers.v2.util.ConnectionUtil;



public class ManagerDaoImpl implements ManagerDao {

	public boolean createManager(Manager m) {
		int managerCreated = 0;
		boolean result = false;
		String sql = "insert into ersv2.manager (manager_name,user_name,user_pass) values(?,?,?)";
		try(Connection c = ConnectionUtil.getConnection();
				PreparedStatement ps = c.prepareStatement(sql)){
				ps.setString(1, m.getName());
				ps.setString(2, m.getUserName());
				ps.setString(3, m.getPassWord());
				managerCreated = ps.executeUpdate();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		if(managerCreated!=0) {
			result = true;
		}
		return result;
	}

	@Override
	public int loginManager(String userName, String passWord) {
		String sql = "select manager_id from ersv2.manager where user_name = ? and user_pass = ?";
		String managerId;
		int id = 0;
		ResultSet rs;
		try(Connection c = ConnectionUtil.getConnection();
				PreparedStatement ps = c.prepareStatement(sql);){
				ps.setString(1, userName);
				ps.setString(2, passWord);
				rs = ps.executeQuery();
				while(rs.next()) {
					managerId = rs.getString(1);
					id = Integer.parseInt(managerId);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		return id;
	}


}
