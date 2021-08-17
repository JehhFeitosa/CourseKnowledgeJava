package application;

import java.util.Scanner;

/*
 * Fazer um programa para ler dois n�meros inteiros M e N, e depois ler uma Matriz
 * de M linhas po N colunas contendo n�meros inteiros, podendo haver repeti��es.
 * Em seguida, ler um n�mero inteiro x que pertence � matri. Para cada ocorrencia de X, mostrar
 * os valores � esquerda, acima � direita e abaixo de X, quando houver, conforme exemplo.
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
