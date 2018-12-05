package com.pfa.jaxrs;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.pfa.entities.Client;
import com.pfa.services.ClientLocal;

@Path("Client")
public class ClientWS {

	@EJB
	ClientLocal metier; 
	
	@GET
	@Path("all")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON )
	public List<Client> getAllClient(){
		return metier.listClients();   
	}
	
	@GET
	@Path("byID/{idClient}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON )
	public Client findClientById(@PathParam("idClient")Long idClient ){
		return metier.findClientById(idClient); 
	}
	
	
	@POST
	@Path("addClient")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON )
	public boolean addClient(Client client){
		return metier.addClient(client);
	}
	
	@PUT 
	@Path("updateClient")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON )
	public boolean updateClient(Client client){
		
		return metier.updateClient(client); 
	}
	
	@DELETE
	@Path("deleteClient/{idClient}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON )
	public boolean deleteClient(@PathParam("idClient") Long idClient){
		
		return metier.deleteClient(idClient);
	}
	
}
