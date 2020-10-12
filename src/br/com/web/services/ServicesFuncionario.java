package br.com.web.services;

import br.com.web.dao.DAOFactory;
import br.com.web.dao.DAOFuncionario;
import br.com.web.model.Funcionario;
import java.sql.SQLException;

/**
 *
 * @author Bruno Gressler da Silveira
 * @version 2
 * @since 12/10/2020
 */
public class ServicesFuncionario {
    
    public void cadastrarFuncionario(Funcionario funcionario) throws SQLException{
        DAOFuncionario daoFuncionario = DAOFactory.getDAOFuncionario();
        daoFuncionario.cadastrarFuncionarios(funcionario);
    }
    
}
