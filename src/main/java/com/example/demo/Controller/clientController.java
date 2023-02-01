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

import com.example.demo.Model.client;

import com.example.demo.Service.BoissonService;
import com.example.demo.Service.clientService;

@CrossOrigin(origins = "*")
@RestController
public class clientController{
	
	
	@Autowired
	private com.example.demo.Service.clientService clientservice;
	
	
	
	@RequestMapping("/clients")
	public List<client> listeclients() {
		List<client> clients = new ArrayList<>();

        try {
            clients = this.clientservice.getAll();
            System.out.println(clients);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Erreur " + e.getMessage());
        }

        return clients;
	}
	

	@RequestMapping("client/{id}")
	public client getclient(@PathVariable Long id) {
		return this.clientservice.findById(id);
	}
	
	
	
	
	/*@RequestMapping("boisson/{id}")
	public Boisson getBoisson(@PathVariable Long id) {
		return boissonService.getboissonid(id);
	}*/
	
	@RequestMapping(method = RequestMethod.DELETE,value="client/delete/{id}")
	public void deleteclient(@PathVariable Long id) {
		this.clientservice.deleteById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/client/ajout", headers = "accept=Application/json")
	public void ajoutclient(@RequestBody client client) {
		
		this.clientservice.save(client);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value="/client/update/{id}")
	public void updateclient(@RequestBody client client,@PathVariable Long id) {
		
		this.clientservice.update(client);
	}
	
	
	
}