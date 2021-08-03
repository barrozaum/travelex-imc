package br.com.confidencecambio.javabasico.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class ImcRequestDTO {

	@NotNull
	@Min(1)
	private Double altura;
	
	@NotNull
	@Min(1)
	private Double peso;

	public ImcRequestDTO() {

	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "ImcRequestDTO [altura=" + altura + ", peso=" + peso + "]";
	}

}
