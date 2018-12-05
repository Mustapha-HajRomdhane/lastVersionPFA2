package com.pfa.services.imp;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.pfa.entities.Forfait;
import com.pfa.services.ForfaitLocal;

@Stateless
public class ForfaitImp implements ForfaitLocal{

	@PersistenceContext(unitName="PFA")
	private EntityManager em ;
	
	@Override
	public boolean addForfait(Forfait forfait) {
		boolean b = false;
		try {
			
			em.persist(forfait);
			b = true;
			

		} catch (Exception e) {
			System.err.println("oops ...");
		}
		return b;
		
	}

	@Override
	public boolean updateForfait(Forfait forfait) {
		boolean b = false;
		try {
			em.merge(forfait); 
			b = true;
		} catch (Exception e) {
			System.err.println("update failed!!");
		}
		return b;	
	}

	@Override
	public boolean deleteForfait(Long idForfait) {
		 Forfait forfait = em.find(Forfait.class, idForfait);
		 
			boolean b = false;
			try {
				em.remove(forfait); 
				b = true;
			} catch (Exception e) {
				System.err.println("update failed!!");
			}
			 
	    	return b ; 
	}

	@Override
	public Forfait findForfaitById(Long idForfait) {
		Forfait forfait= new Forfait(); 
		try{
			forfait=em.find(Forfait.class, idForfait); 
			
		}catch(Exception e){
			System.err.println("Forfait introuvable !!");
		}
		 
    	return forfait; 
	}

	@Override
	public List<Forfait> listForfaits() {
		List<Forfait> req=em.createQuery("select c from Forfait c",Forfait.class).getResultList();
		return req;
	}

}
