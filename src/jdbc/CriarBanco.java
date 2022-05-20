package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

	public static void main(String[] args) throws SQLException {

		final String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSl=true";
		final String usuario = "root";
		final String senha = "@Sa45781256";

		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		System.out.println("Conexão estabelecida com sucesso!");
		
		Statement stmt = conexao.createStatement();
		// CRIANDO O BANCO DE DADOS
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");
		
		System.out.println("Banco criado com sucesso!");
		conexao.close();
	}
}
