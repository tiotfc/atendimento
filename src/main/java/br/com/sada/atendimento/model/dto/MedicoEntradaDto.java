package br.com.sada.atendimento.model.dto;

import java.time.LocalDate;
import java.util.List;

import br.com.sada.atendimento.model.Endereco;
import br.com.sada.atendimento.model.Medico;
import br.com.sada.atendimento.model.Telefone;

public class MedicoEntradaDto {

	private Integer crm;
	private String especialidade;
	private String nome;
	private String sobrenome; 
	private Endereco endereco;
	private LocalDate dataNascimento; 
	private List<Telefone> telefone;
	
	public Integer getCrm() {
		return crm;
	}
	public String getEspecialidade() {
		return especialidade;
	}
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
	
	public Medico toMedico() {
		return new Medico(this.crm, this.especialidade, this.nome, this.sobrenome, this.endereco, this.dataNascimento, this.telefone);
	}
}
