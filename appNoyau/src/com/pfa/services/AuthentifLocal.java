package com.pfa.services;

import javax.ejb.Local;

import com.pfa.entities.Authentification;



@Local
public interface AuthentifLocal {
	public boolean addAuthentification(Authentification auth); 
	public boolean updateAuthentification(Authentification auth); 
	public Authentification findAuthentificationById(Long id); 
}
