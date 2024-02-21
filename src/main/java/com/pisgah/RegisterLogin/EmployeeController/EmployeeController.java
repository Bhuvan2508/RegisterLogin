package com.pisgah.RegisterLogin.EmployeeController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pisgah.RegisterLogin.Dto.ContactDTO;
import com.pisgah.RegisterLogin.Dto.CourseDTO;
import com.pisgah.RegisterLogin.Dto.EmployeeDTO;
import com.pisgah.RegisterLogin.Dto.LoginDTO;
import com.pisgah.RegisterLogin.Dto.TrainingDTO;
import com.pisgah.RegisterLogin.Entity.Contact;
import com.pisgah.RegisterLogin.Entity.Course;
import com.pisgah.RegisterLogin.Entity.Employee;
import com.pisgah.RegisterLogin.Service.ContactService;
import com.pisgah.RegisterLogin.Service.CourseService;
import com.pisgah.RegisterLogin.Service.EmployeeService;
import com.pisgah.RegisterLogin.Service.TrainingService;
import com.pisgah.RegisterLogin.response.LoginResponse;
import com.pisgah.RegisterLogin.response.RegisterResponse;
import com.pisgah.RegisterLogin.response.TrainingResponse;


@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private ContactService contactService;
	@Autowired
	private CourseService courseService;
	@Autowired
	private TrainingService trainingService;
	
	
	@PostMapping(path= "/employee/save")
	public ResponseEntity<RegisterResponse> saveEmployee(@RequestBody EmployeeDTO employeeDTO)
	{
		RegisterResponse registerResponse=employeeService.addEmployee(employeeDTO);
		return ResponseEntity.ok(registerResponse);
	}
	
	@PostMapping(path="/employee/login")
	public ResponseEntity<?>loginEmployee(@RequestBody LoginDTO loginDTO)
	{
		LoginResponse loginResponse=employeeService.loginEmployee(loginDTO);
		return ResponseEntity.ok(loginResponse);
		
	}
	 @PostMapping("/contact/save")
	    public String saveContact(@RequestBody ContactDTO contactDTO) {
		 String id= contactService.addContact(contactDTO);
	        return id;
	    }
	 
	 @GetMapping("/employee/get")
	    public List<Employee> getAllEmil( ) {
		 
	     	return employeeService.fetchAllEmployes(); 	  
	 }	 
	 
	 @GetMapping("/contact/get")
	    public List<Contact> getAll( ) {
	     	return contactService.fetchAllContacts(); 	  
	 }	
	 
	 @PostMapping(path= "/course/save")
		public String saveCourse(@RequestBody CourseDTO courseDTO)
		{
			String id=courseService.saveCourse(courseDTO);
			return id;
		}
	 
	 
	 @GetMapping("/course/get")
	    public List<Course> getAll1( ) {
	     	return courseService.fetchAllCourse(); 	  
	 }	
	 
	 @PostMapping(path= "/training/save")
		public TrainingResponse saveTraining(@RequestBody TrainingDTO trainingDTO)

		{
			TrainingResponse id=trainingService.addTraining(trainingDTO);
			return id;
		}
	 
	 
	 
	 
	
	
}
