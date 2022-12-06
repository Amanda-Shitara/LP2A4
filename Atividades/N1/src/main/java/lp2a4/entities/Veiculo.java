package lp2a4.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "veiculo")
public class Veiculo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column 
	private int id;
	
	@Column 
	private String fabricante;
	
	@Column 
	private String modelo;
	
	@ManyToOne
	@JoinColumn(name = "proprietario_id")
	private Proprietario proprietario;
	
	public Veiculo() {}

	public int getId() { return id; }
	public String getFabricante() { return fabricante; }
	public String getModelo() { return modelo; }
	public Proprietario getProprietario() { return proprietario; }

	public void setId(int id) { this.id = id; }
	public void setFabricante(String fabricante) { this.fabricante = fabricante; }
	public void setModelo(String modelo) { this.modelo = modelo; }
	public void setProprietario(Proprietario proprietario) { this.proprietario = proprietario; }

	@Override
	public String toString() {
		return "Veiculo [id=" + id + ", fabricante=" + fabricante + ", modelo=" + modelo + ", proprietario=" + proprietario + "]";
	}
}
