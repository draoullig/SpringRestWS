package fr.gillouard.spring.restws.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
	 * @throws Exception
	 */
	@RequestMapping(method = RequestMethod.GET)
	public List<Client> getClients() throws Exception {
		throw new Exception("Test erreur");
	}

	/**
	 * Ajout d'un client à la liste
	 * 
	 * @param client
	 *            à ajouter
	 */
	@RequestMapping(method = RequestMethod.POST)
	public boolean addClient(@RequestBody final Client client) {
		return clients.add(client);
	}

	/**
	 * Mise a jour d'un client de la liste
	 * 
	 * @param client
	 *            à modifier
	 */
	@RequestMapping(method = RequestMethod.PUT)
	public Client updateClient(@RequestBody final Client client) {
		return clients.set(clients.indexOf(client), client);
	}

	/**
	 * Suppression d'un client
	 * 
	 * @param client
	 *            à supprimer
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteClient(@PathVariable final String id) {
		clients.remove(new Client(id, "", ""));
	}

	/**
	 * Le detail d'un client
	 * 
	 * @param id
	 *            du client recherchee
	 * @return l'objet client trouve
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Client getClient(@PathVariable final String id) {
		return clients.get(clients.indexOf(new Client(id, "", "")));
	}

}
