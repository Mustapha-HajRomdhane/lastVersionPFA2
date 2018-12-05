package com.pfa.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class AchatParcoursPK implements Serializable {

	public AchatParcoursPK() {
		super();
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long idClient;
	private Long idParcours;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idClient == null) ? 0 : idClient.hashCode());
		result = prime * result + ((idParcours == null) ? 0 : idParcours.hashCode());
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
		AchatParcoursPK other = (AchatParcoursPK) obj;
		if (idClient == null) {
			if (other.idClient != null)
				return false;
		} else if (!idClient.equals(other.idClient))
			return false;
		if (idParcours == null) {
			if (other.idParcours != null)
				return false;
		} else if (!idParcours.equals(other.idParcours))
			return false;
		return true;
	}
	public Long getIdClient() {
		return idClient;
	}
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
	public Long getIdParcours() {
		return idParcours;
	}
	public void setIdParcours(Long idParcours) {
		this.idParcours = idParcours;
	}
}
