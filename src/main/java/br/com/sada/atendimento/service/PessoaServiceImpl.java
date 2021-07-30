package br.com.sada.atendimento.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.sada.atendimento.model.Pessoa;
import br.com.sada.atendimento.repository.PessoaRepository;

@Service
public class PessoaServiceImpl {

	private final PessoaRepository pessoaRepository;

	public PessoaServiceImpl(PessoaRepository pessoaRepository) {
		super();
		this.pessoaRepository = pessoaRepository;
	}

	public List<Pessoa> buscarTodos() {
		return pessoaRepository.findAll();
	}

	public Pessoa buscarPorId(Integer id) {
		return pessoaRepository.getById(id);
	}


}
