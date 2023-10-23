package com.example.demo.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Bon_entree implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_numBonEntree;
	private Date date; 
	@Column(length = 20)
	private String designationEntree;
	private int quantiteBon_entree;
	private double prix_unitaire_bonEntree,prix_total_bonEntree;
	@Column(length = 200)
	private String commentaireEntree;
	
	@OneToMany(mappedBy = "bon_entree")
	private Collection<Fiche_de_stock> fiche_de_stock;
}
