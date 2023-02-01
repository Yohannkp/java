package com.example.demo.Service_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.client;
import com.example.demo.Model.stock;
import com.example.demo.Service.stockService;

@Service
public class service_stock implements stockService{
	
	@Autowired
    public com.example.demo.Repository.stockRepository stockRepository;

	@Override
	public List<stock> getAll() {
		// TODO Auto-generated method stub
		return this.stockRepository.findAll();
	}

	@Override
	public stock findById(Long id) {
		// TODO Auto-generated method stub
		return this.stockRepository.findById(id).orElse(null);
	}

	@Override
	public stock save(stock stock) {
		// TODO Auto-generated method stub
		return this.stockRepository.save(stock);
	}

	@Override
	public stock update(stock stock) {
		// TODO Auto-generated method stub
		return this.stockRepository.save(stock);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		this.stockRepository.deleteById(id);
		
	}

}
