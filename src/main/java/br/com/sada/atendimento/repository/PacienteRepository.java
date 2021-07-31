package br.com.sada.atendimento.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.sada.atendimento.model.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer> {

	@Query("SELECT p FROM Paciente p JOIN FETCH p.id c")
	List<Paciente> findAll();
	
}
