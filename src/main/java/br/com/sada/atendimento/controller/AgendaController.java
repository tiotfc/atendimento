package br.com.sada.atendimento.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sada.atendimento.model.Consulta;
import br.com.sada.atendimento.service.AgendaServiceImpl;

@RestController
@RequestMapping("/agendas")
public class AgendaController {

	private final AgendaServiceImpl agendaService;

	public AgendaController(AgendaServiceImpl agendaService) {
		super();
		this.agendaService = agendaService;
	}

	@GetMapping("/disponiveis")
	public List<LocalDate> listarAgendaLivrePorMedico(int mes, int ano, int medicoId) {
		return agendaService.listaAgendaLivrePorMedico(mes, ano, medicoId);
	}
	
	@GetMapping("/marcadas")
	public List<Consulta> listarAgendaPorMedicoPorMes(int mes, int medicoId) {
		return agendaService.listaAgendaPorMedicoPorMes(mes, medicoId);
	}
	
	@DeleteMapping
	public void apagarAgendamento(int agendaId) {
		agendaService.apagarAgendamento(agendaId);		
	}

}
