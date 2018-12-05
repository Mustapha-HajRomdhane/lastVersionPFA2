package com.pfa.jaxrs;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.pfa.entities.Personnel;
import com.pfa.services.PersonnelLocal;

@Path("Personnel")
public class PersonnelWS {

	
	@EJB 
	PersonnelLocal metier; 
	
	@GET
	@Path("all")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON )
	public List<Personnel> getAllPersonel(){
		return metier.listPersonnels(); 
	}
	
	@POST
	@Path("addPersonnel")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON )
	public boolean addPersonnel(Personnel personnel){
		return metier.addPersonnel(personnel);
	}
	
	@PUT 
	@Path("updatePersonnel")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON )
	public boolean updatePersonnel(Personnel personnel){
		
		return metier.updatePersonnel(personnel); 
	}
	
	@GET
	@Path("byID/{idPersonnel}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON )
	public Personnel findPersonnelById(@PathParam("idPersonnel")Long idPersonnel ){
		return metier.findPersonnelById(idPersonnel); 
	}
	
	@GET
	@Path("byCIN/{cin}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON )
	public Personnel findPersonnelByCIN(@PathParam("cin")Long cin ){
		System.out.println("hhhhh");
		return metier.findPersonnelByCIN(cin); 
	}
	
}