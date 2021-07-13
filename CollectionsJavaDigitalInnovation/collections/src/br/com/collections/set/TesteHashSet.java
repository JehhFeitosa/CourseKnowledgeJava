package br.com.collections.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TesteHashSet {

    public static void main(String[] args) {

        Set<Integer> notasAlunos = new HashSet<>();

        //Adiciona as notas no Set
        notasAlunos.add(4);
        notasAlunos.add(2);
        notasAlunos.add(23);
        notasAlunos.add(14);
        notasAlunos.add(55);


        notasAlunos.set(44);
        //ollections.sort(notasAlunos);

    }
}
