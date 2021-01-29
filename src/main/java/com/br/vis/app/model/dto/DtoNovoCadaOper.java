package com.br.vis.app.model.dto;

import java.util.Date;

import com.br.vis.app.model.CadaEmpr;
import com.br.vis.app.model.CadaOper;
import com.br.vis.app.model.DireOper;
import com.fasterxml.jackson.annotation.JsonFormat;

public class DtoNovoCadaOper {

	private String operNomeOper;
	private String operLogiOper;
	private String operSenhOper;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date operDataExpi;
	private int emprCodiEmpr;
	private int direCodiDire;

	public DtoNovoCadaOper() {
		super();
	}

	public DtoNovoCadaOper(String operNomeOper, String operLogiOper, String operSenhOper, Date operDataExpi,
			int emprCodiEmpr, int direCodiDire) {
		super();
		this.operNomeOper = operNomeOper;
		this.operLogiOper = operLogiOper;
		this.operSenhOper = operSenhOper;
		this.operDataExpi = operDataExpi;
		this.emprCodiEmpr = emprCodiEmpr;
		this.direCodiDire = direCodiDire;
	}

	public String getOperNomeOper() {
		return operNomeOper;
	}

	public void setOperNomeOper(String operNomeOper) {
		this.operNomeOper = operNomeOper;
	}

	public String getOperLogiOper() {
		return operLogiOper;
	}

	public void setOperLogiOper(String operLogiOper) {
		this.operLogiOper = operLogiOper;
	}

	public String getOperSenhOper() {
		return operSenhOper;
	}

	public void setOperSenhOper(String operSenhOper) {
		this.operSenhOper = operSenhOper;
	}

	public Date getOperDataExpi() {
		return operDataExpi;
	}

	public void setOperDataExpi(Date operDataExpi) {
		this.operDataExpi = operDataExpi;
	}

	public int getEmprCodiEmpr() {
		return emprCodiEmpr;
	}

	public void setEmprCodiEmpr(int emprCodiEmpr) {
		this.emprCodiEmpr = emprCodiEmpr;
	}

	public int getDireCodiDire() {
		return direCodiDire;
	}

	public void setDireCodiDire(int direCodiDire) {
		this.direCodiDire = direCodiDire;
	}

	@Override
	public String toString() {
		return "DtoNovoCadaOper [operNomeOper=" + operNomeOper + ", operLogiOper=" + operLogiOper + ", operSenhOper="
				+ operSenhOper + ", operDataExpi=" + operDataExpi + ", emprCodiEmpr=" + emprCodiEmpr + ", direCodiDire="
				+ direCodiDire + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + direCodiDire;
		result = prime * result + emprCodiEmpr;
		result = prime * result + ((operDataExpi == null) ? 0 : operDataExpi.hashCode());
		result = prime * result + ((operLogiOper == null) ? 0 : operLogiOper.hashCode());
		result = prime * result + ((operNomeOper == null) ? 0 : operNomeOper.hashCode());
		result = prime * result + ((operSenhOper == null) ? 0 : operSenhOper.hashCode());
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
		DtoNovoCadaOper other = (DtoNovoCadaOper) obj;
		if (direCodiDire != other.direCodiDire)
			return false;
		if (emprCodiEmpr != other.emprCodiEmpr)
			return false;
		if (operDataExpi == null) {
			if (other.operDataExpi != null)
				return false;
		} else if (!operDataExpi.equals(other.operDataExpi))
			return false;
		if (operLogiOper == null) {
			if (other.operLogiOper != null)
				return false;
		} else if (!operLogiOper.equals(other.operLogiOper))
			return false;
		if (operNomeOper == null) {
			if (other.operNomeOper != null)
				return false;
		} else if (!operNomeOper.equals(other.operNomeOper))
			return false;
		if (operSenhOper == null) {
			if (other.operSenhOper != null)
				return false;
		} else if (!operSenhOper.equals(other.operSenhOper))
			return false;
		return true;
	}
	
	public CadaOper getOperador() {
		return null;
	}

}
