package br.com.sada.atendimento.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.sada.atendimento.model.Consulta;
import br.com.sada.atendimento.model.Medico;
import br.com.sada.atendimento.model.Paciente;
import br.com.sada.atendimento.model.dto.ConsultaEntradaDto;
import br.com.sada.atendimento.repository.ConsultaRepository;

@Service
public class ConsultaServiceImpl {

	private final ConsultaRepository consultaRepository;
	private final PacienteServiceImpl pacienteService;
	private final MedicoServiceImpl medicoService;

	public ConsultaServiceImpl(ConsultaRepository consultaRepository, PacienteServiceImpl pacienteService,
			MedicoServiceImpl medicoService) {
		super();
		this.consultaRepository = consultaRepository;
		this.pacienteService = pacienteService;
		this.medicoService = medicoService;
	}

	public Consulta salvar(ConsultaEntradaDto consultaEntradaDto) {
		Consulta consulta = new Consulta();
		consulta.setData(consultaEntradaDto.getData());
		consulta.setPaciente(pacienteService.buscarPorId(consultaEntradaDto.getPacienteId()));
		consulta.setMedico(medicoService.buscarPorId(consultaEntradaDto.getMedicoId()));
		return consultaRepository.save(consulta);
	}

	public List<Consulta> buscarTodos() {
		return consultaRepository.findAll();
	}

	public Consulta buscarPorId(Integer id) {
		return consultaRepository.getById(id);
	}

	public List<Consulta> buscarPorMedicoPorMes(int mes, Medico medico) {
		return consultaRepository.getByMedicoAndByMonth(mes, medico);
	}
	
	public List<Paciente> buscarPacientesPorMedicoPorDia(LocalDate data, Medico medico) {
		return consultaRepository.getByMedicoAndData(data, medico);
	}
	
	public void deleteConsulta(Consulta consulta) {
		consultaRepository.delete(consulta);
	}


}
