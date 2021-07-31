package br.com.sada.atendimento.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sada.atendimento.model.Paciente;
import br.com.sada.atendimento.model.dto.PacienteEntradaDto;
import br.com.sada.atendimento.service.PacienteServiceImpl;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

	private final PacienteServiceImpl pacienteService;

	public PacienteController(PacienteServiceImpl pacienteService) {
		this.pacienteService = pacienteService;
	}
	
	@PostMapping
	public Paciente salvar(@RequestBody @Valid PacienteEntradaDto pacienteEntradaDto) {
		return pacienteService.salvar(pacienteEntradaDto.toPaciente());
	}
	
	@GetMapping
	public List<Paciente> listarTodos() {
		return pacienteService.buscarTodos();
	}
	
	@GetMapping("/{id}")
	public Paciente buscaPorId(@PathVariable int id) {
		return pacienteService.buscarPorId(id);
	}
	
	
}
