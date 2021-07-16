package Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExemploList {
	
	public static void main(String[] args) {
	
	List<Estudante> estudantes = new ArrayList<>();
	
	estudantes.add(new Estudante("Alexandre", 41));
	estudantes.add(new Estudante("Carlos", 23));
	estudantes.add(new Estudante("Mariana", 21));
	estudantes.add(new Estudante("Jo�o", 18));
	estudantes.add(new Estudante("Thiago", 20));
	estudantes.add(new Estudante("George", 22));
	estudantes.add(new Estudante("Larissa", 21));
	
	System.out.println("--- ordem de inser��o ---");
	System.out.println(estudantes);
	
	estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
	
	System.out.println("--- ordem natural dos n�meros - idade ---");
	System.out.println(estudantes);
	
	estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
	
	System.out.println("--- ordem reversa dos n�meros - idade ---");
	System.out.println(estudantes);

	estudantes.sort((Comparator.comparingInt(Estudante::getIdade)));
	
	System.out.println("--- ordem natural dos n�meros - idade (method reference) ---");
	System.out.println(estudantes);

	estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
	
	System.out.println("--- ordem reversa dos n�meros - idade (method reference) ---");
	System.out.println(estudantes);
	
	Collections.sort(estudantes);

	System.out.println("--- ordem natural dos n�meros - idade (interface comparable) ---");
	System.out.println(estudantes);
	
	Collections.sort(estudantes, new EstudanteOrdemIdadeReversaComparator());
	
	System.out.println("--- ordem reversa dos n�meros - idade (interface comparable) ---");
	System.out.println(estudantes);
	
	
	
	}
	
	

}
