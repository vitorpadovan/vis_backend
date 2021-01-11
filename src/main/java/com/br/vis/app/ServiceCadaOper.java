package com.br.vis.app;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.br.vis.app.model.CadaOper;
import com.br.vis.app.repository.RepoCadaOper;

@Service
public class ServiceCadaOper implements UserDetailsService{

	@Autowired
	private RepoCadaOper repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<CadaOper> operador = repo.getUsuarioPorLogin(username);
		if(operador.isPresent()) {
			throw new UsernameNotFoundException(username);
		}
		return operador.get();
	}
}
