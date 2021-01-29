package com.br.vis.app.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CadaEmpr {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int emprCodiEmpr;
	private String emprNomeEmpr;
	private Date emprDataCada;

	public CadaEmpr() {
		super();
	}

	public CadaEmpr(int emprCodiEmpr, String emprNomeEmpr, Date emprDataCada) {
		super();
		this.emprCodiEmpr = emprCodiEmpr;
		this.emprNomeEmpr = emprNomeEmpr;
		this.emprDataCada = emprDataCada;
	}

	public CadaEmpr(String emprNomeEmpr, Date emprDataCada) {
		super();
		this.emprNomeEmpr = emprNomeEmpr;
		this.emprDataCada = emprDataCada;
	}

	public int getEmprCodiEmpr() {
		return emprCodiEmpr;
	}

	public void setEmprCodiEmpr(int emprCodiEmpr) {
		this.emprCodiEmpr = emprCodiEmpr;
	}

	public String getEmprNomeEmpr() {
		return emprNomeEmpr;
	}

	public void setEmprNomeEmpr(String emprNomeEmpr) {
		this.emprNomeEmpr = emprNomeEmpr;
	}

	public Date getEmprDataCada() {
		return emprDataCada;
	}

	public void setEmprDataCada(Date emprDataCada) {
		this.emprDataCada = emprDataCada;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + emprCodiEmpr;
		result = prime * result + ((emprDataCada == null) ? 0 : emprDataCada.hashCode());
		result = prime * result + ((emprNomeEmpr == null) ? 0 : emprNomeEmpr.hashCode());
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
		CadaEmpr other = (CadaEmpr) obj;
		if (emprCodiEmpr != other.emprCodiEmpr)
			return false;
		if (emprDataCada == null) {
			if (other.emprDataCada != null)
				return false;
		} else if (!emprDataCada.equals(other.emprDataCada))
			return false;
		if (emprNomeEmpr == null) {
			if (other.emprNomeEmpr != null)
				return false;
		} else if (!emprNomeEmpr.equals(other.emprNomeEmpr))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CadaEmpr [emprCodiEmpr=" + emprCodiEmpr + ", emprNomeEmpr=" + emprNomeEmpr + ", emprDataCada="
				+ emprDataCada + "]";
	}
}
