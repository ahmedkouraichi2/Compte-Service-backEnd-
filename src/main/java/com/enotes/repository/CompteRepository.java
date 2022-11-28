package com.enotes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.enotes.entity.Compte;
import com.enotes.entity.TypeCompte;



@RepositoryRestResource
public interface CompteRepository extends JpaRepository<Compte,Long> {
	
	
	@RestResource(path="/byType")
	List<Compte> findByType(TypeCompte compte) ;

	
	
}
