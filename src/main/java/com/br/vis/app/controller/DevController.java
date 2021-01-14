package com.br.vis.app.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.vis.app.model.CadaOper;
import com.br.vis.app.security.JWTUtil;
import com.br.vis.app.service.ServiceCadaOper;

@RestController
@RequestMapping("/api/dev")
@Profile("dev")
public class DevController {
	
	@Autowired
	private BCryptPasswordEncoder geradorDeSenha;
	
	@Autowired
	private ServiceCadaOper operador;
	
	@Autowired
	private JWTUtil jwtUtil;
	
	@PostMapping("/senha")
	public ResponseEntity<String> gerarSenha(@RequestBody String senha,HttpServletResponse response) {
		CadaOper user = operador.authenticated();

		String token = jwtUtil.generateToken(user.getOperLogiOper());
		response.addHeader("Authorization", "Bearer " + token);
		response.addHeader("access-control-expose-headers", "Authorization");
		try {
			return ResponseEntity.status(HttpStatus.OK).body(geradorDeSenha.encode(senha));
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

}
