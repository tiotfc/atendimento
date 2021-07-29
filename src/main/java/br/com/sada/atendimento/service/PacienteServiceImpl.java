package br.com.sada.atendimento.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.sada.atendimento.model.Endereco;
import br.com.sada.atendimento.model.Paciente;
import br.com.sada.atendimento.repository.PacienteRepository;

@Service
public class PacienteServiceImpl {

	private final PacienteRepository pacienteRepository;

	public PacienteServiceImpl(PacienteRepository pacienteRepository) {
		super();
		this.pacienteRepository = pacienteRepository;
	}

	public Paciente salvar(Paciente paciente) {
		Endereco endereco = new Endereco(paciente.getEndereco().getRua(), paciente.getEndereco().getNumero(), paciente.getEndereco().getCidade());
		
		return pacienteRepository.save(new Paciente(paciente.getProntuario(), paciente.getNome() , paciente.getSobrenome(), endereco, paciente.getDataNascimento(), paciente.getTelefone()));
	}

	public List<Paciente> buscarTodos() {
		return pacienteRepository.findAll();
	}

	public Paciente buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void excluir(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
