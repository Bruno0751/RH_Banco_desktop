package dao;

import model.Funcionario;
import persistence.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author Bruno Gressler da Silveira
 * @version 2
 * @since 12/10/2020
 */
public class DAOFuncionario {
    
    public void atualizarFuncionarios(Funcionario funcionario) throws SQLException {
        
        Connection connection = Conexao.getConexao();
        
        Statement statement = connection.createStatement();
        try {
            
            String sql;

            sql = "UPDATE funcionario SET nome = '" + funcionario.getS_nome()+ 
                "', cpf = '" + funcionario.getS_cpf() + 
                "', cod_departamento = '" + funcionario.getS_idDepartamento() +
                "' WHERE id_funcionario = " + funcionario.getS_idFuncionario();
            
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao Atualizar Funcionarios \n"
                + "Erro de Software no SQL \n\n"
                + "Tipo: " + e.getMessage());
        } finally {
            connection.close();
            statement.close();
        }
    }
    
    public ArrayList<Funcionario> buscarFuncionarios() throws SQLException {
        Connection connection = Conexao.getConexao();
        Statement statement = connection.createStatement();
        try {
            String sql;
          
            sql = "SELECT * FROM funcionario";
            
            ResultSet rs = statement.executeQuery(sql);

            
            ArrayList<Funcionario> listaDeFuncionarios = new ArrayList<>();

            
            while (rs.next()) {
                
                Funcionario funcionario = new Funcionario();
                
                funcionario.setS_idFuncionario(rs.getString("id_departamento"));
                funcionario.setS_nome(rs.getString("nome"));
                funcionario.setS_cpf(rs.getString("cnpj"));
                funcionario.setS_idDepartamento(rs.getString("cod_departamento"));
                
                listaDeFuncionarios.add(funcionario);
            }
            
            return listaDeFuncionarios;
        } catch (SQLException e) {
            throw new SQLException("Erro ao Buscar Funcionario \n"
                + "Erro de Software no SQL \n\n"
                + "Tipo: " + e.getMessage());
        } finally {
            connection.close();
            statement.close();
        }
    }
    
    public void deletarFuncionario(String id) throws SQLException {
        Connection connection = Conexao.getConexao();
        Statement statement = connection.createStatement();    
        try{
            String sql = "DELETE FROM funcionario WHERE id_funcionario = " + id;
            statement.execute(sql);
        } catch (Exception e) {
            throw  new SQLException("Erro ao Deletar funcionario \n"
                + "Erro de Software no SQL \n\n"
                + "Tipo: " + e.getMessage());
        } finally {
            statement.close();
            connection.close();
        }
    }
    
    public ArrayList<Funcionario> filtrarFuncionarios(String query) throws SQLException {
        Connection connection = Conexao.getConexao();
        Statement statement = connection.createStatement();
        try {
            String sql;
                      
            sql = "SELECT * FROM funcionario " + query;
            
            ResultSet resultado = statement.executeQuery(sql);
            
            ArrayList<Funcionario> listaDeFuncionarios = new ArrayList<>();
            
            while (resultado.next()) {
                
                Funcionario funcionario = new Funcionario();
                
                funcionario.setS_idFuncionario(resultado.getString("id_funcionario"));
                funcionario.setS_nome(resultado.getString("nome"));
                funcionario.setS_cpf(resultado.getString("cpf"));
                funcionario.setS_idDepartamento(resultado.getString("cod_departamento"));
                
                listaDeFuncionarios.add(funcionario);
            }
            
            return listaDeFuncionarios;
        } catch (SQLException e) {
            throw new SQLException("Erro ao Filtrar Funcionarios \n"
                + "Erro de Software no SQL \n\n"
                + "Tipo: " + e.getMessage());
        } finally {
            connection.close();
            statement.close();
        }
        
    }
    
    public void cadastrarFuncionarios(Funcionario funcionario) throws SQLException {
        Connection connection = Conexao.getConexao();
        Statement statement = connection.createStatement();
        try {
            String sql;
            
            sql = "INSERT INTO funcionario(id_funcionario, nome, cpf, cod_departamento)"
                + "VALUES ('" + funcionario.getS_idFuncionario() + "','" + funcionario.getS_nome() + "','" + funcionario.getS_cpf()+ "','" + funcionario.getS_idDepartamento()+ "')";
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
