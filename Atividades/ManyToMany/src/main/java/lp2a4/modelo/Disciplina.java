package lp2a4.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Disciplina
 *
 */
@Entity
public class Disciplina implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column
	private String codigo;
	
	@Column(nullable=false)
	private String nome;
	
	@OneToMany(mappedBy = "disciplina")
	private List<AlunoDisciplina> alunoDisciplina = new ArrayList<>();

	public Disciplina() {}

	public String getCodigo() { return codigo; }
	public String getNome() { return nome; }
	public List<AlunoDisciplina> getAlunoDisciplina() { return alunoDisciplina; }

	public void setCodigo(String codigo) { this.codigo = codigo; }
	public void setNome(String nome) { this.nome = nome; }
	public void setAlunoDisciplina(List<AlunoDisciplina> alunoDisciplina) { this.alunoDisciplina = alunoDisciplina; }

	@Override
	public String toString() {
		return "Disciplina [codigo=" + codigo + ", nome=" + nome + "]";
	}
}
