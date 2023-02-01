package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Vente;


public interface venteRepository extends JpaRepository<Vente,Long>{

}
