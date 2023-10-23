package com.example.demo.dao;

import java.io.Serializable;
import java.util.Date;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Produit implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_Num;
	@Column(length = 25)
	private String name;
	private Date date;
	@Column(length = 200)
	private String a_propos;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mapping_product_id", referencedColumnName = "id_produit")
    private Fiche_de_stock fiche_de_stock;
}
