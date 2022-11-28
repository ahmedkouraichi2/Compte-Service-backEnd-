package com.enotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.enotes.entity.Compte;



@RepositoryRestResource
public interface CompteRepository extends JpaRepository<Compte,Long> {

	
	
}
