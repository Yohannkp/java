package com.example.demo.Service_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.client;
import com.example.demo.Service.clientService;

@Service
public class service_client implements clientService{
	
	@Autowired
    public com.example.demo.Repository.clientRepository clientRepository;
	
	@Override
	public List<client> getAll() {
		// TODO Auto-generated method stub
		return this.clientRepository.findAll();
	}

	@Override
    public client findById(Long id) {
        return this.clientRepository.findById(id).orElse(null);
    }

    @Override
    public client save(client client) {
        return this.clientRepository.save(client);
    }

    @Override
    public client update(client client) {
        return this.clientRepository.save(client);
    }

    @Override
    public void deleteById(Long id) {
        this.clientRepository.deleteById(id);
    }

}
