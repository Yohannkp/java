package com.example.demo.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

@Entity
@Table(name = "vente")
public class Vente{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_vente;
	@Column
	private String numero_vente;
	@Column
	private double montant_vente;
	
	
	public Vente() {
		
	}
	
	public Vente(int id_vente, String numero_vente, double montant_vente) {
		super();
		this.id_vente = id_vente;
		this.numero_vente = numero_vente;
		this.montant_vente = montant_vente;
	}
	public int getId_vente() {
		return id_vente;
	}
	public void setId_vente(int id_vente) {
		this.id_vente = id_vente;
	}
	public String getNumero_vente() {
		return numero_vente;
	}
	public void setNumero_vente(String numero_vente) {
		this.numero_vente = numero_vente;
	}
	public double getMontant_vente() {
		return montant_vente;
	}
	public void setMontant_vente(double montant_vente) {
		this.montant_vente = montant_vente;
	}
	@JsonManagedReference
	@ManyToOne
    @JoinColumn(name = "id_personne")
    private client client;
	
	@JsonManagedReference
	@ManyToOne
    @JoinColumn(name = "id_boisson")
    private Boisson boisson;
	
}