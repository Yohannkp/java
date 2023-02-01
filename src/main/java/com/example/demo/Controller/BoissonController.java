package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Boisson;
import com.example.demo.Model.client;
import com.example.demo.Service.BoissonService;

@CrossOrigin(origins = "*")
@RestController
public class BoissonController{
	
	@Autowired
	private com.example.demo.Service.BoissonService BoissonService;
	
	
	
	@RequestMapping("/boissons")
	public List<Boisson> sayHello() {
		List<Boisson> Boissons = new ArrayList<>();

        try {
            Boissons = this.BoissonService.getAll();
            System.out.println(Boissons);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Erreur " + e.getMessage());
        }
        
        return Boissons;
	}
	

	@RequestMapping("boisson/{id}")
	public Boisson getBoisson(@PathVariable Long id) {
		return this.BoissonService.findById(id);
	}
	
	
	
	
	/*@RequestMapping("boisson/{id}")
	public Boisson getBoisson(@PathVariable Long id) {
		return boissonService.getboissonid(id);
	}*/
	
	@RequestMapping(method = RequestMethod.DELETE,value="boisson/delete/{id}")
	public void deleteBoisson(@PathVariable Long id) {
		this.BoissonService.deleteById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/boisson/ajout", headers = "accept=Application/json")
	public void ajoutboisson(@RequestBody Boisson Boisson) {
		
		this.BoissonService.save(Boisson);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value="/boisson/update/{id}")
	public void miseajourboisson(@RequestBody Boisson Boisson,@PathVariable Long id) {
		
		this.BoissonService.update(Boisson);
	}
	
	
}