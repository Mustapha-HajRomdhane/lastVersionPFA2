package com.pfa.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class AchatParcours implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AchatParcours(){
		super(); 
	}
	
	@EmbeddedId
	private AchatParcoursPK idAchat;
	
	private Date dateAchat; 
	private boolean passageValide; 
	private boolean paye; 
	
	@JoinColumn(name = "idClient", referencedColumnName = "idClient", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private Client client; 
	
	@JoinColumn(name = "idParcours", referencedColumnName = "idParcours", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private Parcours parcours;

	public Date getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}

	public boolean isPassageValide() {
		return passageValide;
	}

	public void setPassageValide(boolean passageValide) {
		this.passageValide = passageValide;
	}

	public boolean isPaye() {
		return paye;
	}

	public void setPaye(boolean paye) {
		this.paye = paye;
	}

	public AchatParcoursPK getIdAchat() {
		return idAchat;
	}

	public void setIdAchat(AchatParcoursPK idAchat) {
		this.idAchat = idAchat;
	}
	
	
}



	



	
	
	
	
	


