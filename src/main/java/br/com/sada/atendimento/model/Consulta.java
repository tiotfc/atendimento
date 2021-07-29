package br.com.sada.atendimento.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "consultas")
public class Consulta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private LocalDate data;
	
	@ManyToMany
	@JoinColumn(name = "paciente_fk")
	private Paciente paciente;
	
	@ManyToMany
	@JoinColumn(name = "medico_fk")
	private Medico medico;

	public LocalDate getData() {
		return data;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public Medico getMedico() {
		return medico;
	}

}
