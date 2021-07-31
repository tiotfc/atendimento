package br.com.sada.atendimento.controller;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sada.atendimento.model.Medico;
import br.com.sada.atendimento.model.Paciente;
import br.com.sada.atendimento.model.dto.MedicoEntradaDto;
import br.com.sada.atendimento.service.ConsultaServiceImpl;
import br.com.sada.atendimento.service.MedicoServiceImpl;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

	private final MedicoServiceImpl medicoService;
	private final ConsultaServiceImpl consultaService;
	
	public MedicoController(MedicoServiceImpl medicoService, ConsultaServiceImpl consultaService) {
		super();
		this.medicoService = medicoService;
		this.consultaService = consultaService;
	}

	@PostMapping
	public Medico salvar(@RequestBody @Valid MedicoEntradaDto medicoEntradaDto) {
		return medicoService.salvar(medicoEntradaDto.toMedico());
	}
	
	@GetMapping
	public List<Medico> listarTodos() {
		return medicoService.buscarTodos();
	}
	
	@GetMapping("especialidade")
	public List<Medico> listarPorEspecialidade(String especialidade) {
		return medicoService.listarPorEspecialidade(especialidade);
	}
	
	@GetMapping("pacientes") 
	public List<Paciente> listarPacientesPorData(LocalDate data, int medicoId) {
		return consultaService.buscarPacientesPorMedicoPorDia(data, medicoService.buscarPorId(medicoId));
	}
	
}
