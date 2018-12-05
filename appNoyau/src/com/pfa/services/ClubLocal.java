package com.pfa.services;


import javax.ejb.Local;

import com.pfa.entities.Club;

@Local
public interface ClubLocal {

	public boolean updateClub(Club club);

}
