package br.com.web.dao;

import br.com.web.model.Funcionario;
import br.com.web.persistence.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Bruno Gressler da Silveira
 * @version 2
 * @since 12/10/2020
 */
public class DAOFuncionario {
    
    public void cadastrarFuncionarios(Funcionario funcionario) throws SQLException {
        Connection connection = Conexao.getConexao();
        Statement statement = connection.createStatement();
        try {
            String sql;
            
            sql = "INSERT INTO funcionario(id_funcionario, nome, cpf, gerente)"
                + "VALUES ('" + funcionario.getS_idFuncionario() + "','" + funcionario.getS_nome() + "','" + funcionario.getS_cpf()+ "','" + funcionario.getS_idGerente() + "')";
            statement.execute(sql);
        } catch (SQLException e) {
            throw  new SQLException("Erro de Software no SQL \n\n"
                    + "ID Inválida \n\n"
                + "Tipo: " + e.getMessage());
        } finally {
            connection.close();
            statement.close();
        }
    }
}
