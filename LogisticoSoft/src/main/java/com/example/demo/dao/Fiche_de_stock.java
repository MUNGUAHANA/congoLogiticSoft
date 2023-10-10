package com.example.demo.dao;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Fiche_de_stock implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_produit;
	private Date date;
	private double quantite_entree, prix_unitaire_entree, valeur_entree
	,quatntite_sortie, prix_unitaire_sortie,valeur_sortie,qunatité_stock,
	prix_unitaire_stock, valeur_stock;
	@Column(length = 200)
	private String commentaire;
	
	@ManyToOne
	private Bon_entree bon_entree;
	@ManyToOne
	private Bon_sortie bon_sortie;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mapping_fichestock_id", referencedColumnName = "id_Num")
    private Produit produit;
	
}
