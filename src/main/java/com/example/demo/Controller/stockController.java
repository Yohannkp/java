package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.client;
import com.example.demo.Model.stock;


@CrossOrigin(origins = "*")
@RestController
public class stockController {
	
	@Autowired
	private com.example.demo.Service.stockService stockService;
	
	@RequestMapping("/stocks")
	public List<stock> getstocks() {
		List<stock> stocks = new ArrayList<>();

        try {
            stocks = this.stockService.getAll();
            System.out.println(stocks);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Erreur " + e.getMessage());
        }

        return stocks;
	}
	
	
	

	@RequestMapping("stock/{id}")
	public stock getstock(@PathVariable Long id) {
		return this.stockService.findById(id);
	}
	
	
	
	
	/*@RequestMapping("boisson/{id}")
	public Boisson getBoisson(@PathVariable Long id) {
		return boissonService.getboissonid(id);
	}*/
	
	@RequestMapping(method = RequestMethod.DELETE,value="stock/delete/{id}")
	public void deletestock(@PathVariable Long id) {
		this.stockService.deleteById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/stock/ajout", headers = "accept=Application/json")
	public void ajoutstock(@RequestBody stock stock) {
		
		this.stockService.save(stock);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value="/stock/update/{id}")
	public void miseajourstock(@RequestBody stock stock,@PathVariable Long id) {
		
		this.stockService.update(stock);
	}
}
