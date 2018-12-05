package com.pfa.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Authentification {

public Authentification() {
		super();
	}
@Id	
private long id; 	
private long identifiant; 
private String motDePasse;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public long getIdentifiant() {
	return identifiant;
}
public void setIdentifiant(long identifiant) {
	this.identifiant = identifiant;
}
public String getMotDePasse() {
	return motDePasse;
}
public void setMotDePasse(String motDePasse) {
	this.motDePasse = motDePasse;
} 


}
