package com.pfa.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity

public class Forfait implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Basic(optional=false)
	private Long idForfait;
	private String nomForfait;
	private int nombrePassage;
	private float prix;
	private int validiteEnJours; 


	@OneToMany(mappedBy="forfait")

	private List<Achat> achats;

	//@ManyToMany
	//private List<Parcours> parcours; 
	
//	@ManyToMany
	//private List<Materiel> materiel; 
	
	public Forfait() {
		super();
	}   
	public Long getIdForfait() {
		return this.idForfait;
	}

	public void setIdForfait(Long idForfait) {
		this.idForfait = idForfait;
	}
	
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public String getNomForfait() {
		return nomForfait;
	}
	public void setNomForfait(String nomForfait) {
		this.nomForfait = nomForfait;
	}


	public int getValiditeEnJours() {
		return validiteEnJours;
	}
	public void setValiditeEnJours(int validiteEnJours) {
		this.validiteEnJours = validiteEnJours;
	}
	public int getNombrePassage() {
		return nombrePassage;
	}
	public void setNombrePassage(int nombrePassage) {
		this.nombrePassage = nombrePassage;
	}
	public List<Achat> getAchats() {
		return achats;
	}
	public void setAchats(List<Achat> achats) {
		this.achats = achats;
	}
	//public List<Parcours> getParcours() {
		//return parcours;
	//}
	//public void setParcours(List<Parcours> parcours) {
		//this.parcours = parcours;
	//}
//	public List<Materiel> getMateriel() {
	//	return materiel;
	//}
//	public void setMateriel(List<Materiel> materiel) {
	//	this.materiel = materiel;
//	}
   
}
