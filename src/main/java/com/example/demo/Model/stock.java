package com.example.demo.Model;

import java.util.List;

import org.springframework.boot.json.GsonJsonParser;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;


@Entity
@Table(name = "stock")
public class stock{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_stock;
	@Column(name = "nom_stock")
	private String nom_stock;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "stock")
	private List<Boisson> listeBoissonStock;
	
	@JsonManagedReference
	@ManyToOne()
    @JoinColumn(name = "id_personne")
    private gerant gerant;
	
	public stock() {
		
	}
	
	public gerant getGerant() {
		return gerant;
	}

	public void setGerant(gerant gerant) {
		this.gerant = gerant;
	}

	public stock(int id_stock, String nom_stock, gerant gerant) {
		this.id_stock = id_stock;
		this.nom_stock = nom_stock;
		this.gerant = gerant;
		
	}
	public int getId_stock() {
		return id_stock;
	}
	public void setId_stock(int id_stock) {
		this.id_stock = id_stock;
	}
	public String getNom_stock() {
		return nom_stock;
	}
	public void setNom_stock(String nom_stock) {
		this.nom_stock = nom_stock;
	}
	public List<Boisson> getListeBoissonStock() {
		return listeBoissonStock;
	}
	public void setListeBoissonStock(List<Boisson> listeBoissonStock) {
		this.listeBoissonStock = listeBoissonStock;
	}
	
	@Override
	public String toString() {
		return "stock{" +
				"id_stock=" + id_stock +
				", nom_stock='" + nom_stock + '\'' +
				", liste_boisson_stock='" + listeBoissonStock + '\'' +
				", gerant='" + gerant + '\'' +
				'}';
	}
	
}