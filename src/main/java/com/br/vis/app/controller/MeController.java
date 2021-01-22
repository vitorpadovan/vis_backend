package com.br.vis.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.vis.app.model.CadaOper;
import com.br.vis.app.model.dto.DtoCadaOper;
import com.br.vis.app.service.ServiceCadaOper;

@RestController
@RequestMapping("/api/me")
public class MeController {
	
	
	@GetMapping
	public DtoCadaOper getOperadorLogado() {
		DtoCadaOper r = new DtoCadaOper();
		r.setDto(ServiceCadaOper.operadorAutenticado());
		return r;
	}

}
