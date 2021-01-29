package com.br.vis.app.model.dto;

import com.br.vis.app.model.DireOper;

public class DtoDireOper {

	private int direCodiDire;
	private String direDescDire;

	public DtoDireOper() {
		super();
	}

	public DtoDireOper(int direCodiDire, String direDescDire) {
		super();
		this.direCodiDire = direCodiDire;
		this.direDescDire = direDescDire;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + direCodiDire;
		result = prime * result + ((direDescDire == null) ? 0 : direDescDire.hashCode());
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
		DtoDireOper other = (DtoDireOper) obj;
		if (direCodiDire != other.direCodiDire)
			return false;
		if (direDescDire == null) {
			if (other.direDescDire != null)
				return false;
		} else if (!direDescDire.equals(other.direDescDire))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DtoCadaDire [direCodiDire=" + direCodiDire + ", direDescDire=" + direDescDire + "]";
	}

	public int getDireCodiDire() {
		return direCodiDire;
	}

	public void setDireCodiDire(int direCodiDire) {
		this.direCodiDire = direCodiDire;
	}

	public String getDireDescDire() {
		return direDescDire;
	}

	public void setDireDescDire(String direDescDire) {
		this.direDescDire = direDescDire;
	}

	public void setDto(DireOper direito) {

	}

}
