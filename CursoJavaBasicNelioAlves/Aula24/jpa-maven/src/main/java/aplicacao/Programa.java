package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Jessica da Silva", "jessica@gmail.com");
		Pessoa p3 = new Pessoa(null, "Janailson da Silva", "janailson@gmail.com");
		
		//Conexão com o banco
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		
		//Gerenciamento do banco
		EntityManager em = emf.createEntityManager();
		
		//Inicia transação no banco de dados
		em.getTransaction().begin();
		
		//Pega o objeto e salva no banco
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		
		//Confirma as transações que eu fiz
		em.getTransaction().commit();
				
		System.out.println("Pronto!");
	}

}
