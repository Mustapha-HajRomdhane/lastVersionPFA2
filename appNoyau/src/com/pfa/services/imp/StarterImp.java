package com.pfa.services.imp;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.pfa.entities.Achat;
import com.pfa.services.StarterLocal;

@Stateless
public class StarterImp implements StarterLocal{
	
	@PersistenceContext(unitName="PFA")
	private EntityManager em ; 
	
	@Override
	public List<Achat> getAchatByIdClient(Long idClient) {
		List<Achat> req=em.createQuery("select s from Achat s where s.idAchat.idClient="+ idClient ,Achat.class).getResultList();
		System.out.print(req);
		return req;
		
	}
}
