package lp2a4.modelo;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Funcionario
 *
 */
@Entity
@Table(name="funcionario")
public class Funcionario implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column
	private int id;
	
	@Column
	private String nome;
	
	@Column
	private String endereco;
	
	@Column
	private double salario;
	
	public Funcionario() {}
	
	public Funcionario(int id, String nome, String endereco, double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.salario = salario;
	}

	public int getId() { return id; }
	public String getNome() { return nome; }
	public String getEndereco() { return endereco; }
	public double getSalario() { return salario; }
	
	public void setId(int id) { this.id = id; }
	public void setNome(String nome) { this.nome = nome; }
	public void setEndereco(String endereco) { this.endereco = endereco; }
	public void setSalario(double salario) { this.salario = salario; }

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", salario=" + salario + "]";
	}
}
