package map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

    public static void main(String[] args) {

        Map<String, Integer> campeoesMundialFifa = new HashMap<>();

        //Adiciona os campe�es mundiais fica no mapa
        campeoesMundialFifa.put("Brasil", 5);
        campeoesMundialFifa.put("Alemanha", 4);
        campeoesMundialFifa.put("Italia", 4);
        campeoesMundialFifa.put("Uruguai", 2);
        campeoesMundialFifa.put("Argentina", 2);
        campeoesMundialFifa.put("Fran�a", 2);
        campeoesMundialFifa.put("Inglaterra", 1);
        campeoesMundialFifa.put("Espanha", 1);

        System.out.println(campeoesMundialFifa);

        //Atualiza o valor para a chave Brasil
        campeoesMundialFifa.put("Brasil", 6);

        System.out.println(campeoesMundialFifa);

        // Retorna a Argentina
        System.out.println(campeoesMundialFifa.get("Argentina"));

        //Retorna se existe ou n�o um campe�o Fran�a
        System.out.println(campeoesMundialFifa.containsKey("Fran�a"));

        // Remove o campe�o Fran�a
        campeoesMundialFifa.remove("Fran�a");

        //Retorna se existe ou n�o um campe�o Fran�a
        System.out.println(campeoesMundialFifa.containsKey("Fran�a"));

        //Retorna se existe ou n�o alguma sele��p Hexa Campe�
        System.out.println(campeoesMundialFifa.containsValue(6));

        //Retorna o tamanho do mapa
        System.out.println(campeoesMundialFifa.size());

        //Retorna se existe ou n�o alguma sele��p Hexa Campe�
        System.out.println(campeoesMundialFifa);

        //Navega nos registros do mapa
        for(Map.Entry<String, Integer> entry : campeoesMundialFifa.entrySet()){
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }

        //Navega nos registros do mapa
        for(String key:campeoesMundialFifa.keySet()){
            System.out.println(key + "--" + campeoesMundialFifa.get(key));
        }
        System.out.println(campeoesMundialFifa);

        //Verifica se o mapa contem a chave Estados Unidos
        System.out.println(campeoesMundialFifa.containsKey("Estados Unidos"));

        //Verifica se o mapa contem o valor 5
        System.out.println(campeoesMundialFifa.containsValue(5));

        //Verifica o tamanho antes e depois de limpar o mapa
        System.out.println(campeoesMundialFifa.size());

        campeoesMundialFifa.clear();

        System.out.println(campeoesMundialFifa.size());

    }
}
