package com.pfa.services;

import java.util.List;

import javax.ejb.Local;

import com.pfa.entities.Personnel;

@Local
public interface PersonnelLocal {
	public boolean addPersonnel(Personnel personnel); 
	public boolean updatePersonnel(Personnel personnel); 
	public boolean deletePersonnel(Long idPersonnel); 
	public Personnel findPersonnelById(Long idPersonnel); 
	public Personnel findPersonnelByCIN(Long cin); 
	public List<Personnel>listPersonnels(); 
	
}
