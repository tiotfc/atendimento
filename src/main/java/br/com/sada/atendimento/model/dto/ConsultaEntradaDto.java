package br.com.sada.atendimento.model.dto;

import java.time.LocalDate;

public class ConsultaEntradaDto {
	
	private LocalDate data;
	private Integer pacienteId;
	private Integer medicoId;
	
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public Integer getPacienteId() {
		return pacienteId;
	}
	public void setPacienteId(Integer pacienteId) {
		this.pacienteId = pacienteId;
	}
	public Integer getMedicoId() {
		return medicoId;
	}
	public void setMedicoId(Integer medicoId) {
		this.medicoId = medicoId;
	}
	
	
	

}
