package br.com.sada.atendimento.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.sada.atendimento.data.utils.DataUtils;
import br.com.sada.atendimento.model.Consulta;
import br.com.sada.atendimento.model.Medico;

@Service
public class AgendaServiceImpl {

	private final ConsultaServiceImpl consultaService;
	private final MedicoServiceImpl medicoService;

	public AgendaServiceImpl(ConsultaServiceImpl consultaService, MedicoServiceImpl medicoService) {
		super();
		this.consultaService = consultaService;
		this.medicoService = medicoService;
	}

	@PostMapping
	public List<LocalDate> listaAgendaLivrePorMedico(int mes, int ano, int medicoId) {
		Medico medico = medicoService.buscarPorId(medicoId);
		List<Consulta> listaConsultasPorMedicoPorMes = consultaService.buscarPorMedicoPorMes(mes, medico);
		List<LocalDate> listaDatasMesAno = DataUtils.buscarDatasNoMes(mes, ano);
		List<LocalDate> listaDatasDisponiveis = new ArrayList<>();
		
		listaConsultasPorMedicoPorMes.stream().forEach(c -> {
			int dia = c.getData().getDayOfMonth();
			listaDatasMesAno.stream().forEach(d -> {
				if (!(d.getDayOfMonth() == dia)) {
					listaDatasDisponiveis.add(d);
				}
			});

		});
		if (listaDatasDisponiveis.size() == 0) {
			listaDatasDisponiveis.addAll(listaDatasMesAno);
		}
		return listaDatasDisponiveis;
	}

	public List<Consulta> listaAgendaPorMedicoPorMes(int mes, int medicoId) {
		Medico medico = medicoService.buscarPorId(medicoId);
		return consultaService.buscarPorMedicoPorMes(mes, medico);
		
	}
	
	public List<Consulta> listaAgendaPorMedicoPorDia(LocalDate data, int medicoId) {
		Medico medico = medicoService.buscarPorId(medicoId);
		List<Consulta> listaConsultasPorMedicoPorMes = consultaService.buscarPorMedicoPorMes(data.getMonthValue(), medico);
		
		return listaConsultasPorMedicoPorMes.stream().filter(c -> c.getData().equals(data)).collect(Collectors.toList());
		
	}
	
	public void apagarAgendamento(int agendaId) {
		Consulta consulta = consultaService.buscarPorId(agendaId);
		consultaService.deleteConsulta(consulta);
		
	}

}
