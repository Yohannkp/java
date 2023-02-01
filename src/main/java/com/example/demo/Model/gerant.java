package com.example.demo.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

@Entity
@Table(name = "gerant")
@DiscriminatorValue("gerant")
public class gerant extends Personne{

	public List<stock> getStock() {
		return stock;
	}
	
	public void setStock(List<stock> stock) {
		this.stock = stock;
	}

	public gerant(int id_personne, String nom, String prenom, String address) {
		super(id_personne, nom, prenom, address);
		// TODO Auto-generated constructor stub
	}
	public gerant() {
		
	}
	@JsonBackReference
	@OneToMany(targetEntity=stock.class,mappedBy = "gerant", cascade = CascadeType.ALL)
    private List<stock> stock;
    
    @Override
	public String toString() {
		return "gerant{" +
				"id_personne=" + id_personne +
				", nom='" + nom + '\'' +
				", prenom='" + prenom + '\'' +
				", address='" + address + '\'' +
				'}';
	}
	
}