package br.com.udemy;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ManipularData {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));// formato UTC porém, vai imprimir conforme o
																	// computador.
		System.out.println(sdf.format(d));

		Calendar cal = Calendar.getInstance();// gera uma instância de Calendar
		cal.setTime(d);// Joga a data para definir e usar o Calendar
		cal.add(Calendar.HOUR_OF_DAY, 4);// adiciona determinado tempo no horário dado.
		d = cal.getTime();

		System.out.println(d);

		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);// Soma 1 pois o Calendar entende Janeiro como 0.

		System.out.println(minutes);// extrai o minuto da data fornecida.
		System.out.println(month);// extrai o minuto da data fornecida.
	}
}
