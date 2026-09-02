package br.exercicios.java;

import java.util.Scanner;
public class codigostps2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double taxaEuro = 6.01;
		double taxaDolar = 5.14;
		double taxaLibra = 7.01;
		
		System.out.print("Digite um valor em Reais: ");
		double valor = scanner.nextDouble();
		
		System.out.print("selecione a opção: 1-dólar / 2-euro / 3-libra ");
		int moeda = scanner.nextInt();
		
		
		double moeda_cambio = 0;
		
		if (moeda == 1) {
			
			moeda_cambio = valor / taxaDolar;
			System.out.printf("O volor em Dolar é de: %.2f", moeda_cambio);
		}
		else if (moeda == 2){
			
			moeda_cambio = valor / taxaEuro;
			System.out.printf("O volor em Euro é de: %.2f", moeda_cambio);
		}
		else if (moeda == 3) {
			moeda_cambio = valor / taxaLibra;
			System.out.printf("O volor em Libra é de: %.2f", moeda_cambio);
			
		}
		else {
			System.out.printf("O volor esta incorreto. Favor selecionar o numero correto!! ");
		}
		scanner.close();
	}
		
}
