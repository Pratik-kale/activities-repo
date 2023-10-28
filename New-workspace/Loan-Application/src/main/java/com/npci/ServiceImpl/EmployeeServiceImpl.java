package com.npci.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.beans.CreditScore;
import com.npci.beans.Employee;
import com.npci.beans.LoanApp;
import com.npci.dao.CreditDao;
import com.npci.dao.EmployeeDao;
import com.npci.dao.LaonAppDao;
import com.npci.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao empDao;
	@Autowired
	private LaonAppDao loanAppDao;
	@Autowired
	private CreditDao creditDao;
	
	Employee emp = new Employee();
	
	@Override
	public String empLogin(String emailId, String password) {
		
		Employee emp = empDao.findByEmailId(emailId);
		
		if(emp != null && emp.getPassword().equals(password)) {
			return "Login Successfull";
		}else
		return "Unauthorized emaild or Password";
	}

	@Override
	public String updateLoanApp() {
		LoanApp loanApp = new LoanApp();
		loanApp.setStatus("Approved");
		loanAppDao.save(loanApp);
		
		
		return "Update Status Successfully";
	}

	@Override
	public int viewCredit() {
		CreditScore crs = new CreditScore();
		
		return crs.getScore();
	}

	@Override
	public LoanApp viewLoanApplication(int applicationId, int customerId) {
		LoanApp loanApp = loanAppDao.findAllById(applicationId);
		return loanApp;
	}

}
