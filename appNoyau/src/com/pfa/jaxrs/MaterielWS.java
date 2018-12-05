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

import com.pfa.entities.Materiel;
import com.pfa.services.MaterielLocal;

@Path("Materiel")
public class MaterielWS {

	
	@EJB 
	MaterielLocal metier; 
	
	@GET
	@Path("all")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON )
	public List<Materiel> getAllMateriels(){
		return metier.listMateriels(); 
	}
	
	@POST
	@Path("addMateriel")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON )
	public boolean addMateriel(Materiel materiel){
		return metier.addMateriel(materiel);
	}
	
	@PUT 
	@Path("updateMateriel")
	public boolean updateMateriel(Materiel materiel){
		
		return metier.updateMateriel(materiel); 
	}
	
	@DELETE
	@Path("deleteParcours/{idMatereil}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON )
	public boolean deleteMateriel(@PathParam("idMateriel") Long idMateriel){
		
		return metier.deleteMateriel(idMateriel); 
	}
}
