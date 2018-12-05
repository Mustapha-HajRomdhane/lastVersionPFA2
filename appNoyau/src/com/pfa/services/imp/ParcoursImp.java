package com.pfa.services.imp;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.pfa.entities.Parcours;
import com.pfa.services.ParcoursLocal;

@Stateless
public class ParcoursImp implements ParcoursLocal {

	@PersistenceContext(unitName="PFA")
	private EntityManager em ;  
	
	@Override
	public boolean addParcours(Parcours parcours) {
		boolean b = false; 
		try {
			System.out.println("hello");
			em.persist(parcours);
			b = true;
			

		} catch (Exception e) {
			System.err.println("erreur insertion Parcours");
		}
		return b;
	}

	@Override
	public boolean updateParcours(Parcours parcours) {
		boolean b = false;
		try {
			em.merge(parcours); 
			b = true;
		} catch (Exception e) {
			System.err.println("update failed!!");
		}
		return b;
	}

	@Override
	public boolean deleteParcours(Long idParcours) {
		 Parcours parcours = em.find(Parcours.class, idParcours);
		 
			boolean b = false;
			try {
				em.remove(parcours); 
				b = true;
			} catch (Exception e) {
				System.err.println("update failed!!");
			}
			 
	    	return b ; 
	}

	@Override
	public Parcours findParcoursById(Long idParcours) {
		Parcours parcours= new Parcours(); 
		try{
			parcours=em.find(Parcours.class, idParcours); 
			
		}catch(Exception e){
			System.err.println("Client introuvable !!");
		}
		 
    	return parcours ; 
	}

	@Override
	public List<Parcours> listParcourss() {
		List<Parcours> req=em.createQuery("select c from Parcours c",Parcours.class).getResultList();
		return req;
	}

}
