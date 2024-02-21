package com.pisgah.RegisterLogin.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pisgah.RegisterLogin.Dto.TrainingDTO;
import com.pisgah.RegisterLogin.Entity.Training;
import com.pisgah.RegisterLogin.Repo.EmployeeRepo;
import com.pisgah.RegisterLogin.Repo.TrainingRepo;
import com.pisgah.RegisterLogin.Service.TrainingService;
import com.pisgah.RegisterLogin.response.TrainingResponse;

@Service
	public class TrainingIMPL implements TrainingService {

	    @Autowired
	    private EmployeeRepo employeeRepo;
	    
	@Autowired
	    private TrainingRepo trainingRepo;

	    @Override
	    public TrainingResponse addTraining(TrainingDTO trainingDTO) {
	        String msg = "";
			boolean status;


	        // Check if the email exists in the employee table
	        boolean emailExists = employeeRepo.existsByEmail(trainingDTO.getEmail());
	        
	        if (emailExists) {
	            // Email exists, proceed with inserting data into the training table
	            Training training = new Training(
	                trainingDTO.getTrainingid(),
	                trainingDTO.getCourseid(),
	                trainingDTO.getCourseduration(),
	                trainingDTO.getCoursetime(),
	                trainingDTO.getCoursedetails(),
	                trainingDTO.getEmail()
	            );

	            trainingRepo.save(training);
	            return new TrainingResponse(msg="Submitted Successfully", status=true  );
	           
	        } else {
	            // Email does not exist in the employee table
	            return new TrainingResponse(msg="Email does not exist in the employee table. Unable to submit training.", status=false  );

	        }

	       
	    }
	}