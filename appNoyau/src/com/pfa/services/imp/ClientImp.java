package com.pfa.services.imp;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.pfa.entities.Client;
import com.pfa.services.ClientLocal;

@Stateless
public class ClientImp implements ClientLocal{

	@PersistenceContext(unitName="PFA")
	private EntityManager em ; 

	@Override
	public boolean addClient(Client client) {
		boolean b = false;
		try {
			
			em.persist(client);
			b = true;
			

		} catch (Exception e) {
			System.err.println("oops ...");
		}
		return b;
		
	}

	@Override
	public boolean updateClient(Client client) {
		boolean b = false;
		try {
			em.merge(client); 
			b = true;
		} catch (Exception e) {
			System.err.println("update failed!!");
		}
		return b;	
	}

	@Override
	public boolean deleteClient(Long idClient) {
		 Client client = em.find(Client.class, idClient);
		 
			boolean b = false;
			try {
				em.remove(client); 
				b = true;
			} catch (Exception e) {
				System.err.println("update failed!!");
			}
			 
	    	return b ; 
		
	}


	@Override
	public List<Client> listClients() {
		List<Client> req=em.createQuery("select c from Client c",Client.class).getResultList();
		return req;
	}

	@Override
	public Client findClientById(Long idClient) {
		Client client= new Client(); 
		try{
			client=em.find(Client.class, idClient); 
			
		}catch(Exception e){
			System.err.println("Client introuvable !!");
		}
		 
    	return client ; 
	}
}
