package br.exercicios.java;

import java.util.Scanner;
public class codigostps3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o Dia do seu Aniversario: ");
		int diaNas = scanner.nextInt();
		
		System.out.print("Digite o Mês do seu Aniversario: ");
		int mesNas = scanner.nextInt();
		
		System.out.print("Digite o Ano do seu Aniversario: ");
		int anoNas = scanner.nextInt();
		
		int diaAtual = 22;
		int mesAtual = 8;
		int anoAtual = 2026;
		
		int diasNascimento = 0;
		int diasAtual = 0;
		
		
		for (int ano =1; ano < anoNas; ano++) {
			
			if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
				   
				diasNascimento += 366;
				
			}
			else {
				diasNascimento += 365;
				
			}
				
		}
		
		for (int ano = 1; ano < anoAtual; ano++) {
			
			if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
                diasAtual += 366;
            } else {
                diasAtual += 365;
            }
        }
		
		for (int mes = 1; mes < mesNas; mes++) {
			
			if (mes == 2) {
				
				if ((anoNas % 400 == 0) || (anoNas % 4 == 0 && anoNas % 100 != 0)) {
					
					diasNascimento += 29;
				}
				else {
					diasNascimento += 28;
				}
				
			}
			else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				diasNascimento += 30;
			}
			else {
				diasNascimento += 31;
			}
		}
		
		diasNascimento += diaNas;
		
		for (int mes = 1; mes < mesAtual; mes++) {

            if (mes == 2) {

                if ((anoAtual % 400 == 0)
                        || (anoAtual % 4 == 0 && anoAtual % 100 != 0)) {

                    diasAtual += 29;

                } else {
                    diasAtual += 28;
                }

            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {

                diasAtual += 30;

            } else {

                diasAtual += 31;
            }
        }

        diasAtual += diaAtual;
		
        int idadeEmDias = diasAtual - diasNascimento;

        System.out.println("Sua idade em dias é: " + idadeEmDias + " dias.");

        scanner.close();
    }
}