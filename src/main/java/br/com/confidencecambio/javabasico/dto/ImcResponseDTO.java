package br.com.confidencecambio.javabasico.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import br.com.confidencecambio.javabasico.util.Util;

public class ImcResponseDTO {

	private Double altura;
	private Double peso;
	@JsonSerialize(using = Util.class)
	private Double imcCalculado;

	public ImcResponseDTO() {

	}

	public ImcResponseDTO(Double altura, Double peso, Double imcCalculado) {
		super();
		this.altura = altura;
		this.peso = peso;
		this.imcCalculado = imcCalculado;
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

	public Double getImcCalculado() {
		return imcCalculado;
	}

	public void setImcCalculado(Double imcCalculado) {
		this.imcCalculado = imcCalculado;
	}

	@Override
	public String toString() {
		return "ImcResponseDTO [altura=" + altura + ", peso=" + peso + ", imcCalculado=" + imcCalculado + "]";
	}
}
