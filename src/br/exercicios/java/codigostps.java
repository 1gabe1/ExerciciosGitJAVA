package br.exercicios.java;

import java.util.Scanner;

public class codigostps {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o nome completo do filho: ");
		String nome = scanner.nextLine();
		
		
		System.out.print("Por favor informe sua idade: ");
		int idade = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Digite o nome completo da Mãe: ");
		String nome_mae = scanner.nextLine();
		
		System.out.print("Digite o nome completo do Pai: ");
		String nome_pai = scanner.nextLine();
		
		if (nome.length() > nome_mae.length() && nome.length() > nome_pai.length()) {
			System.out.print("O Nome do Usuario é maior que o nome dos pais, Sendo:"  + nome.length() + " caracteres");
			}
		else {
			System.out.println("O nome do usuário não é maior que o da mãe e do pai.");
		}
			
		scanner.close();
			
	}

}
