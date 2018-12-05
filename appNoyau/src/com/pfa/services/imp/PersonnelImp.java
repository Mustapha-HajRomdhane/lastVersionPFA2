package com.pfa.services.imp;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.pfa.entities.Personnel;
import com.pfa.services.PersonnelLocal;

@Stateless
public class PersonnelImp implements PersonnelLocal {


	@PersistenceContext(unitName="PFA")
	private EntityManager em ; 

	@Override
	public boolean addPersonnel(Personnel personnel) {
		boolean b = false;
		try {
			
			em.persist(personnel);
			b = true;
			

		} catch (Exception e) {
			System.err.println("oops ...");
		}
		return b;
		
	}

	@Override
	public boolean updatePersonnel(Personnel personnel) {
		boolean b = false;
		try {
			em.merge(personnel); 
			b = true;
		} catch (Exception e) {
			System.err.println("update failed!!");
		}
		return b;	
	}

	@Override
	public boolean deletePersonnel(Long idPersonnel) {
		 Personnel personnel = em.find(Personnel.class, idPersonnel);
		 
			boolean b = false;
			try {
				em.remove(personnel); 
				b = true;
			} catch (Exception e) {
				System.err.println("update failed!!");
			}
			 
	    	return b ;
		
	}


	@Override
	public List<Personnel> listPersonnels() {
		List<Personnel> req=em.createQuery("select c from Personnel c",Personnel.class).getResultList();
		return req;
	}

	@Override
	public Personnel findPersonnelById(Long idPersonnel) {
		Personnel personnel= new Personnel(); 
		try{
			personnel=em.find(Personnel.class, idPersonnel); 
			
		}catch(Exception e){
			System.err.println("Personnel introuvable !!");
		}
		 
    	return personnel ; 
	}

	@Override
	public Personnel findPersonnelByCIN(Long cin) {
	 Personnel personnel = new Personnel(); 
	 personnel=em.createQuery("select c from Personnel c where c.cin=" + cin,Personnel.class).getSingleResult(); 
	 return personnel; 
	}
	
	
}
