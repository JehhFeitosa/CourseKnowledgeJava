package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		//Para adicionar em uma posição especifica
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		for(String x: list) {
			System.out.println(x);
		}
		
		
		//Expressão lambda que remove todos nomes da list que começam com M
		System.out.println("----------------------");
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}
		
		//Localizando a posição de um determinado elemento
		System.out.println("----------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Bob: " + list.indexOf("Marco"));
		
		//Lista apenas com os nomes começados com A
		System.out.println("----------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		
		//Localizar um  elemento conforme o predicado informado 
		System.out.println("----------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
	}

}
