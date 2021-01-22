package com.br.vis.app.model.dto;

import java.util.Date;
import java.util.List;

import com.br.vis.app.model.CadaOper;
import com.br.vis.app.model.DireOper;

public class DtoCadaOper {

	private int operCodiOper;
	private String operNomeOper;
	private String operLogiOper;
	private Date operDataCada;
	private Date operDataAtua;
	private Date operDataExpi;
	private Boolean operOperAtiv;
	private Boolean operOperBloq;
	private List<DireOper> direitos;

	public DtoCadaOper() {
		super();
	}

	public DtoCadaOper(int operCodiOper, String operNomeOper, String operLogiOper, Date operDataCada, Date operDataAtua,
			Date operDataExpi, Boolean operOperAtiv, Boolean operOperBloq) {
		super();
		this.operCodiOper = operCodiOper;
		this.operNomeOper = operNomeOper;
		this.operLogiOper = operLogiOper;
		this.operDataCada = operDataCada;
		this.operDataAtua = operDataAtua;
		this.operDataExpi = operDataExpi;
		this.operOperAtiv = operOperAtiv;
		this.operOperBloq = operOperBloq;
	}

	public DtoCadaOper(int operCodiOper, String operNomeOper, String operLogiOper, Date operDataCada, Date operDataAtua,
			Date operDataExpi, Boolean operOperAtiv, Boolean operOperBloq, List<DireOper> direitos) {
		super();
		this.operCodiOper = operCodiOper;
		this.operNomeOper = operNomeOper;
		this.operLogiOper = operLogiOper;
		this.operDataCada = operDataCada;
		this.operDataAtua = operDataAtua;
		this.operDataExpi = operDataExpi;
		this.operOperAtiv = operOperAtiv;
		this.operOperBloq = operOperBloq;
		this.direitos = direitos;
	}

	public int getOperCodiOper() {
		return operCodiOper;
	}

	public void setOperCodiOper(int operCodiOper) {
		this.operCodiOper = operCodiOper;
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

	public Date getOperDataCada() {
		return operDataCada;
	}

	public void setOperDataCada(Date operDataCada) {
		this.operDataCada = operDataCada;
	}

	public Date getOperDataAtua() {
		return operDataAtua;
	}

	public void setOperDataAtua(Date operDataAtua) {
		this.operDataAtua = operDataAtua;
	}

	public Date getOperDataExpi() {
		return operDataExpi;
	}

	public void setOperDataExpi(Date operDataExpi) {
		this.operDataExpi = operDataExpi;
	}

	public Boolean getOperOperAtiv() {
		return operOperAtiv;
	}

	public void setOperOperAtiv(Boolean operOperAtiv) {
		this.operOperAtiv = operOperAtiv;
	}

	public Boolean getOperOperBloq() {
		return operOperBloq;
	}

	public void setOperOperBloq(Boolean operOperBloq) {
		this.operOperBloq = operOperBloq;
	}

	public List<DireOper> getDireitos() {
		return direitos;
	}

	public void setDireitos(List<DireOper> direitos) {
		this.direitos = direitos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((direitos == null) ? 0 : direitos.hashCode());
		result = prime * result + operCodiOper;
		result = prime * result + ((operDataAtua == null) ? 0 : operDataAtua.hashCode());
		result = prime * result + ((operDataCada == null) ? 0 : operDataCada.hashCode());
		result = prime * result + ((operDataExpi == null) ? 0 : operDataExpi.hashCode());
		result = prime * result + ((operLogiOper == null) ? 0 : operLogiOper.hashCode());
		result = prime * result + ((operNomeOper == null) ? 0 : operNomeOper.hashCode());
		result = prime * result + ((operOperAtiv == null) ? 0 : operOperAtiv.hashCode());
		result = prime * result + ((operOperBloq == null) ? 0 : operOperBloq.hashCode());
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
		DtoCadaOper other = (DtoCadaOper) obj;
		if (direitos == null) {
			if (other.direitos != null)
				return false;
		} else if (!direitos.equals(other.direitos))
			return false;
		if (operCodiOper != other.operCodiOper)
			return false;
		if (operDataAtua == null) {
			if (other.operDataAtua != null)
				return false;
		} else if (!operDataAtua.equals(other.operDataAtua))
			return false;
		if (operDataCada == null) {
			if (other.operDataCada != null)
				return false;
		} else if (!operDataCada.equals(other.operDataCada))
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
		if (operOperAtiv == null) {
			if (other.operOperAtiv != null)
				return false;
		} else if (!operOperAtiv.equals(other.operOperAtiv))
			return false;
		if (operOperBloq == null) {
			if (other.operOperBloq != null)
				return false;
		} else if (!operOperBloq.equals(other.operOperBloq))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DtoCadaOper [operCodiOper=" + operCodiOper + ", operNomeOper=" + operNomeOper + ", operLogiOper="
				+ operLogiOper + ", operDataCada=" + operDataCada + ", operDataAtua=" + operDataAtua + ", operDataExpi="
				+ operDataExpi + ", operOperAtiv=" + operOperAtiv + ", operOperBloq=" + operOperBloq + ", direitos="
				+ direitos + "]";
	}

	public void setDto(CadaOper operador) {
		this.operCodiOper = operador.getOperCodiOper();
		this.operNomeOper = operador.getOperNomeOper();
		this.operLogiOper = operador.getOperLogiOper();
		this.operDataCada = operador.getOperDataCada();
		this.operDataAtua = operador.getOperDataAtua();
		this.operDataExpi = operador.getOperDataExpi();
		this.operOperAtiv = operador.getOperOperAtiv();
		this.operOperBloq = operador.getOperOperBloq();
		this.direitos = operador.getDireitos();
	}
}
