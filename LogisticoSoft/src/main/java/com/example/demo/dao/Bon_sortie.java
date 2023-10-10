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
public class Bon_sortie implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_numBonSortie;
	private Date date; 
	@Column(length = 20)
	private String designationSortie;
	private int quantiteBon_sortie;
	private double prix_unitaire_bonSortie,prix_total_bonSortie;
	@Column(length = 200)
	private String commentaireSorrtie;
	
	@OneToMany(mappedBy = "bon_sortie")
	private Collection<Fiche_de_stock> fiche_de_stock;
}
