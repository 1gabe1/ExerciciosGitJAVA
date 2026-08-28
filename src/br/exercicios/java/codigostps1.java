package br.exercicios.java;

import java.util.Scanner;

public class codigostps1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = scanner.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		double nota2 = scanner.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		double nota3 = scanner.nextDouble();
		
		System.out.print("Digite a quarta nota: ");
		double nota4 = scanner.nextDouble();
		
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
			
		if (media >= 7) {
			System.out.printf("Voce foi Aprovado!! Media = %.2f%n", media);
			
		}
		else if (media >= 5){
			System.out.printf("Recuperação!! Media = %.2f%n", media);
		}
		else {
			System.out.printf("REPROVADO!! %.2f%n", media);
		}
		
		scanner.close();
	}

}





// foi aprovado (média >= 7), 
// está em recuperação (média entre 5 e 6.9) 
// ou foi reprovado (média < 5). 