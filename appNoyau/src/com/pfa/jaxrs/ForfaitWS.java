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

import com.pfa.entities.Forfait;
import com.pfa.services.ForfaitLocal;

@Path("Forfait")
public class ForfaitWS {

	
	@EJB 
	ForfaitLocal metier; 
	
	@GET
	@Path("all")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON )
	public List<Forfait> getAllForfaits(){
		return metier.listForfaits(); 
	}
	

   @GET
   @Path("byID/{idForfait}")
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces(MediaType.APPLICATION_JSON )
    public Forfait findForfaitById(@PathParam("idForfait")Long idForfait ){
	return metier.findForfaitById(idForfait); 
    }

	
	@POST
	@Path("addForfait")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON )
	public boolean addForfait(Forfait forfait){
		return metier.addForfait(forfait);
	}
	
	@PUT 
	@Path("updateForfait")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON )
	public boolean updateForfait(Forfait forfait){
		
		return metier.updateForfait(forfait); 
	}
	
	@DELETE
	@Path("deleteForfait/{idForfait}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON )
	public boolean deleteForfait(@PathParam("idForfait") Long idForfait){
		
		return metier.deleteForfait(idForfait);
	}
}






