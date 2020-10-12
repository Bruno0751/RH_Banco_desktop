//PROJECT NAME: prjRHBanco
package br.com.web.dao;
import br.com.web.model.Departamento;
import br.com.web.persistence.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author Bruno Gressler da Silveira
 * @version 2.0
 * @since 15/03/2020
 */
public class DAODepartamento {
    
    public void atualizarDepartamentos(Departamento departamento) throws SQLException {
        
        Connection connection = Conexao.getConexao();
        
        Statement statement = connection.createStatement();
        try {
            
            String sql;

            sql = "UPDATE departamento SET nome = '" + departamento.getNome() + 
                "', cnpj = '" + departamento.getCNPJ()+ 
                "' WHERE id_departamento = " + departamento.getIdDepartamento();
            
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            throw new SQLException("Erro ao Atualizar Departamentos \n"
                + "Erro de Software no SQL \n\n"
                + "Tipo: " + e.getMessage());
        } finally {
            connection.close();
            statement.close();
        }
    }

    public ArrayList<Departamento> buscarDepartamentos() throws SQLException {
        Connection connection = Conexao.getConexao();
        Statement statement = connection.createStatement();
        try {
            String sql;
          
            sql = "SELECT * FROM departamento";
            
            ResultSet rs = statement.executeQuery(sql);

            
            ArrayList<Departamento> listaDeDepartamentos = new ArrayList<>();

            
            while (rs.next()) {
                
                Departamento departamento = new Departamento();
                
                departamento.setIdDepartamento(rs.getString("id_departamento"));
                departamento.setNome(rs.getString("nome"));
                departamento.setCNPJ(rs.getInt("cnpj"));
                
                listaDeDepartamentos.add(departamento);
            }
            
            return listaDeDepartamentos;
        } catch (SQLException e) {
            throw new SQLException("Erro ao Buscar Departamentos \n"
                + "Erro de Software no SQL \n\n"
                + "Tipo: " + e.getMessage());
        } finally {
            connection.close();
            statement.close();
        }

    }
    
    public void cadastrarDepartamentos(Departamento departamento) throws SQLException {
        Connection connection = Conexao.getConexao();
        Statement statement = connection.createStatement();
        try {
            String sql;
            
            sql = "INSERT INTO departamento(id_departamento, nome, cnpj)"
                + "VALUES ('" + departamento.getIdDepartamento() + "','" + departamento.getNome() + "'," + departamento.getCNPJ()+ ")";
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
    
    public void deletarDepartamento(String id) throws SQLException {
        Connection connection = Conexao.getConexao();
        Statement statement = connection.createStatement();    
        try{
            String sql = "DELETE FROM departamento WHERE id_departamento = " + id;
            statement.execute(sql);
        } catch (Exception e) {
            throw  new SQLException("Erro ao Deletar departamento \n"
                + "Erro de Software no SQL \n\n"
                + "Tipo: " + e.getMessage());
        } finally {
            statement.close();
            connection.close();
        }
    }
    
    public ArrayList<Departamento> filtrarDepartamentos(String query) throws SQLException {
        Connection connection = Conexao.getConexao();
        Statement statement = connection.createStatement();
        try {
            String sql;
                      
            sql = "SELECT * FROM departamento " + query;
            
            ResultSet resultado = statement.executeQuery(sql);
            
            ArrayList<Departamento> listaDeDepartamentos = new ArrayList<>();
            
            while (resultado.next()) {
                
                Departamento departamento = new Departamento();
                
                departamento.setIdDepartamento(resultado.getString("id_departamento"));
                departamento.setNome(resultado.getString("nome"));
                departamento.setCNPJ(resultado.getInt("cnpj"));
                
                listaDeDepartamentos.add(departamento);
            }
            
            return listaDeDepartamentos;
        } catch (SQLException e) {
            throw new SQLException("Erro ao Filtrar Departamentos \n"
                + "Erro de Software no SQL \n\n"
                + "Tipo: " + e.getMessage());
        } finally {
            connection.close();
            statement.close();
        }
        
    }
    
    /*
    public void selecionandoONumeroDeDepartamentos() throws SQLException{
        Connection connection = Conexao.getConexao();
        Statement statement = connection.createStatement();
        //try {
            String sql;
          
            sql = "SELECT SUM(id_departamento) FROM departamento";
            
            ResultSet resultado = statement.executeQuery(sql);
            //ArrayList<Departamento> listaDeDepartamentos = new ArrayList<>();

            
            //while (resultado.next()) {
                
            //    Departamento departamento = new Departamento();
                
            //    departamento.setIdDepartamento(resultado.getString("id_departamento"));
            //    departamento.setNome(resultado.getString("nome"));
            //    departamento.setNumero(resultado.getInt("numero"));
                
            //    listaDeDepartamentos.add(departamento);
            //}
            
            statement.executeQuery(sql);
        //} catch (SQLException e) {
        //    throw new SQLException("Erro ao Somar Departamentos \n"
        //        + "Erro de Software no SQL \n\n"
        //        + "Tipo: " + e.getMessage());
        //} finally {
            //connection.close();
            //statement.close();
        //}
    }
    /*SELECT SUM(id_departamento)
    FOM departamento;*/
    
}
