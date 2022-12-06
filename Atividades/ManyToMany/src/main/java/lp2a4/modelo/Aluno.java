package lp2a4.modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Aluno
 *
 */
@Entity
public class Aluno implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column
	private String matricula;
	
	@Column(nullable=false)
	private String nome;
	
	@Column
	private String endereco;
	
	@Column
	private String email;
	
	@Column(name="data_ingresso", nullable=false)
	private LocalDate dataIngresso;
	
	@OneToMany(mappedBy = "aluno")
	private List<AlunoDisciplina> alunoDisciplina = new ArrayList<>();

	public Aluno() {}
	
	public String getMatricula() { return matricula; }
	public String getNome() { return nome; }
	public String getEndereco() { return endereco; }
	public String getEmail() { return email; }
	public LocalDate getDataIngresso() { return dataIngresso; }
	public List<AlunoDisciplina> getAlunoDisciplina() { return alunoDisciplina; }
	
	public void setMatricula(String matricula) { this.matricula = matricula; }
	public void setNome(String nome) { this.nome = nome; }
	public void setEndereco(String endereco) { this.endereco = endereco; }
	public void setEmail(String email) { this.email = email; }
	public void setDataIngresso(LocalDate dataIngresso) { this.dataIngresso = dataIngresso; }
	public void setAlunoDisciplina(List<AlunoDisciplina> alunoDisciplina) { this.alunoDisciplina = alunoDisciplina; }

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", endereco=" + endereco + ", email=" + email
				+ ", dataIngresso=" + dataIngresso + "]";
	}
}
