package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

/*
Conhecendo o LinkedList e seus m�todos...
Queue tem a mesma funcionalidade de fila.
"Primeiro que entra � o primeiro que sa�,
�ltimo que entra � o �ltimo que sa�."
 */
public class ExemploLinkedList {

    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patr�cia");
        filaBanco.add("Roberto");
        filaBanco.add("Fl�vio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        //Poll Retorna e retira um elemento da fila
        String clienteASerAtendido = filaBanco.poll();
        System.out.println(clienteASerAtendido);
        System.out.println(filaBanco);

        //PEEK Retorna o primeiro elemento mas n�o remove
        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

        //filaBanco.clear();

        //ELEMENT retorna o elemento da fila, caso n�o tenha mais nada na fila
        //aparecer� NoSuchELementException
        String primeiroClienteOuErro = filaBanco.element();
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);

        //la�o para visualiza��o dos elementos da fila
        for (String client: filaBanco){
            System.out.println(client);
        }

        //ITERATOR objeto que percorre uma fila ou um container
        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        //hasNext m�todo que determina se existem
        // elementos para serem iterados
        while (iteratorFilaBanco.hasNext()){
            //Next L� a String
            System.out.println("--->" + iteratorFilaBanco.next());
        }
        System.out.println(filaBanco.size());
        System.out.println(filaBanco.isEmpty());

        filaBanco.add("Wesley");
        System.out.println(filaBanco);
    }

}
