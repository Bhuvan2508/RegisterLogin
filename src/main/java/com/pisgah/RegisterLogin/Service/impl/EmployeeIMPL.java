package com.pisgah.RegisterLogin.Service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.pisgah.RegisterLogin.Dto.EmployeeDTO;
import com.pisgah.RegisterLogin.Dto.LoginDTO;
import com.pisgah.RegisterLogin.Entity.Employee;
import com.pisgah.RegisterLogin.Repo.EmployeeRepo;
import com.pisgah.RegisterLogin.Service.EmployeeService;
import com.pisgah.RegisterLogin.response.LoginResponse;
import com.pisgah.RegisterLogin.response.RegisterResponse;
@Service
public class EmployeeIMPL  implements EmployeeService {
	@Autowired
	private EmployeeRepo employeeRepo;
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Override
	public RegisterResponse addEmployee(EmployeeDTO employeeDTO) {
		String msg="";
		boolean status;
	try {
		Employee employee=new Employee(
				employeeDTO.getEmployeeid(),
				employeeDTO.getEmployeename(),
				employeeDTO.getEmail(),
				employeeDTO.getNumber(),
				this.passwordEncoder.encode(employeeDTO.getPassword()),
				employeeDTO.getPassword(),
				employeeDTO.getEducation(),
				employeeDTO.getSkills(),
				employeeDTO.getNonitskills(),
				employeeDTO.getOthercertifications(),
				employeeDTO.getTotalyearsofexp(),
				employeeDTO.getTotalyearsofindexp(),
				employeeDTO.getNubofclients(),
				employeeDTO.getTrainings(),
				employeeDTO.getPdffile(),
				employeeDTO.getQuetionone(),
				employeeDTO.getQuetiontwo()
				);
		
		if(!employeeRepo.existsByEmail(employeeDTO.getEmail()))
				{
			employeeRepo.save(employee);
			
			return new RegisterResponse(msg="RegisterSuccess", status=true  );
				}
		else if((employeeDTO.getEmail()== null) || (employeeDTO.getEmployeename()== null) ||  (employeeDTO.getNumber()== null) ) {
			return new RegisterResponse(msg="Please Fill All Details", status=false  );
		}
		else {			
			
			return new RegisterResponse(msg="Customer ID already Exist", status=false  );
		}
	}
	catch(IllegalArgumentException e){		
	}
	return new RegisterResponse(msg="Please Enter Password", status=false  );
	}	
	
	
	@Override
	public LoginResponse loginEmployee(LoginDTO loginDTO) {
		String msg="";
		boolean status;
		try {
			
		Employee employee1=employeeRepo.findByEmail(loginDTO.getEmail());
		if(employee1!=null) {
			String password=loginDTO.getPassword();
			String encodedPassword=employee1.getPassword();
			Boolean isPwdRight=passwordEncoder.matches(password,encodedPassword);
			if(isPwdRight) {
				Optional<Employee>employee=employeeRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
				if(employee.isPresent()) {
					return new LoginResponse(msg="LoginSuccess", status=true  );
				}
				
				else {
					return new LoginResponse(msg="Login Failed", status = false);
				}}
				else {
					return new LoginResponse(msg="password Not Match", status=false);
			}
		}
		else {		
			return new LoginResponse( msg= "Email not Exist ", status=false );
		}
		}
		catch(IllegalArgumentException e){
		}
		return new LoginResponse(msg=" Please Enter password ", status=false);	
	}
	
	
	@Override
	public List<Employee> fetchAllEmployes() {
      List<Employee> ls=employeeRepo.findAll();
		return ls;
	}


}			
			
			
			
	

	
	
	

	




