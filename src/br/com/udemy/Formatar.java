package br.com.udemy;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Formatar {
	
	public static void main(String[] args) {
		
		//ISO 8601 é o formato padrão do Java, impressão normal ou toString já saem nesse formato.
		//Não se pode formatar Instant sem indicar o fuso horário.
		
		LocalDate d04 = LocalDate.parse("1985-06-29");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");//Horário padrão de Londres(Z)
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern( "dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern( "dd/MM/yyyy HH:mm");
		//Devido o Instante não ter zona, é preciso configura sua zona(no caso, utilizado o padrão do sistema).
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern( "dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;//Usado para formatar o Instant no padrão sem declaração manual do formato.
		
		
		//Para formatar o formato ISO8901 para um customizável, pode ser dessas  maneiras.
		System.out.println("d04: " + d04.format(fmt1));
		System.out.println("d04: " + fmt1.format(d04));
		System.out.println("d04: " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("d05: " + d05.format(fmt1));
		System.out.println("d05: " + d05.format(fmt2));
		
		System.out.println("d06: " + fmt3.format(d06));//Pelo Instant não ter o método format, é chamado através do fmt(DateTimeFormatter).
		//Foi Impresso o horário do sistema(BR), por isso já converteu o fuso horário(incluso o dia se for o caso).
		
		System.out.println("d05: " + d05.format(fmt4));
		System.out.println("d06: " + fmt5.format(d06));
	}
}
