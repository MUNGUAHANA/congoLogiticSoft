package com.example.demo.dao;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Journal_stock implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idNumOperation;
	private int NumCompte;
	@Column(length = 100)
	private String libelle;
	private double debit;
	private double  credit;
	private Date date;
	
	@ManyToOne
	private Invetaire inventaire;
}
