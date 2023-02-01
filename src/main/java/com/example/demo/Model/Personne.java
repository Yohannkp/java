package com.example.demo.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Personne")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "type_personne")
class Personne{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id_personne;
	@Column
	protected String nom;
	@Column
	protected String prenom;
	@Column
	protected String address;
	
	public Personne(int id_personne, String nom, String prenom, String address) {
		super();
		this.id_personne = id_personne;
		this.nom = nom;
		this.prenom = prenom;
		this.address = address;
	}
	
	public Personne() {
		
	}
	public int getId_personne() {
		return id_personne;
	}
	public void setId_personne(int id_personne) {
		this.id_personne = id_personne;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}