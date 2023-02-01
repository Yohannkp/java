package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Model.client;
import com.example.demo.Model.stock;


@Service
public interface stockService {
	
	public List<stock> getAll();

    public stock findById(Long id);

    public stock save(stock stock);

    public stock update(stock stock);

    public void deleteById(Long id);

	
}
