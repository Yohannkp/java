package com.example.demo.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


import org.springframework.stereotype.Service;

import com.example.demo.Model.client;



@Service
public interface clientService {
	
	
	public List<client> getAll();

    public client findById(Long id);

    public client save(client client);

    public client update(client client);

    public void deleteById(Long id);
    
    
}