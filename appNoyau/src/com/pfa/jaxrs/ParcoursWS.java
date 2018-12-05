package com.pfa.jaxrs;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.pfa.entities.Parcours;
import com.pfa.services.ParcoursLocal;

@Path("Parcours")
public class ParcoursWS {

	
	@EJB 
	ParcoursLocal metier; 
	
	@GET
	@Path("all")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON )
	public List<Parcours> getAllParcours(){
		return metier.listParcourss(); 
	}
	
	@POST
	@Path("addParcours")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON )
	public boolean addParcourst(Parcours parcours){
		System.out.println(parcours.getNomParcours());
		System.out.println(parcours.getEmplacement());
		System.out.println(parcours.getTypeParcours());
		System.out.println(parcours.getNombreTrous());
		System.out.println(parcours.getNombreClients());
		System.out.println(parcours.getLongueurEnMetre());
		System.out.println(parcours.getPrix());
	
		return metier.addParcours(parcours);
	}
	
	@PUT 
	@Path("updateParcours")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON )
	public boolean updateParcours(Parcours parcours){
		
		return metier.updateParcours(parcours); 
	}
}
