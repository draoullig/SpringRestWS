package fr.gillouard.spring.restws.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.gillouard.spring.restws.pojo.Client;

@RestController
@RequestMapping("/client")
public class ClientControleur {
	
	 /**
	  * Liste des clients
	  */
	private final List<Client> clients = new ArrayList<Client>();

	/**
	 * Constructeur.
	 */
	public ClientControleur() {
	 clients.add(new Client("1", "Dupont", "Jules"));
	 clients.add(new Client("2", "Martin", "Anne"));
	 clients.add(new Client("3", "Le Gall", "Bruno"));
	}
	
	/**
	  * Lister l'ensemble des clients
	  *
	  * @return la liste complete des clients
	  */
	@RequestMapping(method = RequestMethod.GET)
	public List<Client> getClients() {
	 return clients;
	}

}
