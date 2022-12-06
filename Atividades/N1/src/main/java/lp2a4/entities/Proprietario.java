package lp2a4.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "proprietario")
public class Proprietario implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column 
	private int id;
	
	@Column 
	private String nome;
	
	@Column 
	private String email;
	
	public Proprietario() {}
	
	public int getId() { return id; }
	public String getNome() { return nome; }
	public String getEmail() { return email; }
	
	public void setId(int id) { this.id = id; }
	public void setNome(String nome) { this.nome = nome; }
	public void setEmail(String email) { this.email = email; }

	@Override
	public String toString() {
		return "Proprietario [id=" + id + ", nome=" + nome + ", email=" + email + "]";
	}
}
