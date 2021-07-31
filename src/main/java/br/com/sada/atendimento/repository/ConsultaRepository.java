package br.com.sada.atendimento.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.sada.atendimento.model.Consulta;
import br.com.sada.atendimento.model.Medico;
import br.com.sada.atendimento.model.Paciente;

public interface ConsultaRepository extends JpaRepository<Consulta, Integer> {

	@Query(value = "SELECT c FROM Consulta c WHERE MONTH(c.data) = :mes AND c.medico = :medico")
	List<Consulta> getByMedicoAndByMonth(int mes, Medico medico);
	
//	@Query(value = "SELECT p "
//			+ "FROM Consulta c, Medico m, Paciente p "
//			+ "WHERE "
//			+ "c.medico = m.medico AND "
//			+ "c.paciente = p.paciente AND "
//			+ "c.medico = :medico AND "
//			+ "c.data = :data")
	List<Paciente> getByMedicoAndData(LocalDate data, Medico medico);


}
