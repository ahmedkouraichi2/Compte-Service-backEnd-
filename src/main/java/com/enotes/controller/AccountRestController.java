package com.enotes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dto.VirementRquestDto;
import services.CompteServiceImp;

@RestController
public class AccountRestController {

	@Autowired 
	private CompteServiceImp compteService;
	
	
	
	
	
	@PutMapping(path="compte/virement")
	public  void virement(@RequestBody  VirementRquestDto  request) {
		compteService.virement(request.getCodeSource(), request.getCodeSource(), request.getMontant());
	}
	
	

}
