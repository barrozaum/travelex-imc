package br.com.confidencecambio.javabasico.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.confidencecambio.javabasico.dto.ImcRequestDTO;
import br.com.confidencecambio.javabasico.dto.ImcResponseDTO;
import br.com.confidencecambio.javabasico.service.ICalculoImc;


@RestController
@RequestMapping("/api/imc")
public class ImcController {

	@Autowired
	ICalculoImc iCalculoImc;
	
	
	/*
	 POST
	 http://localhost:8080/api/imc
	  {
    	altura" : 1.78,
    	peso" : 100
		}		
	 */
	
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.OK)
	public ImcResponseDTO retornaCalculoImc(@Valid @RequestBody ImcRequestDTO imc) {
		return iCalculoImc.calculatImc(imc);
	}

}
