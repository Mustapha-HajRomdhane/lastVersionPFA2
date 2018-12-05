package com.pfa.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AchatPK implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name="idClient")
	private Long idClient;
	@Column(name="idForfait")
	private Long idForfait;
	
public AchatPK() {
	
}

public Long getIdClient() {
	return idClient;
}
public void setIdClient(Long idClient) {
	this.idClient = idClient;
}

public Long getIdForfait() {
	return idForfait;
}
public void setIdForfait(Long idForfait) {
	this.idForfait = idForfait;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((idForfait == null) ? 0 : idForfait.hashCode());
	result = prime * result + ((idClient == null) ? 0 : idClient.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	AchatPK other = (AchatPK) obj;
	if (idForfait == null) {
		if (other.idForfait != null)
			return false;
	} else if (!idForfait.equals(other.idForfait))
		return false;
	if (idClient == null) {
		if (other.idClient != null)
			return false;
	} else if (!idClient.equals(other.idClient))
		return false;
	return true;
}


}