package com.pfa.services.imp;

import java.sql.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.pfa.entities.Achat;
import com.pfa.entities.AchatParcours;
import com.pfa.entities.AchatParcoursPK;
import com.pfa.services.AchatLocal;

@Stateless
public class AchatImp implements AchatLocal {
	
	@PersistenceContext(unitName="PFA")
	private EntityManager em ; 

@Override
public long calculAchat(Date date) {
			
	long req=(long)em.createQuery("select COUNT(*) from Achat s where s.dateAchat>= '"+date+"'").getSingleResult();
		System.out.print(req);
		return req;
		
	}

@Override
public long calculBenefice(Date date) {
	long req=(long)em.createQuery("select SUM(f.prix) from Achat s, Forfait f where s.dateAchat>= '"+date+"' and s.idAchat.idForfait=f.idForfait").getSingleResult();
	System.out.print(req);
	return req;
}

@Override
public boolean addAchat(Achat achat) {
	boolean b = false;
	try {
		em.persist(achat);
		b = true;
		
	} catch (Exception e) {
		System.err.println("nooooooooooooo");
	}
	return b;
	
}

public boolean addAchatParcours(AchatParcours achatParcours) {
	boolean b = false;
	try {
		
	/*	AchatParcours achatP = new AchatParcours(); 
		AchatParcoursPK idAchatP= new AchatParcoursPK(); 
		idAchatP.setIdClient(achatParcours.get);
		achatP.setIdAchat(); */
		em.persist(achatParcours);
		b = true;
		
	} catch (Exception e) {
		System.err.println("nooooo add achatParcous");
	}
	return b;
	
}


@Override
public List<Achat> listAchats() {
	List<Achat> req=em.createQuery("select c from Achat c",Achat.class).getResultList();
	System.out.println(req);
	return req;
}

public List<AchatParcours> listAchatsParcours() {
	List<AchatParcours> req=em.createQuery("select c from AchatParcours c",AchatParcours.class).getResultList();
	System.out.println(req);
	return req;
}

}