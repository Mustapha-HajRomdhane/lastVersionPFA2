package com.pfa.services.imp;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.pfa.entities.Materiel;
import com.pfa.services.MaterielLocal;

@Stateless
public class MaterielImp implements MaterielLocal {

	@PersistenceContext(unitName="PFA")
	private EntityManager em ; 
	
	@Override
	public boolean addMateriel(Materiel materiel) {
		boolean b = false;
		try {
		em.persist(materiel);
		b = true;
		} catch (Exception e) {
			System.err.println("ajout failed!!");
	}
		return b;	
	}

	@Override
	public boolean updateMateriel(Materiel materiel) {
		boolean b = false;
		try {
			em.merge(materiel); 
			b = true;
		} catch (Exception e) {
			System.err.println("update failed!!");
		}
		return b;	
	}


	@Override
	public List<Materiel> listMateriels() {
		List<Materiel> req=em.createQuery("select c from Materiel c",Materiel.class).getResultList();
		return req;
	}

	@Override
	public Materiel findMaterielById(Long idMateriel) {
		Materiel materiel=new Materiel(); 
		try{
			materiel=em.find(Materiel.class, idMateriel); 
			
		}catch(Exception e){
			System.err.println("Materiel introuvable !!");
		}
		 
    	return materiel ; 
	}

	@Override
	public boolean deleteMateriel(Long idMateriel) {
		 Materiel materiel = em.find(Materiel.class, idMateriel);
		 
			boolean b = false;
			try {
				em.remove(materiel); 
				b = true;
			} catch (Exception e) {
				System.err.println("update failed!!");
			}
			 
	    	return b ; 
		
	}


}
