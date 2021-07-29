package br.com.sada.atendimento.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "medicos")
public class Medico extends Pessoa {
	
	private Integer crm;
	private String especialidade;
	
	@ManyToMany(mappedBy = "medico")
	private Integer id;
	
	public Medico(Integer crm, String especialidade, String nome, String sobrenome, Endereco endereco, LocalDate dataNascimento, List<Telefone> telefone) {
		this.crm = crm;
		this.especialidade = especialidade;
		super.setNome(nome);
		super.setSobrenome(sobrenome);
		super.setEndereco(endereco);
		super.setDataNascimento(dataNascimento);
		super.setTelefone(telefone);
	}
	
	public Medico() {
	}

	public Integer getCrm() {
		return crm;
	}

	public String getEspecialidade() {
		return especialidade;
	}
}
