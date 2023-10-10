package com.example.demo.dao;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class signIn implements Serializable {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdUser;
	@Column(length = 100)
	private String NameUser;
	private int passwordUser;

}
