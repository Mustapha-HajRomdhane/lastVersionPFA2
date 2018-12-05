package com.pfa.services;

import java.sql.Date;
import java.util.List;

import javax.ejb.Local;

import com.pfa.entities.Achat;
import com.pfa.entities.AchatParcours;

@Local
public interface AchatLocal {
	public long calculAchat(Date date);
	public long calculBenefice(Date date);
    public boolean addAchat(Achat achat); 
    public List<Achat> listAchats();
    public boolean addAchatParcours(AchatParcours achatParcours);
    public List<AchatParcours> listAchatsParcours();
}
