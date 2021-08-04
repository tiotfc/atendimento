package br.com.sada.atendimento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sada.atendimento.model.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer> {

	
}
