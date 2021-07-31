package br.com.sada.atendimento.model.dto;

import java.time.LocalDate;
import java.util.List;

import br.com.sada.atendimento.model.Endereco;
import br.com.sada.atendimento.model.Paciente;
import br.com.sada.atendimento.model.Telefone;

public class PacienteEntradaDto {

	private String nome;
	private String sobrenome; 
	private Endereco endereco;
	private LocalDate dataNascimento; 
	private List<Telefone> telefone;
	private String protuario;
	
	public String getNome() {
		return nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public List<Telefone> getTelefone() {
		return telefone;
	}
	public String getProtuario() {
		return protuario;
	}
	
	public Paciente toPaciente() {
		return new Paciente(this.protuario, this.nome, this.sobrenome, this.endereco, this.dataNascimento, this.telefone);
	}
}
