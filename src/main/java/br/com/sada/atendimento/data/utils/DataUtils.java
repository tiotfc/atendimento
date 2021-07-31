package br.com.sada.atendimento.data.utils;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

public class DataUtils {

	public static List<LocalDate> buscarDatasNoMes(int mes, int ano) {
		List<LocalDate> listaDatas = new ArrayList<LocalDate>();
		
		int i = LocalDate.now().getMonthValue() == mes ? LocalDate.now().getDayOfMonth() : 1;
		int dias = qtdDiasMes(mes, ano);
		
		while (i < dias) {
			LocalDate data = LocalDate.of(ano, mes, i);
			if (!fimDeSemana(data)) {
				listaDatas.add(data);
			}
			i++;
		}
		
		return listaDatas;
	}

	
	public static boolean fimDeSemana(LocalDate date) {
		DayOfWeek d = date.getDayOfWeek();
		return d == DayOfWeek.SATURDAY || d == DayOfWeek.SUNDAY;
	}

	public static int qtdDiasMes(int mes, int ano) {

		switch (mes) {
		case 2:
			if (Year.isLeap(ano)) {
				return 29;
			} else {
				return 28;
			}
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		default:
			return 31;
		}
	}

	
}
