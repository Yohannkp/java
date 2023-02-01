package com.example.demo.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

@Entity
@Table(name = "Boisson")
public class Boisson{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_boisson;
	@Column
	private String libelle;
	@Column
	private double prix_unitaire;
	@Column
	private int quantite_dispo;
	@Column
	private String date_creation;
	@Column
	private double prix_achat;
	@Column
	private double quantite_initiale;
	
	@JsonBackReference
	@ManyToOne
    @JoinColumn(name="id_stock", nullable=false)
    private stock stock;
	
	public Long getId_boisson() {
		return id_boisson;
	}

	public void setId_boisson(Long id_boisson) {
		this.id_boisson = id_boisson;
	}

	public stock getStock() {
		return stock;
	}

	public void setStock(stock stock) {
		this.stock = stock;
	}

	public List<Vente> getVente() {
		return vente;
	}

	public void setVente(List<Vente> vente) {
		this.vente = vente;
	}
	@JsonBackReference
	@OneToMany(mappedBy = "boisson", cascade = CascadeType.ALL)
    private List<Vente> vente;
	
	
	public Boisson(Long id, String libelle, double prix_unitaire, int quantite_dispo, String date_creation,
			double prix_achat, double quantite_initiale, stock stock) {
		super();
		this.id_boisson = id;
		this.libelle = libelle;
		this.prix_unitaire = prix_unitaire;
		this.quantite_dispo = quantite_dispo;
		this.date_creation = date_creation;
		this.prix_achat = prix_achat;
		this.quantite_initiale = quantite_initiale;
		this.stock = stock;
	}

	public int getQuantite_dispo() {
		return quantite_dispo;
	}

	public void setQuantite_dispo(int quantite_dispo) {
		this.quantite_dispo = quantite_dispo;
	}

	public String getDate_creation() {
		return date_creation;
	}

	public void setDate_creation(String date_creation) {
		this.date_creation = date_creation;
	}

	public double getPrix_achat() {
		return prix_achat;
	}

	public void setPrix_achat(double prix_achat) {
		this.prix_achat = prix_achat;
	}

	public double getQuantite_initiale() {
		return quantite_initiale;
	}

	public void setQuantite_initiale(double quantite_initiale) {
		this.quantite_initiale = quantite_initiale;
	}

	public Boisson(){
		
	}
	
	
	public Long getIdBoisson() {
		return id_boisson;
	}
	
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public double getPrix_unitaire() {
		return prix_unitaire;
	}
	public void setPrix_unitaire(double prix_unitaire) {
		this.prix_unitaire = prix_unitaire;
	}
	public int getQuantite() {
		return quantite_dispo;
	}
	public void setQuantite(int quantite) {
		this.quantite_dispo = quantite;
	}
	
	
	
	
	
	
	
}