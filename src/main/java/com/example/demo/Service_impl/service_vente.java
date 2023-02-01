package com.example.demo.Service_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Vente;
import com.example.demo.Service.venteService;

@Service
public class service_vente implements venteService{
	
	@Autowired
    public com.example.demo.Repository.venteRepository venteRepository;
	
	@Override
	public List<Vente> getAll() {
		// TODO Auto-generated method stub
		return this.venteRepository.findAll();
	}

	@Override
    public Vente findById(Long id) {
        return this.venteRepository.findById(id).orElse(null);
    }

    @Override
    public Vente save(Vente Vente) {
        return this.venteRepository.save(Vente);
    }

    @Override
    public Vente update(Vente Vente) {
        return this.venteRepository.save(Vente);
    }

    @Override
    public void deleteById(Long id) {
        this.venteRepository.deleteById(id);
    }
}
