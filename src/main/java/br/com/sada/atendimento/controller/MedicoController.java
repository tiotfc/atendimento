package br.com.sada.atendimento.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sada.atendimento.model.Medico;
import br.com.sada.atendimento.service.MedicoServiceImpl;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

	private final MedicoServiceImpl medicoService;

	public MedicoController(MedicoServiceImpl medicoService) {
		this.medicoService = medicoService;
	}
	
	@PostMapping
	public Medico salvar(@RequestBody @Valid Medico medico) {
		return medicoService.salvar(medico);
	}
	
	@GetMapping
	public List<Medico> listarTodos() {
		return medicoService.buscarTodos();
	}
	
}
