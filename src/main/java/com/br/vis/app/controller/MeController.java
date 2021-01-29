package com.br.vis.app.controller;

import java.util.Set;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.vis.app.model.CadaEmpr;
import com.br.vis.app.model.dto.DtoCadaOper;
import com.br.vis.app.model.dto.DtoDireOper;
import com.br.vis.app.service.ServiceCadaOper;

@RestController
@RequestMapping("/api/me")
public class MeController {

	@GetMapping
	public DtoCadaOper getOperadorLogado(HttpServletResponse response) {
		DtoCadaOper r = new DtoCadaOper();
		r.setDto(ServiceCadaOper.operadorAutenticado());
		return r;
	}

	@GetMapping("/direitos")
	public Set<DtoDireOper> getPerfis(HttpServletResponse response) {
		return this.getOperadorLogado(response).getDireitos();
	}

	@GetMapping("/empresas")
	public Set<CadaEmpr> getEmpresas(HttpServletResponse response) {
		return this.getOperadorLogado(response).getEmpresas();
	}
}
