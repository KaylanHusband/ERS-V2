package com.ers.v2.actions;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.ers.v2.daoImpl.ReimbursementDaoImpl;
import com.ers.v2.models.Reimbursement;
import com.opensymphony.xwork2.ActionSupport;

public class EmpViewPendReimbAction extends ActionSupport implements SessionAware {
	
	private static final long serialVersionUID = 1L;
	
	private Map<String,Object> userSession;
	private ReimbursementDaoImpl reimbDaoImpl;
	private List<Reimbursement> reimbursementList;
	private int id;
	
	@Override
	public String execute() {
		return "success";
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		userSession = session;
	}
	public String getReimb() {
		if(userSession.containsKey("Emp_ID")) {
			id = (int)userSession.get("Emp_ID");
			reimbursementList = reimbDaoImpl.employeeGetReimbursement(id);
		}
		return null;
	}


}
