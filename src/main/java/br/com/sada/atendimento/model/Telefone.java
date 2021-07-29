package br.com.sada.atendimento.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Telefone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String ddd;
	private String numero;
	@ManyToOne
	@JsonIgnore
	private Pessoa pessoa;

	public Telefone(String ddd, String numero, Pessoa pessoa) {
		this.ddd = ddd;
		this.numero = numero;
		this.pessoa = pessoa;
	}

	public Telefone() {
	}

	public Integer getId() {
		return id;
	}

	public String getDdd() {
		return ddd;
	}

	public String getNumero() {
		return numero;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
