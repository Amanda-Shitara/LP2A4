package lp2a4.app;

import java.util.List;

import javax.persistence.*;

import lp2a4.entities.Veiculo;

public class AplicacaoProblema {
	public static void main(String[] args) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("test");
		EntityManager em = emFactory.createEntityManager();

		List<Veiculo> veiculos = em.createQuery("FROM Veiculo", Veiculo.class).getResultList();
		veiculos.forEach(System.out::println);
	}
}
