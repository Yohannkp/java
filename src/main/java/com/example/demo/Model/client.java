package com.example.demo.Model;
import java.util.List;

import com.example.demo.Model.Boisson;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "client")
@DiscriminatorValue("Client")
public class client extends Personne{


	public client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public client(int id_personne, String nom, String prenom, String address) {
		super(id_personne, nom, prenom, address);
		
	}

	@JsonBackReference
	@OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Vente> vente;

	public List<Vente> getVente() {
		return vente;
	}

	public void setVente(List<Vente> vente) {
		this.vente = vente;
	}
	
	@Override
	public String toString() {
		return "client{" +
				"id_personne=" + id_personne +
				", nom='" + nom + '\'' +
				", prenom='" + prenom + '\'' +
				", address='" + address + '\'' +
				", vente='" + vente + '\'' +
				'}';
	}

	
	
}