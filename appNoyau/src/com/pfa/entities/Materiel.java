package com.pfa.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity

public class Materiel implements Serializable {

private static final long serialVersionUID = 1L;
	   
	@Id
	@GeneratedValue
	@Basic(optional=false)
	private Long idMateriel;
	private String nomMateriel;
	private float prix ;
	private Long quantites;
	private Long quantiteDisponible;
	private String urlImage;
	private boolean etat;

	//@ManyToMany(mappedBy="materiel")
	//private List<Forfait> forfait; 

	public Materiel() {
		super();
	}   

	@ManyToOne
	@JoinColumn(name="club_FK")
	private Club club;
	public Club getClub() {
		return club;
	}
	public void setClub(Club club) {
		this.club = club;
	}
	
	

	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public Long getQuantites() {
		return quantites;
	}
	public void setQuantites(Long quantites) {
		this.quantites = quantites;
	}
	public Long getQuantiteDisponible() {
		return quantiteDisponible;
	}
	public void setQuantiteDisponible(Long quantiteDisponible) {
		this.quantiteDisponible = quantiteDisponible;
	}
	public String getUrlImage() {
		return urlImage;
	}
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	public boolean isEtat() {
		return etat;
	}
	public void setEtat(boolean etat) {
		this.etat = etat;
	}
	public Long getIdMateriel() {
		return idMateriel;
	}
	public void setIdMateriel(Long idMateriel) {
		this.idMateriel = idMateriel;
	}
	public String getNomMateriel() {
		return nomMateriel;
	}
	public void setNomMateriel(String nomMateriel) {
		this.nomMateriel = nomMateriel;
	}
/*	public List<Forfait> getForfait() {
		return forfait;
	}
	public void setForfait(List<Forfait> forfait) {
		this.forfait = forfait;
	} */
	 
}



	  
