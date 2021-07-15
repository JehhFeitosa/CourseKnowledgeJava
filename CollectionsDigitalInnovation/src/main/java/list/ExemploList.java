package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/*
Conhecendo o List e seus métodos
 */
public class ExemploList {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);

        //trocando o valor do indice
        nomes.set(2, "Larissa");
        System.out.println(nomes);

        //embarralhando valores da list
        Collections.sort(nomes);
        System.out.println(nomes);

        //trocando o valor do indice
        nomes.set(2, "Wesley");
        System.out.println(nomes);

        //removendo o valor de um indice
        nomes.remove(4);
        System.out.println(nomes);

        nomes.remove("jes");
        System.out.println(nomes);

        //pegando o valor de um indice
        //setando em uma váriavel
        String nome = nomes.get(1);
        System.out.println(nome);

        //qual é o indice do elemento passado(Carlos)
        int posicao = nomes.indexOf("Carlos");
        System.out.println(posicao);

        //verificando o tamanho da list
        int tamanho = nomes.size();
        System.out.println(tamanho);

        nomes.remove("Larissa");
        tamanho = nomes.size();
        System.out.println(tamanho);

        //verificando se o elemento existe na lista
        boolean temJoao = nomes.contains("João");
        System.out.println(temJoao);

        boolean temFernando = nomes.contains("Fernando");
        System.out.println(temFernando);

        //verifica se possui ou não elementos
        boolean listaEstaVazia  = nomes.isEmpty();
        System.out.println(listaEstaVazia);

        //laço para visualização dos elementos da lista
        for (String nomeDoItem:nomes) {
            System.out.println(" -->" + nomeDoItem);
        }

        //ITERATOR objeto que percorre uma lista ou um container
        Iterator<String> iterator = nomes.iterator();

        //hasNext método que determina se existem
        // elementos para serem iterados
        while (iterator.hasNext()){
            //Next Lê a String
            System.out.println(" ---->" +iterator.next());
        }

        //limpa a lista/ remove elementos
        nomes.clear();

        //verifica se possui ou não elementos
        listaEstaVazia  = nomes.isEmpty();
        System.out.println(listaEstaVazia);





    }
}
