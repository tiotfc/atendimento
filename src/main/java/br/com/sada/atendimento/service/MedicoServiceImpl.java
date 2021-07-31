package br.com.sada.atendimento.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.sada.atendimento.model.Medico;
import br.com.sada.atendimento.repository.MedicoRepository;

@Service
public class MedicoServiceImpl {

	private final MedicoRepository medicoRepository;
	
	public MedicoServiceImpl(MedicoRepository medicoRepository) {
		this.medicoRepository = medicoRepository;
	}

	public Medico salvar(Medico medico) {
		return medicoRepository.save(medico);
	}

	public List<Medico> buscarTodos() {
		return medicoRepository.findAll();
	}

	public Medico buscarPorId(Integer id) {
		return medicoRepository.getById(id);
	}

	public List<Medico> listarPorEspecialidade(String especialidade) {
		return medicoRepository.findAllByEspecialidade(especialidade);
	}

}
