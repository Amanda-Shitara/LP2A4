package lp2a4.modelo;

import java.time.LocalDate;

/**
 * Por se tratar de um CRUD sem regras de neg�cio, o objeto implementado � um simples POJO.
 * 
 * Em outras circunst�ncias pode ser necess�rio utilizam uma classe que possua outros m�todos.
 * 
 * Para entender melhor essa discuss�o poder� procurar por modelo an�mico X modelo rico.
 * 
 * @author diego
 *
 */
public class AlunoPOJO {
	private String matricula;
	private String nome;
	private String endereco;
	private LocalDate dataIngresso;
	private LocalDate dataConclusao;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public LocalDate getDataIngresso() {
		return dataIngresso;
	}
	public void setDataIngresso(LocalDate dataIngresso) {
		this.dataIngresso = dataIngresso;
	}
	public LocalDate getDataConclusao() {
		return dataConclusao;
	}
	public void setDataConclusao(LocalDate dataConclusao) {
		this.dataConclusao = dataConclusao;
	}
}
