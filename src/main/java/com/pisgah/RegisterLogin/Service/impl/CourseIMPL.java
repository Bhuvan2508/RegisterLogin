package com.pisgah.RegisterLogin.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pisgah.RegisterLogin.Dto.CourseDTO;
import com.pisgah.RegisterLogin.Entity.Contact;
import com.pisgah.RegisterLogin.Entity.Course;
import com.pisgah.RegisterLogin.Repo.CourseRepo;
import com.pisgah.RegisterLogin.Service.CourseService;
@Service
public class CourseIMPL implements CourseService {
	@Autowired
	private CourseRepo courseRepo;
	

	@Override
	public String saveCourse(CourseDTO courseDTO) {
		String msg;
		Course course = new Course(
	        
			courseDTO.getCourseid(),
			courseDTO.getCourseduration(),
			courseDTO.getCoursetime(),
			courseDTO.getCoursedetails()
	        
				  );
		  if((courseDTO.getCourseduration()==null) || (courseDTO.getCoursetime()==null) || (courseDTO.getCoursedetails()==null)) {
		       
			return msg = "NOT SAVED";			
	}
	else {
		courseRepo.save(course); 
		return msg="SAVED";
	}
		
	}


	@Override
	public List<Course> fetchAllCourse() {
		List<Course> ls=courseRepo.findAll();
		return ls;
	}

}
