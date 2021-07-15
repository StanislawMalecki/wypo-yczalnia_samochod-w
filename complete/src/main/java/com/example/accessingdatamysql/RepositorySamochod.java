package com.example.accessingdatamysql;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.accessingdatamysql.Samochod;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface RepositorySamochod extends JpaRepository<Samochod, Long>{
	
}