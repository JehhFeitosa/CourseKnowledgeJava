package application;

import java.util.Scanner;

/*
 * Fazer um programa para ler dois números inteiros M e N, e depois ler uma Matriz
 * de M linhas po N colunas contendo números inteiros, podendo haver repetições.
 * Em seguida, ler um número inteiro x que pertence à matri. Para cada ocorrencia de X, mostrar
 * os valores à esquerda, acima à direita e abaixo de X, quando houver, conforme exemplo.
 */
public class Exercise2 {

	public static void main(String[] args) {
	
	
	Scanner sc = new Scanner(System.in);

	int m = sc.nextInt();
	int n = sc.nextInt();
	int[][] mat = new int[m][n];

	for (int i = 0; i < mat.length; i++) {
		for (int j = 0; j < mat[i].length; j++) {
			mat[i][j] = sc.nextInt();
		}
	}
	
	
	sc.close();
	}

}
