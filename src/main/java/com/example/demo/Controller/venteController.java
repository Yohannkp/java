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

import com.example.demo.Model.Vente;
import com.example.demo.Model.stock;

@CrossOrigin(origins = "*")
@RestController
public class venteController {
	@Autowired
	private com.example.demo.Service.venteService venteService;
	
	@RequestMapping("/ventes")
	public List<Vente> getlisteventes() {
		List<Vente> Vente = new ArrayList<>();

        try {
        	Vente = this.venteService.getAll();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Erreur " + e.getMessage());
        }

        return Vente;
	}
	
	
	

	@RequestMapping("vente/{id}")
	public Vente getvente(@PathVariable Long id) {
		return this.venteService.findById(id);
	}
	
	
	
	
	/*@RequestMapping("boisson/{id}")
	public Boisson getBoisson(@PathVariable Long id) {
		return boissonService.getboissonid(id);
	}*/
	
	@RequestMapping(method = RequestMethod.DELETE,value="vente/delete/{id}")
	public void deletevente(@PathVariable Long id) {
		this.venteService.deleteById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/vente/ajout", headers = "accept=Application/json")
	public void ajoutvente(@RequestBody Vente Vente) {
		
		this.venteService.save(Vente);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value="/vente/update/{id}")
	public void updatevente(@RequestBody Vente Vente,@PathVariable Long id) {
		
		this.venteService.update(Vente);
	}
}
