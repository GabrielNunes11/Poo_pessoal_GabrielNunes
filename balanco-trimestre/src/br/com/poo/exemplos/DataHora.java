package br.com.poo.exemplos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class DataHora {

	public static void main(String[] args) throws ParseException {
//		//Trabalhando com Date
//		Date data = new Date();
//		System.out.println(data);
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		System.out.println(sdf.format(data));
//		
//		String strData = "05/09/1990";
//		SimpleDateFormat sdfData = new SimpleDateFormat("dd/MM/yyyy");
//		Date dataFormatada = sdfData.parse(strData);
//		System.out.println(sdfData.format(dataFormatada));

		// Trabalhando com Gregorian Calendar
//		GregorianCalendar gc = new GregorianCalendar();
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		System.out.println(sdf.format(gc.getTime()));
//		gc.add(gc.DAY_OF_YEAR, -1);
//		System.out.println(sdf.format(gc.getTime()));
//		
//		System.out.println(gc.isLeapYear(2024));
//		Date dt = gc.getTime();
//		System.out.println(sdf.format(dt));

		// Trabalhando com Local Date
//		LocalDate hoje = LocalDate.now();
//		System.out.println("LocalDate antes de formatar: "+hoje);
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		String hojeFormatado = hoje.format(formatter);
//		
//		System.out.println("LocalDate antes de formatar: "+hojeFormatado);

		// Trabalhando com Local Date Time
//		LocalDateTime agora = LocalDateTime.now();
//		System.out.println("LocalDateTime antes de formatar: "+agora);
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
//		String agoraFormatado = agora.format(formatter);
//		
//		System.out.println("LocalDateTime antes de formatar: "+agoraFormatado);

	}
}
