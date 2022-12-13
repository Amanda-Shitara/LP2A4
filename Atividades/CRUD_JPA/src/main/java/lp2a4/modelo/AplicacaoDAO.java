package lp2a4.modelo;

import java.util.List;

import javax.persistence.*;

public class AplicacaoDAO {
	private static AplicacaoDAO instance;
	protected EntityManager em;
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("test");

	public static AplicacaoDAO getInstance(){
		if (instance == null){
			instance = new AplicacaoDAO();
		}
		return instance;
	}

	private AplicacaoDAO() {
		em = getEntityManager();
	}

	private EntityManager getEntityManager() {
		if (em == null) {
			em = emfactory.createEntityManager();
		}
		return em;
	}
	
	public Funcionario getById(final int id) {
		return em.find(Funcionario.class, id);
	}

	public List<Funcionario> findAll() {
		return em.createQuery("FROM Funcionario", Funcionario.class).getResultList();
	}

	public void persist(Funcionario funcionario) {
		try {
			em.getTransaction().begin();
			em.persist(funcionario);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			em.getTransaction().rollback();
		}
	}

	public void merge(Funcionario funcionario) {
		try {
			em.getTransaction().begin();
			em.merge(funcionario);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			em.getTransaction().rollback();
		}
	}

	public void remove(Funcionario funcionario) {
		try {
			em.getTransaction().begin();
			em.remove(funcionario);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			em.getTransaction().rollback();
		}
	}
	
	public void closeMethods() {
		em.close();
		emfactory.close();
	}
}
