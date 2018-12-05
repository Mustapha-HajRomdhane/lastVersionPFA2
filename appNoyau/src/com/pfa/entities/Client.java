package com.pfa.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Basic;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Client  implements Serializable{

	private static final long serialVersionUID = 1L;


	@Id 
	@GeneratedValue
	@Basic(optional=false)
	private Long idClient; 
	private Long cin; 
	private Long numeroTelephone; 
	private String nomClient; 
	private String prenomClient; 
	private String email; 
	private String adresse; 
	private Date dateNaissance; 
	private String typeClient;
	private String sexe; 
	
	@OneToMany(mappedBy="client")
	private List<Achat> achats;
	
	
	@ManyToOne
	@JoinColumn(name="club_FK")
	private Club club;

	
	public Client(Long numeroTelephone, String nomClient, String prenomClient, String email, String typeClient) {
		super();
		this.numeroTelephone = numeroTelephone;
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.email = email;
		this.typeClient = typeClient;
	}

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Long getIdClient() {
		return idClient;
	}
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public String getPrenomClient() {
		return prenomClient;
	}
	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTypeClient() {
		return typeClient;
	}
	public void setTypeClient(String typeClient) {
		this.typeClient = typeClient;
	}
	public Long getNumeroTelephone() {
		return numeroTelephone;
	}
	public void setNumeroTelephone(Long numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}
	public Long getCin() {
		return cin;
	}
	public void setCin(Long cin) {
		this.cin = cin;
	}
	
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
 
	
	
	
}
