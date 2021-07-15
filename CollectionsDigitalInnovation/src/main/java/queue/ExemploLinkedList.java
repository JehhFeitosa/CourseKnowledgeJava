package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

/*
Conhecendo o LinkedList e seus métodos...
Queue tem a mesma funcionalidade de fila.
"Primeiro que entra é o primeiro que saí,
Último que entra é o último que saí."
 */
public class ExemploLinkedList {

    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        //Poll Retorna e retira um elemento da fila
        String clienteASerAtendido = filaBanco.poll();
        System.out.println(clienteASerAtendido);
        System.out.println(filaBanco);

        //PEEK Retorna o primeiro elemento mas não remove
        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

        //filaBanco.clear();

        //ELEMENT retorna o elemento da fila, caso não tenha mais nada na fila
        //aparecerá NoSuchELementException
        String primeiroClienteOuErro = filaBanco.element();
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);

        //laço para visualização dos elementos da fila
        for (String client: filaBanco){
            System.out.println(client);
        }

        //ITERATOR objeto que percorre uma fila ou um container
        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        //hasNext método que determina se existem
        // elementos para serem iterados
        while (iteratorFilaBanco.hasNext()){
            //Next Lê a String
            System.out.println("--->" + iteratorFilaBanco.next());
        }
        System.out.println(filaBanco.size());
        System.out.println(filaBanco.isEmpty());

        filaBanco.add("Wesley");
        System.out.println(filaBanco);
    }

}
