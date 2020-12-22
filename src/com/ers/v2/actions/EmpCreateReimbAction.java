package com.ers.v2.actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.ers.v2.daoImpl.ReimbursementDaoImpl;
import com.ers.v2.models.Reimbursement;
import com.opensymphony.xwork2.ActionSupport;

public class EmpCreateReimbAction extends ActionSupport implements SessionAware{
	
	private double reAmount;
	private String description;

	private static final long serialVersionUID = 1L;
	private Map<String,Object> userSession;
	
	private Reimbursement reimbursement;
	private ReimbursementDaoImpl reimbDaoImpl;
	
	@Override
	public String execute() {
		return "success";
	}
	
	public String createReimb() {
		reimbDaoImpl = new ReimbursementDaoImpl();
		
		if(userSession.containsKey("Emp_ID")) {
			int id = (int)userSession.get("Emp_ID");
			reimbursement = new Reimbursement(reAmount,description,id);
			reimbDaoImpl.createReimbursement(reimbursement);
			return "success";
		}
		return "fail";
	}
	
	public void setSession(Map<String, Object> session) {
		userSession = session;
	}

	public double getReAmount() {
		return reAmount;
	}

	public void setReAmount(double reAmount) {
		this.reAmount = reAmount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
