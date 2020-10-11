//PROJECT NAME: prjRHBanco
package br.com.web.persistence;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Bruno Gressler da Silveira
 * @version 2.0
 * @since 15/03/2020
 */
public class Conexao {
    
    private static final String URL = "jdbc:mysql://localhost:3306/bdprjrh";
    private static final String USUARIO = "root";
    private static final String SENHA = "";
        
    public static Connection getConexao() throws SQLException{
       Connection c = null; 
        try {
            c = DriverManager.getConnection(URL,USUARIO,SENHA);
        } catch (SQLException e) {
            throw new SQLException("Erro Ao Conectar" + e.getMessage());
        }
        return c;    
    }    
}
