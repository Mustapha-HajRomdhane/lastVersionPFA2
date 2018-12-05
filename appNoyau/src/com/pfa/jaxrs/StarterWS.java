package com.pfa.jaxrs;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.pfa.entities.Achat;
import com.pfa.services.StarterLocal;

@Path("Starter")
public class StarterWS {
	
	
	@EJB 
	StarterLocal metier; 
	
	
	@GET
	@Path("byID/{idClient}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON )
	public List<Achat> findClientById(@PathParam("idClient")Long idClient ){
		return metier.getAchatByIdClient(idClient); 
	}

}
