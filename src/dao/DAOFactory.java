//PROJECT NAME: prjRHBanco
package dao;
/**
 *
 * @author Bruno Gressler da Silveira
 * @version 2.0
 * @since 15/03/2020
 */
public class DAOFactory {
    
    private static DAOFuncionario daoFuncionario = new DAOFuncionario();
    //private static GerenteDAO gerenteDAO = new GerenteDAO();
    private static DAODepartamento daoDepartamento = new DAODepartamento();
    
    
    public static DAOFuncionario getDAOFuncionario(){
        return daoFuncionario;
    }
    
    //public static GerenteDAO getGerentesDAO(){
    //    return gerenteDAO;
    //}
    
    public static DAODepartamento getDAODepartamento(){
        return daoDepartamento;
    }
}
