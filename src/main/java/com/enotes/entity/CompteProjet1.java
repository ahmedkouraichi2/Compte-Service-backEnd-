package com.enotes.entity;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="p1" ,types= Compte.class)
	public interface CompteProjet1 {
	
	 public Long getCode();
	 public double getSolde(); 
	
	}
