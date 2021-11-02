package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		// Conexão com o banco
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");

		// Gerenciamento do banco
		EntityManager em = emf.createEntityManager();

		// Incluindo pessoas no cadastro BD
		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Jessica da Silva", "jessica@gmail.com");
		Pessoa p3 = new Pessoa(null, "Janailson da Silva", "janailson@gmail.com");

		// Inicia transação no banco de dados
		em.getTransaction().begin();

		// Pega o objeto e salva no banco
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);

		// Confirma as transações que eu fiz
		em.getTransaction().commit();

		System.out.println("Pronto!");

		// Buscando um cadastro
		Pessoa persona = em.find(Pessoa.class, 2);
		System.out.println(persona);
		System.out.println("Pronto!");
		

		// Para deletar um cadastro
		Pessoa persona2 = em.find(Pessoa.class, 2);
		// Inicia transação no banco de dados
		em.getTransaction().begin();
		em.remove(persona2);
		// Inicia transação no banco de dados
		em.getTransaction().begin();
		System.out.println("Deletado!");

	}

}
