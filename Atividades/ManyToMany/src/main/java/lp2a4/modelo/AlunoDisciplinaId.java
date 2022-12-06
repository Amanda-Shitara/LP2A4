package lp2a4.modelo;

import java.io.Serializable;

import javax.persistence.*;

@Embeddable
public class AlunoDisciplinaId implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "matricula")
	private String matricula;

    @Column(name = "codigo")
    private String codigo;

	public AlunoDisciplinaId() {}

	public String getMatricula() { return matricula; }
	public String getCodigo() { return codigo; }

	public void setMatricula(String matricula) { this.matricula = matricula; }
	public void setCodigo(String codigo) { this.codigo = codigo; }
}
