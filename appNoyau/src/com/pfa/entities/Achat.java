package com.pfa.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Achat implements Serializable {


	private static final long serialVersionUID = 1L;



	public Achat() {
		super();
	}

	@EmbeddedId
	private AchatPK idAchat;

	
	private int nombrePassageRestant;
	
	private Date dateAchat;
	private boolean paye; 
	
	@JoinColumn(name = "idClient", referencedColumnName = "idClient", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private Client client; 
	
	@JoinColumn(name = "idForfait", referencedColumnName = "idForfait", insertable = false, updatable = false)
	@ManyToOne(optional = false)
	private Forfait forfait;
	
	

	public Date getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}


	public int getNombrePassageRestant() {
		return nombrePassageRestant;
	}

	public void setNombrePassageRestant(int nombrePassageRestant) {
		this.nombrePassageRestant = nombrePassageRestant;
	}

	public boolean isPaye() {
		return paye;
	}

	public void setPaye(boolean paye) {
		this.paye = paye;
	} 

}