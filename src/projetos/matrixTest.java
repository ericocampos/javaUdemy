package projetos;

import utils.Utilitarios;
import java.util.Scanner;

import utils.Utilitarios;

/**
 * @author Erico
 * 
 *         Projeto para gerar uma Matriz de notas de alunos.
 *
 */

public class matrixTest {

	public static void main(String[] args) {
//		Criação do scanner
		Scanner scan = new Scanner(System.in);
		
//		Criação da matriz com 30 linhas (alunos) e 4 colunas (3 notas + média)
		double[][] notas = new double[30][4];
		
//		Criação das váriaveis de linha, coluna, soma e média.
		int  row, col;
		double soma, media;
		
		for(row = 0; row < 3; row++){
			soma = 0;
			for(col = 0; col < 3; col++){
				System.out.println("Digite a " + (col+1) + "ª nota para o " + (row+1) + "º aluno: ");
				notas[row][col] = scan.nextDouble();
				soma = soma + notas[row][col];
			}
			media = soma/3;
			notas[row][3] = media;
//			Limpa a tela para inserção de novas notas.
			Utilitarios.limpaTela();
		}
		
//		Exibindo as médias salvas na matriz.
		System.out.println("Você salvou as seguintes médias: ");
		for(row = 0; row < 3; row++){
			System.out.println("Aluno " + (row+1) + ": " + notas[row][3]);
		}
	}

}
