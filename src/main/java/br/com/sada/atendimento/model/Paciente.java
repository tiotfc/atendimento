package br.com.sada.atendimento.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pacientes")
public class Paciente extends Pessoa {

	private Integer id;
	private String prontuario;

	public Paciente(String prontuario, String nome, String sobrenome, Endereco endereco, LocalDate dataNascimento, List<Telefone> telefone) {
		this.prontuario = prontuario;
		super.setNome(nome);
		super.setSobrenome(sobrenome);
		super.setEndereco(endereco);
		super.setDataNascimento(dataNascimento);
		super.setTelefone(telefone);
	}
	
	public Paciente() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProntuario() {
		return prontuario;
	}

	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}

}
