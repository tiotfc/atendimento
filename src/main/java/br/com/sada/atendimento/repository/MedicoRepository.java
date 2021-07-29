package br.com.sada.atendimento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sada.atendimento.model.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Integer> {

}
