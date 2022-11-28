package com.enotes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.enotes.repository.CompteRepository;
import com.enotes.entity.Compte;

@RestController
public class CompteRestController {
	
	@Autowired 
	private CompteRepository compteRepository ;
	

	@GetMapping(path="/comptes")
	 public List<Compte> ListCompte(){
		 return compteRepository.findAll();
	
	@GetMapping(path="/comptes/{code}")
	 public Compte CompteAvecId(@PathVariable Long code ){
		return compteRepository.findById(code).get();
		
		
	}
	
	@PostMapping(path="/comptes")
	   public Compte save(@RequestBody Compte compte) {
		return compteRepository.save(compte);
		 
	}
	
	
	@PutMapping(path="/comptes/{code}")
	   public Compte updateCompte(@PathVariable Long code  ,@RequestBody Compte compte) {
		compte.setCode(code);
		return compteRepository.save(compte);
		 
	}
	
	
	@DeleteMapping(path="compte/{code}")
	  public void delte(@PathVariable Long code) {
		compteRepository.deleteById(code);
		 
	}
	
	
	
	
	
	
	

}
