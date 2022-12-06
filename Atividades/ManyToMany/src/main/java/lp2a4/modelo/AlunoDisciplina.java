package lp2a4.modelo;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: AlunoDisciplina
 *
 */
@Entity
public class AlunoDisciplina implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private AlunoDisciplinaId id = new AlunoDisciplinaId();
	
	@ManyToOne
	@MapsId("matricula")	
	@JoinColumn(name="matricula")
	private Aluno aluno;
	
	@ManyToOne
	@MapsId("codigo")
	@JoinColumn(name="codigo")
	private Disciplina disciplina;
	
	@Column(name="nota")
	private int nota;

	public AlunoDisciplina() {}

	public AlunoDisciplinaId getId() { return id; }
	public Aluno getAluno() { return aluno; }
	public Disciplina getDisciplina() { return disciplina; }
	public int getNota() { return nota; }

	public void setId(AlunoDisciplinaId id) { this.id = id; }
	public void setAluno(Aluno aluno) { this.aluno = aluno; }
	public void setDisciplina(Disciplina disciplina) { this.disciplina = disciplina; }
	public void setNota(int nota) { this.nota = nota; }

	@Override
	public String toString() {
		return "AlunoDisciplina [id=" + id + ", aluno=" + aluno + ", disciplina=" + disciplina + ", nota=" + nota + "]";
	}
}
