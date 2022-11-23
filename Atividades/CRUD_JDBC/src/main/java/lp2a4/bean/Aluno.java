package lp2a4.bean;

public class Aluno {
	private int id;  
	private String nome, sobrenome, endereco, cidade;
	
	public int getId() { return id; }
	public String getNome() { return nome; }
	public String getSobrenome() { return sobrenome; }
	public String getEndereco() { return endereco; }
	public String getCidade() { return cidade; }
	
	public void setId(int id) { this.id = id; }
	public void setNome(String nome) { this.nome = nome; }
	public void setSobrenome(String sobrenome) { this.sobrenome = sobrenome; }
	public void setEndereco(String endereco) { this.endereco = endereco; }
	public void setCidade(String cidade) { this.cidade = cidade; }
}
