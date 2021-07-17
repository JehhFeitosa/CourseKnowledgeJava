package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import Comparators.Estudante;

public class ExemploStreamAPI {

	public static void main(String[] args) {

		// Cria a cole��o de estudantes
		List<String> estudantes = new ArrayList<>();
		estudantes.add("Pedro");
		estudantes.add("Thayse");
		estudantes.add("Marcelo");
		estudantes.add("Carla");
		estudantes.add("Juliana");
		estudantes.add("Thiago");
		estudantes.add("Rafael");

		// Retorna a contagem de elementos do stream
		System.out.println("Contagem: " + estudantes.stream().count());

		// Retorna o elemento com maior n�mero de letras
		System.out
				.println("Maior numero de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

		// Retorna o elemento com menor n�mero de letras
		System.out
				.println("Menor numero de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

		// Retorna o elemento que tem a letra R no nome
		System.out.println("Com a letra r no nome: " + estudantes.stream()
				.filter((estudante) -> estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

		// Retorna uma nova cole��o, com os nomes concatenados a quantidade de letra de
		// cada nome
		System.out.println("Retorna uma nova cole��o com a quantidade de letras: " + estudantes.stream()
				.map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
				.collect(Collectors.toList()));

		// Retorna somente os 3 primeiros elementos da cole��o
		System.out.println(
				"Retorna    os 3 primeiros elementos: " + estudantes.stream().limit(3).collect(Collectors.toList()));

		// Exibe cada elemento no console, e depois retorna a mesma cole��o
		System.out.println(
				"Retorna os elementos: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

		// Exibe cada elemento on console sem retornar outra cole��o
		System.out.println("Retorna os elementos novamente: ");
		estudantes.stream().forEach(System.out::println);

		// Retorna true se todos os elementos possuem a letra W no nome
		System.out.println("Todos elementos tem o W no nome? "
				+ estudantes.stream().allMatch((elemento) -> elemento.contains("W")));

		// Retorna true se todos os elementos possuem a letra a minuscula no nome
		System.out.println("Tem algum elemento com a minuscula no nome? "
				+ estudantes.stream().anyMatch((elemento) -> elemento.contains("a")));

		// Retorna true se nenhum elemento possue a letra a minuscula no nome
		System.out.println("N�o Tem nenhum elemento com a minuscula no nome? "
				+ estudantes.stream().noneMatch((elemento) -> elemento.contains("a")));

		// Retorna o primeiro elemento da cole��o, se existir exibe no console
		System.out.println("Retorna o primeiro elemeto da cole��o: ");
		estudantes.stream().findFirst().ifPresent(System.out::println);

		// Exemplo de opera��o encadeada
		System.out.println("Opera��o encadeada: ");
		System.out.println(estudantes.stream().peek(System.out::println)
				.map(estudante ->
				estudante.concat(" - ").concat(String.valueOf(estudante.length())))
				.peek(System.out::println)
				.filter((estudante) ->
		estudante.toLowerCase().contains("r"))
		//.collect(Collectors.toList()));
		.collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf(" - ") + 1))));
		
	}

}
