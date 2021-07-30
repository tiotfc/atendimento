package br.com.sada.atendimento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sada.atendimento.model.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Integer> {

}
