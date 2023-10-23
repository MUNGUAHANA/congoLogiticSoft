package com.example.demo.dao;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class users implements Serializable {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 100)
	private String Uname;
	private int pass_word;
	@Value("${email.recipient}")
	private String Umail;
	private int Umobile;

}
