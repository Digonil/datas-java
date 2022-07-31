package br.com.udemy;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Instanciar {
	public static void main(String[] args) {

		//LocalDate para instanciar data e LocalDateTime para instanciar data e hora.
		
		
		LocalDate d01 = LocalDate.now();//Instancia a data
		LocalDateTime d02 = LocalDateTime.now();//Instancia a data e hora local
//		Instant d03 = Instant.now();//Instancia com o horário GMT(com fuso horário de Londres)
		LocalDate d04 = LocalDate.parse("1985-06-29");//Converte um formato de data em texto ISO 8601 para um localDate.
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");//Converte um formato de data em texto ISO 8601 para um localDate.
//		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");//Converte um formato de data em texto ISO 8601 para um localDate no padrão UTC, horário de Londres.
//		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");//Especificando um time zone diferente.
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		LocalDate d10 = LocalDate.of(2022, 7, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
		
		
		
		System.out.println("d01: " + d01.toString());//com o toString, imprimi no formato ISO
		System.out.println("d02: " + d02.toString());
//		System.out.println("d03: " + d03.toString());
		System.out.println("d04: " + d04.toString());
		System.out.println("d05: " + d05.toString());
//		System.out.println("d06: " + d06.toString());
//		System.out.println("d07: " + d07.toString());
		System.out.println("d08: " + d08.toString());
		System.out.println("d09: " + d09.toString());
		System.out.println("d10: " + d10.toString());
		System.out.println("d11: " + d10.toString());

	}

}
