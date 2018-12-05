package com.pfa.services;

import java.util.List;

import javax.ejb.Local;

import com.pfa.entities.Client;


@Local
public interface ClientLocal {
	public boolean addClient(Client client); 
	public boolean updateClient(Client client); 
	public boolean deleteClient(Long idClient); 
	public Client findClientById(Long idClient); 
	public List<Client>listClients(); 
}
