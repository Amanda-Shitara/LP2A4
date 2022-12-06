package lp2a4.app;

import java.time.LocalDate;
import java.util.List;

import lp2a4.dao.AplicacaoDAO;
import lp2a4.modelo.Aluno;
import lp2a4.modelo.AlunoDisciplina;
import lp2a4.modelo.Disciplina;

public class Aplicacao {
	public static void main(String[] args) {
		AplicacaoDAO dao = AplicacaoDAO.getInstance();
		
		// Visualização de todos os registros
		List<AlunoDisciplina> registros = dao.findAll();
		registros.forEach(System.out::println);
		
		// Criação de um Aluno
		Aluno aluno = new Aluno();
		aluno.setMatricula("SP12345");
		aluno.setNome("Ada Lovelace");
		aluno.setEndereco("Rua Pedro Vicente, 15, Canindé, São Paulo, SP");
		aluno.setEmail("ada@ifsp.edu.br");
		aluno.setDataIngresso(LocalDate.of(2022, 01, 01));
		dao.merge(aluno);
		
		Aluno alunoFound = dao.getByMatricula("SP12345");
		System.out.println("Aluno gravado: " + alunoFound);
		
		// Atualização do Aluno
		alunoFound.setEmail("ada.lovelace@ifsp.edu.br");
		
		dao.persist(alunoFound);
		
		Aluno alunoUpdated = dao.getByMatricula("SP12345");
		System.out.println("Aluno atualizado: " + alunoUpdated);
		
		// Criação de uma Disciplina
		Disciplina disciplina = new Disciplina();
		disciplina.setCodigo("SEGA4");
		disciplina.setNome("Segurança da Informação");
		dao.merge(disciplina);
		
		Disciplina disciplinaFound = dao.getByCodigo("SEGA4");
		System.out.println("Disciplina gravada: " + disciplinaFound);
		
		// Adição de notas na tabela AlunoDisciplina
		AlunoDisciplina nota1 = new AlunoDisciplina();
		nota1.setAluno(aluno);
		nota1.setDisciplina(disciplina);
		nota1.setNota(9);
		dao.merge(nota1);
		
		AlunoDisciplina nota2 = new AlunoDisciplina();
		nota2.setAluno(aluno);
		nota2.setDisciplina(dao.getByCodigo("LP2A4"));
		nota2.setNota(7);
		dao.merge(nota2);
		
		// Visualização de todos os registros (Após adição)
		registros = dao.findAll();
		registros.forEach(System.out::println);
		
		dao.closeMethods();
	}
}
