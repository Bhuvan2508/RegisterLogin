package com.pisgah.RegisterLogin.Service;

import java.util.List;

import com.pisgah.RegisterLogin.Dto.CourseDTO;
import com.pisgah.RegisterLogin.Entity.Course;

public interface CourseService {

	String saveCourse(CourseDTO courseDTO);

	List<Course> fetchAllCourse();

}
