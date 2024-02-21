package com.pisgah.RegisterLogin.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.pisgah.RegisterLogin.Entity.Contact;
@EnableJpaRepositories
@Repository
public interface ContactRepo extends JpaRepository<Contact, Integer> {

	boolean existsByEmail(String email);

}
