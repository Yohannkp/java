package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Vente;
import com.example.demo.Model.stock;

@Service
public interface venteService {
	
	public List<Vente> getAll();

    public Vente findById(Long id);

    public Vente save(Vente Vente);

    public Vente update(Vente Vente);

    public void deleteById(Long id);

}
