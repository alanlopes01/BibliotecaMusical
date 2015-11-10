

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alan
 */
    import java.sql.*;

public class Conexao {
	
	//Método para Conectar ao Banco de Dados Local chamado 'cadastro', usuário 'root' e senha em branco!
	public static Connection conectar() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/bibliotecamusical", "root", "");
			return(c);
		} catch (ClassNotFoundException e) {
			System.out.println("Problema na configuração do Driver do MySQL!");
		} catch (SQLException e) {
			System.out.println("Problema na conexão com o banco de dados!");
		}
		return(null);
	}
	
	//Retorna o relatório contendo todas as Pessoa do Banco
	
    
}
