package br.com.confidencecambio.javabasico.service;

import br.com.confidencecambio.javabasico.dto.ImcRequestDTO;
import br.com.confidencecambio.javabasico.dto.ImcResponseDTO;

public interface ICalculoImc {

	public ImcResponseDTO calculatImc(ImcRequestDTO imc);
}
