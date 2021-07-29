package br.com.sada.atendimento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sada.atendimento.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
	
}
