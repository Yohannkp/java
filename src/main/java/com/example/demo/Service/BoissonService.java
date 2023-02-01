package com.example.demo.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


import org.springframework.stereotype.Service;

import com.example.demo.Model.Boisson;
import com.example.demo.Repository.BoissonRepository;

@Service
public interface BoissonService {
	
	
	public List<Boisson> getAll();

    public Boisson findById(Long id);

    public Boisson save(Boisson client);

    public Boisson update(Boisson client);

    public void deleteById(Long id);
	
	
}