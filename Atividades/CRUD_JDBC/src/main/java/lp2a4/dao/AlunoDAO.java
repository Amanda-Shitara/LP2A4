package lp2a4.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import lp2a4.bean.Aluno;

public class AlunoDAO {

	public static Connection getConnection(){  
		Connection conn = null;  
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lp2a4_crud_jsp", "estudante", "estudante");
		} catch(Exception e) {
			System.out.println(e);
		}
		return conn;
	}
	
	public static int save(Aluno a){
		int status = 0;
		try {
			Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement("insert into Aluno(nome, sobrenome, endereco, cidade) values(?,?,?,?)");  
			ps.setString(1, a.getNome());
			ps.setString(2, a.getSobrenome());
			ps.setString(3, a.getEndereco());
			ps.setString(4, a.getCidade());
			status = ps.executeUpdate();
		} catch(Exception e) {
			System.out.println(e);
		}
		return status;  
	}

	public static int update(Aluno a){
		int status = 0;
		try {
			Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement(
					"update Aluno set nome=?, sobrenome=?, endereco=?, cidade=? where id=?");
			ps.setString(1, a.getNome());
			ps.setString(2, a.getSobrenome());
			ps.setString(3, a.getEndereco());
			ps.setString(4, a.getCidade());
			ps.setInt(5, a.getId());
			status = ps.executeUpdate();
		} catch(Exception e) {
			System.out.println(e);
		}
		return status;
	}

	public static int delete(Aluno a){
		int status = 0;  
		try {
			Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement("delete from Aluno where id=?");
			ps.setInt(1, a.getId());
			status = ps.executeUpdate();
		} catch(Exception e) {
			System.out.println(e);
		}
		return status;
	}

	public static List<Aluno> getAllRecords(){  
		List<Aluno> list = new ArrayList<Aluno>();
		try {  
			Connection conn = getConnection();  
			PreparedStatement ps = conn.prepareStatement("select * from Aluno");  
			ResultSet rs = ps.executeQuery();  
			while(rs.next()) {  
				Aluno a = new Aluno();  
				a.setId(rs.getInt("id"));
				a.setNome(rs.getString("nome"));
				a.setSobrenome(rs.getString("sobrenome"));
				a.setEndereco(rs.getString("endereco"));
				a.setCidade(rs.getString("cidade"));
				list.add(a);  
			}
		} catch(Exception e) {
			System.out.println(e);
		}
		return list;
	}

	public static Aluno getRecordById(int id){
		Aluno a = null;
		try {
			Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from Aluno where id=?");
			ps.setInt(1,id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				a = new Aluno();
				a.setId(rs.getInt("id"));
				a.setNome(rs.getString("nome"));
				a.setSobrenome(rs.getString("sobrenome"));
				a.setEndereco(rs.getString("endereco"));
				a.setCidade(rs.getString("cidade"));
			}
		} catch(Exception e) {
			System.out.println(e);
		}
		return a;
	}
}
