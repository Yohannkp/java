package com.example.demo.Service_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Boisson;
import com.example.demo.Service.BoissonService;

@Service
public class service_boisson implements BoissonService{
	
	@Autowired
    public com.example.demo.Repository.BoissonRepository boissonRepository;
	
	@Override
	public List<Boisson> getAll() {
		// TODO Auto-generated method stub
		return this.boissonRepository.findAll();
	}

	@Override
    public Boisson findById(Long id) {
        return this.boissonRepository.findById(id).orElse(null);
    }

    @Override
    public Boisson save(Boisson Boisson) {
        return this.boissonRepository.save(Boisson);
    }

    @Override
    public Boisson update(Boisson Boisson) {
        return this.boissonRepository.save(Boisson);
    }

    @Override
    public void deleteById(Long id) {
        this.boissonRepository.deleteById(id);
    }

	

}

