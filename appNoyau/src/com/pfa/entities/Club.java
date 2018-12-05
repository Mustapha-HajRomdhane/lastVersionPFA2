package com.pfa.entities;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.sql.Time;
import java.sql.Date;
import java.util.List;

import javax.persistence.*;

@Entity

public class Club implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idClub;
	private String nom;
	private String adresse;
	private Date dateCreation;
	private Time debutTravail;
	private Time finTravail;
	private Long numeroTelephone;
	private String email;
	private String siteWeb;
	private static final long serialVersionUID = 1L;

	public Club() {
		super();
	}   
	public int getIdClub() {
		return this.idClub;
	}

	public void setIdClub(int idClub) {
		this.idClub = idClub;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	@OneToMany(mappedBy="club")
	private List<Materiel> matriels;
	public List<Materiel> getMatriel() {
		return matriels;
	}
	public void setMatriel(List<Materiel> matriels) {
		this.matriels = matriels;
	}
   
	@OneToMany(mappedBy="club")
	private List<Parcours> parcourss;
	public List<Parcours> getparcours() {
		return parcourss;
	}
	public void setparcours(List<Parcours> parcourss) {
		this.parcourss = parcourss;
	}
	
	@OneToMany(mappedBy="club")
	private List<Client> clients;
	public List<Client> getClient() {
		return clients;
	}
	public void setClient(List<Client> clients) {
		this.clients = clients;
	}
	
	@OneToMany(mappedBy="club")
	private List<Personnel> personnels;
	public List<Personnel> getPersonnel() {
		return personnels;
	}
	public void setPersonnel(List<Personnel> personnels) {
		this.personnels = personnels;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Time getDebutTravail() {
		return debutTravail;
	}
	public void setDebutTravail(Time debutTravail) {
		this.debutTravail = debutTravail;
	}
	public Time getFinTravail() {
		return finTravail;
	}
	public void setFinTravail(Time finTravail) {
		this.finTravail = finTravail;
	}
	public Long getNumeroTelephone() {
		return numeroTelephone;
	}
	public void setNumeroTelephone(Long numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSiteWeb() {
		return siteWeb;
	}
	public void setSiteWeb(String siteWeb) {
		this.siteWeb = siteWeb;
	}
}

