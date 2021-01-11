package com.br.vis.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.br.vis.app.model.CadaOper;

public interface RepoCadaOper extends JpaRepository<CadaOper, Integer> {
	
	@Query("SELECT co FROM CadaOper co where operLogiOper = :usuario")
	public Optional<CadaOper> getUsuarioPorLogin(@Param("usuario") String usuario);

}
