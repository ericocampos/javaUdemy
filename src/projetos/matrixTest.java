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
//		Cria��o do scanner
		Scanner scan = new Scanner(System.in);
		
//		Cria��o da matriz com 30 linhas (alunos) e 4 colunas (3 notas + m�dia)
		double[][] notas = new double[30][4];
		
//		Cria��o das v�riaveis de linha, coluna, soma e m�dia.
		int  row, col;
		double soma, media;
		
		for(row = 0; row < 3; row++){
			soma = 0;
			for(col = 0; col < 3; col++){
				System.out.println("Digite a " + (col+1) + "� nota para o " + (row+1) + "� aluno: ");
				notas[row][col] = scan.nextDouble();
				soma = soma + notas[row][col];
			}
			media = soma/3;
			notas[row][3] = media;
//			Limpa a tela para inser��o de novas notas.
			Utilitarios.limpaTela();
		}
		
//		Exibindo as m�dias salvas na matriz.
		System.out.println("Voc� salvou as seguintes m�dias: ");
		for(row = 0; row < 3; row++){
			System.out.println("Aluno " + (row+1) + ": " + notas[row][3]);
		}
	}

}
