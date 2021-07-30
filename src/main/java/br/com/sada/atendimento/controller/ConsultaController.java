package br.com.sada.atendimento.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sada.atendimento.model.Consulta;
import br.com.sada.atendimento.model.dto.ConsultaEntradaDto;
import br.com.sada.atendimento.service.ConsultaServiceImpl;
import br.com.sada.atendimento.service.MedicoServiceImpl;
import br.com.sada.atendimento.service.PacienteServiceImpl;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {

	private final ConsultaServiceImpl consultaService;

	public ConsultaController(ConsultaServiceImpl consultaService) {
		super();
		this.consultaService = consultaService;
	}

	@PostMapping
	public Consulta salvar(@RequestBody @Valid ConsultaEntradaDto consultaEntradaDto) {
		return consultaService.salvar(consultaEntradaDto);
	}
	
	@GetMapping
	public List<Consulta> listarTodos() {
		return consultaService.buscarTodos();
	}
	
}
