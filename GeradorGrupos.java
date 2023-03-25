package AreaTeste;

import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class AreaTeste {

	public static void main(String[] args) {
		int aluno = 0;
		int controlador = 0;
		int lista[] = new int[40];
		int repetido = 0;
		int contagemGrupo = 0;
		int navegador = 0;
		int saida = 0;
		Scanner scan = new Scanner(System.in);
		
		while (saida == 0) {
			System.out.println("Seja bem vindo ao GERADOR DE GRUPOS !!!");
			System.out.println(" ");
			System.out.println("-para navegar pela nossa interface basta digitar o numero indicado. =) ");
			System.out.println(" ");
			System.out.println("gerar numeros aleatório - 1");
			System.out.println(" ");
			System.out.println("sair - 2");
			
			navegador = scan.nextInt();
			
			if (navegador == 1) {

				for (int i = 0; i < 40; i++) {
					repetido = 1;
					while (repetido != 0) {
						repetido = 0;
						aluno = (int) (Math.random() * 41);
						for (int j = 0; j < i; j++) {
							if (lista[j] == aluno) {
								repetido++;
								break;
							}
						}
					}
					lista[i] = aluno;
				}
				System.out.println("____________________");
				for (int k = 0; k < 40; k++) {

					System.out.print(lista[k] + " ");
					controlador++;
					if (controlador == 4) {
						controlador = 0;
						contagemGrupo++;
						System.out.println("grupo: " + contagemGrupo);
						System.out.println("____________________");
					}
				}

			}
			if (navegador == 2) {
				System.out.println("Obrigado!!");
				break;
			}
		}
	}

}
