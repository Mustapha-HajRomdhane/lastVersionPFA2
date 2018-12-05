package com.pfa.jaxrs;

import java.sql.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.pfa.entities.Achat;
import com.pfa.entities.AchatParcours;
import com.pfa.services.AchatLocal;

@Path("Achat")
public class AchatWS {

	@EJB
	AchatLocal metier; 
	
	@GET
	@Path("calculAchatForfait/{date}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON )
	public long findAchatByDate(@PathParam("date")Date date ){
		 
		return metier.calculAchat(date);
}
	@GET
	@Path("calculBenefice/{date}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON )
	public long calculBeneficeByDate(@PathParam("date")Date date ){
		 
		return metier.calculBenefice(date);
}
	
	@POST
	@Path("addAchatForfait")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON )
	public boolean addAchat(Achat achat){
		return metier.addAchat(achat);
	}
	
	@GET
	@Path("all")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON )
	public List<Achat> getAll(){
		return metier.listAchats();
	}
	
	@POST
	@Path("addAchatParcours")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON )
	public boolean addAchatParcours(AchatParcours achatParcours){
		return metier.addAchatParcours(achatParcours);
	}
	
	@GET
	@Path("allAchatParcours")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON )
	public List<AchatParcours> getAllAchatParcours(){
		return metier.listAchatsParcours();
	}
	
}
