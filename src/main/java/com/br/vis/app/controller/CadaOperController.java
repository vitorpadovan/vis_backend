package com.br.vis.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.vis.app.model.CadaOper;
import com.br.vis.app.model.dto.DtoCadaOper;
import com.br.vis.app.model.dto.DtoNovoCadaOper;
import com.br.vis.app.service.ServiceCadaOper;

@RestController
@RequestMapping("/api/operador")
public class CadaOperController {
	
	@Autowired
	private ServiceCadaOper servico;
	
	
	@GetMapping
	public List<CadaOper> operadores(){
		return servico.getOperadores();
	}
	
	@PostMapping 
	public DtoCadaOper salvarOperador(@RequestBody DtoNovoCadaOper novoOperador) {
		System.out.println(novoOperador);
		servico.salvarOperador(novoOperador);
		return null;
	}
}
