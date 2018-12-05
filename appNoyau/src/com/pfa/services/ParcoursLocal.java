package com.pfa.services;

import java.util.List;

import javax.ejb.Local;

import com.pfa.entities.Parcours;

@Local
public interface ParcoursLocal {
	public boolean addParcours(Parcours parcours); 
	public boolean updateParcours(Parcours parcours); 
	public boolean deleteParcours(Long idParcours); 
	public Parcours findParcoursById(Long idParcours); 
	public List<Parcours>listParcourss(); 
}
