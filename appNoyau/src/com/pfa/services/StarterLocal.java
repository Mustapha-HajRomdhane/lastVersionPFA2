package com.pfa.services;

import java.util.List;

import javax.ejb.Local;

import com.pfa.entities.Achat;

@Local
	public interface StarterLocal {

		public List<Achat> getAchatByIdClient(Long idClient);
	}

