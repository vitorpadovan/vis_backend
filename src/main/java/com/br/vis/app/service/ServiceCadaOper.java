package com.br.vis.app.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.br.vis.app.model.CadaEmpr;
import com.br.vis.app.model.CadaOper;
import com.br.vis.app.model.DireOper;
import com.br.vis.app.model.dto.DtoNovoCadaOper;
import com.br.vis.app.repository.RepoCadaEmpr;
import com.br.vis.app.repository.RepoCadaOper;

@Service
public class ServiceCadaOper implements UserDetailsService{

	@Autowired
	private RepoCadaOper repo;
	
	@Autowired
	private RepoCadaEmpr repoEmp;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<CadaOper> operador = repo.getUsuarioPorLogin(username);
		if(!operador.isPresent()) {
			throw new UsernameNotFoundException(username);
		}
		return operador.get();
	}
	
	public List<CadaOper> getOperadores(){
		CadaOper operadorAtual = ServiceCadaOper.operadorAutenticado();
		Set<DireOper> direitos = operadorAtual.getDireitos();
		Set<DireOper> administrador = direitos.stream().filter(p->p.getDireNomeDire().equals("ROLE_ADMIN")).collect(Collectors.toSet());
		if(administrador.size()>0) {
			System.out.println("É um administrador");
		}
		else {
			System.out.println("Não é um administrador");
		}
		return null;
	}
	
	public static CadaOper authenticated() {
		try {
			return (CadaOper) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static CadaOper operadorAutenticado() {
		try {
			return (CadaOper) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		}catch(Exception ex) {
			return null;
		}
	}
	
	public CadaOper salvarOperador(DtoNovoCadaOper operadorNovo) {
		if(repo.findByOperLogiOper(operadorNovo.getOperLogiOper()).isPresent()) {
			//TODO retornar erro de usuário existente
		}
		else {
			CadaOper ativo = ServiceCadaOper.operadorAutenticado();
			Optional<CadaEmpr> optEmpresa = repoEmp.findById(operadorNovo.getEmprCodiEmpr());
			if(optEmpresa.isPresent()) {
				CadaEmpr empresa = optEmpresa.get();
				
				if(ativo.getEmpresas().contains(empresa)) {
					
				}else {
					//TODO Retornar erro de não possuir permissão.
				}
			}else {
				//TODO empresa não existe para cadastrar
			}
			
		}
		return null;
	}
}
