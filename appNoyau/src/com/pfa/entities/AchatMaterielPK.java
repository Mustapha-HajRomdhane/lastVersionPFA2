package com.pfa.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class AchatMaterielPK implements Serializable{

	public AchatMaterielPK() {
		super();
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long idClient;
	private Long idMateriel;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idClient == null) ? 0 : idClient.hashCode());
		result = prime * result + ((idMateriel == null) ? 0 : idMateriel.hashCode());
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
		AchatMaterielPK other = (AchatMaterielPK) obj;
		if (idClient == null) {
			if (other.idClient != null)
				return false;
		} else if (!idClient.equals(other.idClient))
			return false;
		if (idMateriel == null) {
			if (other.idMateriel != null)
				return false;
		} else if (!idMateriel.equals(other.idMateriel))
			return false;
		return true;
	}
	
}
