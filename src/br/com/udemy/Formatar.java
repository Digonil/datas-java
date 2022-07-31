package br.com.udemy;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Formatar {
	
	public static void main(String[] args) {
		
		//ISO 8601 � o formato padr�o do Java, impress�o normal ou toString j� saem nesse formato.
		//N�o se pode formatar Instant sem indicar o fuso hor�rio.
		
		LocalDate d04 = LocalDate.parse("1985-06-29");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");//Hor�rio padr�o de Londres(Z)
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern( "dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern( "dd/MM/yyyy HH:mm");
		//Devido o Instante n�o ter zona, � preciso configura sua zona(no caso, utilizado o padr�o do sistema).
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern( "dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;//Usado para formatar o Instant no padr�o sem declara��o manual do formato.
		
		
		//Para formatar o formato ISO8901 para um customiz�vel, pode ser dessas  maneiras.
		System.out.println("d04: " + d04.format(fmt1));
		System.out.println("d04: " + fmt1.format(d04));
		System.out.println("d04: " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("d05: " + d05.format(fmt1));
		System.out.println("d05: " + d05.format(fmt2));
		
		System.out.println("d06: " + fmt3.format(d06));//Pelo Instant n�o ter o m�todo format, � chamado atrav�s do fmt(DateTimeFormatter).
		//Foi Impresso o hor�rio do sistema(BR), por isso j� converteu o fuso hor�rio(incluso o dia se for o caso).
		
		System.out.println("d05: " + d05.format(fmt4));
		System.out.println("d06: " + fmt5.format(d06));
	}
}
