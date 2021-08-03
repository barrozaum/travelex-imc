package br.com.confidencecambio.javabasico.service.imp;

import org.springframework.stereotype.Service;

import br.com.confidencecambio.javabasico.dto.ImcRequestDTO;
import br.com.confidencecambio.javabasico.dto.ImcResponseDTO;
import br.com.confidencecambio.javabasico.service.ICalculoImc;

@Service
public class CalculoImcImpl implements ICalculoImc {

	@Override
	public ImcResponseDTO calculatImc(ImcRequestDTO imc) {
		ImcResponseDTO response = new ImcResponseDTO();
		response.setAltura(imc.getAltura());
		response.setPeso(imc.getPeso());
		response.setImcCalculado(imc.getPeso() / (imc.getAltura() * imc.getAltura()));
		
		return response;
	}

}
