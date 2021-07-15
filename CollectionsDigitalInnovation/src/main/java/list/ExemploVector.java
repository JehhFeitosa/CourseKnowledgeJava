package list;

import java.util.List;
import java.util.Vector;

/*
Conhecendo o Vector e seus m�todos
 */
public class ExemploVector {

    public static void main(String[] args) {

        List<String> esportes = new Vector<>();

        //Adicioan 4 esportes no vetor
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("T�nis de Mesa");
        esportes.add("Handebol");

        System.out.println(esportes);

        //Altera o valor da posi��o 2 do vetor
        esportes.set(2, "Ping Pong");

        //Remove o esporte da posi��o 2
        esportes.remove(2);

        //Remove o esporte Hnadebol do vetor
        esportes.remove("Handebol");

        //Rretorna o primeiro item do vetor
        System.out.println(esportes.get(0));

        //Navega nos esportes
        for (String esporte: esportes){
            System.out.println(esporte);
        }

    }
}
