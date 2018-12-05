package com.pfa.entities;

import java.io.Serializable;
//import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
//import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity

public class Parcours implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Basic(optional=false)
	private Long idParcours;
	private String nomParcours;
	private String emplacement;
	private float longueurEnMetre;
	private Long nombreTrous;
	private Long nombreClients;
	private String typeParcours;
	private float prix;
    private String urlPhoto; 
	
	
	//@ManyToMany(mappedBy="parcours")
//	private List<Forfait> forfait; 
	

	public Parcours() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdParcours() {
		return this.idParcours;
	}

	public void setIdParcours(Long idParcours) {
		this.idParcours = idParcours;
	}   
	public String getNomParcours() {
		return this.nomParcours;
	}

	public void setNomParcours(String nomParcours) {
		this.nomParcours = nomParcours;
	}   
	public String getEmplacement() {
		return this.emplacement;
	}

	public void setEmplacement(String emplacement) {
		this.emplacement = emplacement;
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


	public Long getNombreTrous() {
		return nombreTrous;
	}

	public void setNombreTrous(Long nombreTrous) {
		this.nombreTrous = nombreTrous;
	}


	public String getTypeParcours() {
		return typeParcours;
	}

	public void setTypeParcours(String typeParcours) {
		this.typeParcours = typeParcours;
	}

	public float getLongueurEnMetre() {
		return longueurEnMetre;
	}

	public void setLongueurEnMetre(float longueurEnMetre) {
		this.longueurEnMetre = longueurEnMetre;
	}

	public Long getNombreClients() {
		return nombreClients;
	}

	public void setNombreClients(Long nombreClients) {
		this.nombreClients = nombreClients;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public String getUrlPhoto() {
		return urlPhoto;
	}

	public void setUrlPhoto(String urlPhoto) {
		this.urlPhoto = urlPhoto;
	}

	

//	public List<Forfait> getForfait() {
//		return forfait;
//	}

//	public void setForfait(List<Forfait> forfait) {
//		this.forfait = forfait;
//	} 
   
}






