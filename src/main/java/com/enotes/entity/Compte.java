package com.enotes.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor


public class Compte {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long code ;
	private double solde ;
	private Date dateCreation ;
	
	@Enumerated(EnumType.STRING)
	private TypeCompte type;

}
