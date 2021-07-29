package br.com.sada.atendimento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sada.atendimento.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Integer> {

}
