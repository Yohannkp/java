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

import com.example.demo.Model.Boisson;
import com.example.demo.Model.gerant;

@CrossOrigin(origins = "*")
@RestController
public class gerantController {
	
	@Autowired
	private com.example.demo.Service.gerantService gerantService;
	
	
	
	@RequestMapping("/gerants")
	public List<gerant> listegerants() {
		List<gerant> gerants = new ArrayList<>();

        try {
        	gerants = this.gerantService.getAll();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Erreur " + e.getMessage());
        }

        return gerants;
	}
	

	@RequestMapping("gerant/{id}")
	public gerant getgerant(@PathVariable Long id) {
		return this.gerantService.findById(id);
	}
	
	
	
	
	/*@RequestMapping("boisson/{id}")
	public Boisson getBoisson(@PathVariable Long id) {
		return boissonService.getboissonid(id);
	}*/
	
	@RequestMapping(method = RequestMethod.DELETE,value="gerant/delete/{id}")
	public void deletegerant(@PathVariable Long id) {
		this.gerantService.deleteById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/gerant/ajout", headers = "accept=Application/json")
	public void ajoutgerant(@RequestBody gerant gerant) {
		
		this.gerantService.save(gerant);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value="/gerant/update/{id}")
	public void miseajourgerant(@RequestBody gerant gerant,@PathVariable Long id) {
		
		this.gerantService.update(gerant);
	}

}
