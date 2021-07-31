package br.com.sada.atendimento.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "consultas")
public class Consulta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private LocalDate data;
	
	@ManyToOne
	@JoinColumn(name = "paciente_fk")
	private Paciente paciente;
	
	@ManyToOne
	@JoinColumn(name = "medico_fk")
	private Medico medico;

	public Consulta(LocalDate data, Paciente paciente, Medico medico) {
		super();
		this.data = data;
		this.paciente = paciente;
		this.medico = medico;
	}
	
	public Consulta() {
	}

	public LocalDate getData() {
		return data;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

}
