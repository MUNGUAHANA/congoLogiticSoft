package com.example.demo.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity 
public class Invetaire implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_NumArticle;
	@Column(length = 50)
	private String Nom_article,reference,modele,description;
	private double prix_piece;
	private int quantiteStockInvetaire;
	private Date date;
	
	@OneToMany(mappedBy = "inventaire")
	private Collection<Journal_stock> journal_stock;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mapping_id", referencedColumnName = " fichehistorique_id")
    private FicheHistorique fichehistorique;

}
