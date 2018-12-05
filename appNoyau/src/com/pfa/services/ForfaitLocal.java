package com.pfa.services;

import java.util.List;

import javax.ejb.Local;

import com.pfa.entities.Forfait;

@Local
public interface ForfaitLocal {

	public boolean addForfait(Forfait forfait); 
	public boolean updateForfait(Forfait forfait); 
	public boolean deleteForfait(Long idForfait); 
	public Forfait findForfaitById(Long idForfait); 
	public List<Forfait>listForfaits(); 
}
