package br.exercicios.java;


import java.util.Scanner;

public class codigostps5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe um Ano: ");
		int ano = scanner.nextInt();

		
		
		if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println("Oh Ano eh bissexto");
			
		}
		else {
			System.out.println("Oh Ano não eh bissexto");
			
		}
		
		 scanner.close();
		
	}

}
