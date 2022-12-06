package lp2a4.dao;

import java.util.List;

import javax.persistence.*;

import lp2a4.modelo.Aluno;
import lp2a4.modelo.AlunoDisciplina;
import lp2a4.modelo.Disciplina;

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

	public Aluno getByMatricula(String id) {
		return em.find(Aluno.class, id);
	}
	
	public Disciplina getByCodigo(String id) {
		return em.find(Disciplina.class, id);
	}
	
	public AlunoDisciplina getById(final int id) {
		return em.find(AlunoDisciplina.class, id);
	}

	public List<AlunoDisciplina> findAll() {
		return em.createQuery("FROM AlunoDisciplina", AlunoDisciplina.class).getResultList();
	}

	public void persist(Object entity) {
		try {
			em.getTransaction().begin();
			em.persist(entity);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			em.getTransaction().rollback();
		}
	}

	public void merge(Object entity) {
		try {
			em.getTransaction().begin();
			em.merge(entity);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			em.getTransaction().rollback();
		}
	}

	public void remove(Object entity) {
		try {
			em.getTransaction().begin();
			em.remove(entity);
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
