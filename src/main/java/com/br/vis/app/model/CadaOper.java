package com.br.vis.app.model;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.sun.istack.NotNull;

@Entity
public class CadaOper implements UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "operCodiOper")
	private int operCodiOper;

	@NotNull
	@Column(name = "operNomeOper", columnDefinition = "varchar(255) not null comment 'Nome do operador'")
	private String operNomeOper;

	@NotNull
	@Column(name = "operLogiOper", columnDefinition = "varchar(50) not null unique comment 'Login do operador'")
	private String operLogiOper;

	@NotNull
	@Column(name = "operSenhOper", columnDefinition = "varchar(2000) not null comment 'Senha do operador'")
	private String operSenhOper;

	@NotNull
	@Column(name = "operDataCada", columnDefinition = "datetime not null comment 'Data de cadastro'")
	private Date operDataCada;

	@Column(name = "operDataAtua", columnDefinition = "datetime  null comment 'Data Atualização'")
	private Date operDataAtua;

	@Column(name = "operDataExpi", columnDefinition = "datetime  null comment 'Data expiração'")
	private Date operDataExpi;

	@NotNull
	@Column(name = "operOperAtiv", columnDefinition = "boolean not null default true comment 'Operador ativo'")
	private Boolean operOperAtiv;

	@NotNull
	@Column(name = "operOperBloq", columnDefinition = "boolean not null default false comment 'Operador bloqueado'")
	private Boolean operOperBloq;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "JTDireOper",
	joinColumns = @JoinColumn(name = "operCodiOper"),
	inverseJoinColumns = @JoinColumn(name = "direCodiDire"))
	private List<DireOper> direitos;

	public CadaOper() {
		super();
	}

	public CadaOper(int operCodiOper, String operNomeOper, String operLogiOper, String operSenhOper, Date operDataCada,
			Date operDataAtua, Date operDataExpi, Boolean operOperAtiv, Boolean operOperBloq) {
		super();
		this.operCodiOper = operCodiOper;
		this.operNomeOper = operNomeOper;
		this.operLogiOper = operLogiOper;
		this.operSenhOper = operSenhOper;
		this.operDataCada = operDataCada;
		this.operDataAtua = operDataAtua;
		this.operDataExpi = operDataExpi;
		this.operOperAtiv = operOperAtiv;
		this.operOperBloq = operOperBloq;
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

	public String getOperSenhOper() {
		return operSenhOper;
	}

	public void setOperSenhOper(String operSenhOper) {
		this.operSenhOper = operSenhOper;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + operCodiOper;
		result = prime * result + ((operDataAtua == null) ? 0 : operDataAtua.hashCode());
		result = prime * result + ((operDataCada == null) ? 0 : operDataCada.hashCode());
		result = prime * result + ((operDataExpi == null) ? 0 : operDataExpi.hashCode());
		result = prime * result + ((operLogiOper == null) ? 0 : operLogiOper.hashCode());
		result = prime * result + ((operNomeOper == null) ? 0 : operNomeOper.hashCode());
		result = prime * result + ((operOperAtiv == null) ? 0 : operOperAtiv.hashCode());
		result = prime * result + ((operOperBloq == null) ? 0 : operOperBloq.hashCode());
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
		CadaOper other = (CadaOper) obj;
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
		if (operSenhOper == null) {
			if (other.operSenhOper != null)
				return false;
		} else if (!operSenhOper.equals(other.operSenhOper))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CadaOper [operCodiOper=" + operCodiOper + ", operNomeOper=" + operNomeOper + ", operLogiOper="
				+ operLogiOper + ", operSenhOper=" + operSenhOper + ", operDataCada=" + operDataCada + ", operDataAtua="
				+ operDataAtua + ", operDataExpi=" + operDataExpi + ", operOperAtiv=" + operOperAtiv + ", operOperBloq="
				+ operOperBloq + "]";
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.direitos;
	}

	@Override
	public String getPassword() {
		return this.operSenhOper;
	}

	@Override
	public String getUsername() {
		return this.operLogiOper;
	}

	@Override
	public boolean isAccountNonExpired() {
		if(this.operDataExpi == null) {
			return true;
		}
		//TODO implementar regra correta para expirar o usuário
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return !operOperBloq;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return operOperAtiv;
	}
}
