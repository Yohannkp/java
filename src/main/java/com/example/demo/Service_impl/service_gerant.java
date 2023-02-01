package com.example.demo.Service_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.gerant;
import com.example.demo.Model.stock;
import com.example.demo.Service.gerantService;

@Service
public class service_gerant implements gerantService{
	
	@Autowired
    public com.example.demo.Repository.gerantRepository gerantRepository;

	@Override
	public List<gerant> getAll() {
		// TODO Auto-generated method stub
		return this.gerantRepository.findAll();
	}

	@Override
	public gerant findById(Long id) {
		// TODO Auto-generated method stub
		return this.gerantRepository.findById(id).orElse(null);
	}

	@Override
	public gerant save(gerant gerant) {
		// TODO Auto-generated method stub
		return this.gerantRepository.save(gerant);
	}

	@Override
	public gerant update(gerant gerant) {
		// TODO Auto-generated method stub
		return this.gerantRepository.save(gerant);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		this.gerantRepository.deleteById(id);
		
	}

}
