package com.example.demo.dao;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
@Entity
public class FicheHistorique implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long fichehistorique_id;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mpping_id_Article", referencedColumnName = " id_NumArticle")
    private Invetaire inventaire;


}
