package com.pisgah.RegisterLogin.Service;

import java.util.List;

import com.pisgah.RegisterLogin.Dto.EmployeeDTO;
import com.pisgah.RegisterLogin.Dto.LoginDTO;
import com.pisgah.RegisterLogin.Entity.Employee;
import com.pisgah.RegisterLogin.response.LoginResponse;
import com.pisgah.RegisterLogin.response.RegisterResponse;

public interface EmployeeService {

	 RegisterResponse addEmployee(EmployeeDTO employeeDTO) ;

	LoginResponse loginEmployee(LoginDTO loginDTO);

	List<Employee> fetchAllEmployes();

    

}
