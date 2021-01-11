package com.br.vis.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class DireOper implements GrantedAuthority {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int direCodiDire;

	@Column(columnDefinition = "varchar(50) not null unique")
	private String direNomeDire;

	@Column(columnDefinition = "varchar(50) not null")
	private String direDescDire;

	public DireOper() {
		super();
	}

	public DireOper(int direCodiDire, String direNomeDire, String direDescDire) {
		super();
		this.direCodiDire = direCodiDire;
		this.direNomeDire = direNomeDire;
		this.direDescDire = direDescDire;
	}

	public int getDireCodiDire() {
		return direCodiDire;
	}

	public void setDireCodiDire(int direCodiDire) {
		this.direCodiDire = direCodiDire;
	}

	public String getDireNomeDire() {
		return direNomeDire;
	}

	public void setDireNomeDire(String direNomeDire) {
		this.direNomeDire = direNomeDire;
	}

	public String getDireDescDire() {
		return direDescDire;
	}

	public void setDireDescDire(String direDescDire) {
		this.direDescDire = direDescDire;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + direCodiDire;
		result = prime * result + ((direNomeDire == null) ? 0 : direNomeDire.hashCode());
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
		DireOper other = (DireOper) obj;
		if (direCodiDire != other.direCodiDire)
			return false;
		if (direNomeDire == null) {
			if (other.direNomeDire != null)
				return false;
		} else if (!direNomeDire.equals(other.direNomeDire))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DireOper [direCodiDire=" + direCodiDire + ", direNomeDire=" + direNomeDire + ", direDescDire="
				+ direDescDire + "]";
	}

	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return direNomeDire;
	}

}
