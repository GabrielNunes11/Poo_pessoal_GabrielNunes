package br.com.poo.exemplos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TerceiroExemplo {

	static final String PATH_BASICO = "./temp/";
	static final String EXTENSAO = ".txt";

	static Logger logger = Logger.getLogger(TerceiroExemplo.class.getName());
	
	public static void leitor(String path) throws IOException {
		//try (
		try {
			BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path + EXTENSAO)); 
			String linha = "";
			while (true) {
				linha = buffRead.readLine();
				if (linha != null) {
					//exemplo de como iremos utilizar o metodo split()
					//String[] dados = linha.split(";");
					//System.out.println(linha);
					logger.log(Level.INFO, linha);
				} else {
					break;
				}
			}
			} catch(FileNotFoundException fileNotFoundException) {
				System.out.println("Arquivo não encontrado");
			}
			//buffRead.close();
	}

//exemplo de chamada do metodo de saque passndo os parametros conta e valor a ser sacado
	//public static void comprovanteSaque(Conta conta, Double valorSaque) throws IOException {
	public static void comprovanteSaque() throws IOException {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Escreva o nome do arquivo: ");
		logger.log(Level.INFO, "Escreva o nome do arquivo: ");
		String nome = sc.nextLine();
//exemplo de como criar um arquivo já definindo o nome dele sem usar Scanner
		//String nomeArquivo = conta.getTitular() + "_" + conta.getCpf();
		
		try(BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nome + EXTENSAO));) {
			String linha = "";
	
//exemplo de laco de repeticao para digitar várias linhas
			//System.out.println("Escreva algo: ");
			//for(int i=0; i<5; i++) {
			//	linha = sc.nextLine();
			//	buffWrite.append(linha + "\n");
			//}
		
//exemplo de construcao de comprovante de saque com data e hora
			linha = "********** SAQUE *************";
			buffWrite.append(linha + "\n");
			
			LocalDateTime dt = LocalDateTime.now();
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
			linha = "Operação realizada em: " + dt.format(dtf);
			buffWrite.append(linha + "\n");
			
			linha = "Nome: " + "Débora Souza";
			buffWrite.append(linha + "\n");
			
			linha = "CPF: " + "123.456.789-11";
			buffWrite.append(linha + "\n");
			
			linha = "****** FIM SAQUE ********";
			buffWrite.append(linha + "\n");
			
			//buffWrite.close();
			sc.close();
		}
	}

	public static void main(String[] args) throws IOException {
		comprovanteSaque();
		//leitor("testando");
		
		// Trabalhando com Date
//		Date data = new Date();
//		System.out.println(data);
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		System.out.println(sdf.format(data));
//		Scanner sc = new Scanner(System.in);
//		String strData = sc.next();
//		sc.close();
//		for(int i=0; i<5; i++) {
//			System.out.println("*******");
//		}
//		SimpleDateFormat sdfData = new SimpleDateFormat("dd-MM-yyyy");
//		Date dataFormatada = sdfData.parse(strData);
//		System.out.println(sdfData.format(dataFormatada));

		// Trabalhando com Gregorian Calendar
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		GregorianCalendar gc = new GregorianCalendar();
//		System.out.println(sdf.format(gc.getTime()));
//		gc.add(gc.MONTH, 2);
//		System.out.println(sdf.format(gc.getTime()));
//		
//		System.out.println(gc.isLeapYear(2028));
//		Date dt = gc.getTime();
//		gc.setTime(dt);

		// trabalhando com LocalDate
//		LocalDate hoje = LocalDate.now();  
//		System.out.println("LocalDate antes de formatar: " + hoje);
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
//		//String hojeFormatado = hoje.format(formatter);
//
//		System.out.println("LocalDate depois de formatar: " + hoje.format(formatter));

		// trabalhando com LocalDateTime
//		LocalDateTime agora = LocalDateTime.now();  
//		System.out.println("LocalDateTime antes de formatar: " + agora);  
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
//		//String agoraFormatado = agora.format(formatter);
//
//		System.out.println("LocalDateTime depois de formatar: " + agora.format(formatter));

	}

}
