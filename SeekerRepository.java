package com.bloodBank.repository;


import org.springframework.data.jpa.repository.JpaRepository;




import com.bloodBank.model.Seeker;

public interface SeekerRepository extends JpaRepository<Seeker, Long> {

	Object seekerLogin(String email, String password);

	

}
