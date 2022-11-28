package com.enotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enotes.entity.Compte;

// specifier le type  compte de Id Lonte
public interface CompteRepository extends JpaRepository<Compte,Long> {

}
