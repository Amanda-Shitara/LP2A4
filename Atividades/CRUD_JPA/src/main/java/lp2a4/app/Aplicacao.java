package lp2a4.app;

import java.util.List;

import lp2a4.dao.AplicacaoDAO;
import lp2a4.modelo.Funcionario;

public class Aplicacao {
	public static void main(String[] args) {
		AplicacaoDAO dao = AplicacaoDAO.getInstance();
		
		// Visualização de todos os registros
		List<Funcionario> registros = dao.findAll();
		registros.forEach(System.out::println);
		
		// Criação de Funcionario
		Funcionario f1 = new Funcionario(10, "Ada Castro", "Rua Augusto de Oliveira, 867, Santo Antônio, Vitória, ES", 4500.00);
		Funcionario f2 = new Funcionario(11, "Daniel de Santos", "Rua Projetada A, 522, Campo Grande, Rio de Janeiro, RJ", 5500.00);
		Funcionario f3 = new Funcionario(14, "Marcelo Brito", "Rua Copacabana, 877, Jardim Guanabara, Presidente Prudente, SP", 8000.00);
		dao.persist(f1);
		dao.persist(f2);
		dao.persist(f3);
		
		System.out.println("Funcionários gravados:\n" + dao.getById(10) + "\n" + dao.getById(11) + "\n" + dao.getById(14));
		
		// Atualização do Funcionario
		Funcionario funcionarioFound = dao.getById(10);
		funcionarioFound.setNome("Ada Castro Correia");
		funcionarioFound.setSalario(5000.00);
		dao.persist(funcionarioFound);
		
		System.out.println("Funcionário atualizado: " + dao.getById(10));
		
		// Remoção do Funcionario
		Funcionario funcionarioDeleted = new Funcionario();
		funcionarioDeleted.setId(11);
		
		Funcionario funcionarioDeleteAttached = dao.getById(funcionarioDeleted.getId());
		dao.remove(funcionarioDeleteAttached);
				
		System.out.println("Funcionário removido [id=" + funcionarioDeleted.getId() + "]");
		
		// Visualização de todos os registros (Após adição)
		System.out.println("Todos os registros:");
		registros = dao.findAll();
		registros.forEach(System.out::println);
		
		dao.closeMethods();
	}
}
