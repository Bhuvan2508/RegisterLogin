package com.pisgah.RegisterLogin.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.pisgah.RegisterLogin.Entity.Training;

@EnableJpaRepositories
@Repository
public interface TrainingRepo extends JpaRepository<Training, Integer> {
	
}
