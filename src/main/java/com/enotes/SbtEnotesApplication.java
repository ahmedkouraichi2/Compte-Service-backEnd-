package com.enotes;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.enotes.entity.Compte;
import com.enotes.entity.TypeCompte;
import com.enotes.repository.CompteRepository;

@SpringBootApplication
@EnableJpaAuditing
public class SbtEnotesApplication{

	public static void main(String[] args) {
		SpringApplication.run(SbtEnotesApplication.class, args);
	}
 
	// une metheode 
	 /* 
	@Override
	public void run(String... args) throws Exception {
       
		
		
	}
	
	
	*/
	
	
	// emme methode bean annotation a démmarage elle tourne 
	
	
	CommandLineRunner start(CompteRepository compteRepository ) {
		 return args->{
			 compteRepository.save(new Compte(null,9800,new Date(),TypeCompte.COURANT));
			 compteRepository.save(new Compte(null,2500,new Date(),TypeCompte.COURANT));
			 compteRepository.save(new Compte(null,8000,new Date(),TypeCompte.EPARGNE));
		 };
	}
	

}
