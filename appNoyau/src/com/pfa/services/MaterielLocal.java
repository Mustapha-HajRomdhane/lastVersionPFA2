package com.pfa.services;

import java.util.List;

import javax.ejb.Local;

import com.pfa.entities.Materiel;


@Local
public interface MaterielLocal {
	public boolean addMateriel(Materiel materiel); 
	public boolean updateMateriel(Materiel materiel); 
	public boolean deleteMateriel(Long idMateriel); 
	public Materiel findMaterielById(Long idMateriel); 
	public List<Materiel>listMateriels(); 
}
