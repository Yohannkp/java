package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.gerant;
import com.example.demo.Model.stock;

public interface gerantService {
	
	public List<gerant> getAll();

    public gerant findById(Long id);

    public gerant save(gerant gerant);

    public gerant update(gerant gerant);

    public void deleteById(Long id);


}
