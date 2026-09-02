package br.exercicios.java;

import java.util.Scanner;

public class codigotps4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor da compra: ");
		double valorCompra = scanner.nextDouble();
		
		double desconto;
		
		if (valorCompra > 1000) {
			desconto = valorCompra * 0.10;
			
		}
		else if (valorCompra >= 500) {
			desconto = valorCompra * 0.05;
		}
		else {
			desconto = 0;
		} 
		
		double DindinFinal;
		
		DindinFinal = valorCompra - desconto;
		
		System.out.println("O valor inicial é: " + valorCompra);
		System.out.println("O valor do desconto é: " + desconto);
		System.out.println("O valor final com desconto é de : " + DindinFinal);
		
		
		scanner.close();
		
	}

}
