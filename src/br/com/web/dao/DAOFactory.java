//PROJECT NAME: prjRHBanco
package br.com.web.dao;
/**
 *
 * @author Bruno Gressler da Silveira
 * @version 2.0
 * @since 15/03/2020
 */
public class DAOFactory {
    
    //private static DAOEmpregado daoEmpregado = new DAOEmpregado();
    //private static GerenteDAO gerenteDAO = new GerenteDAO();
    private static DAODepartamento daoDepartamento = new DAODepartamento();
    
    
    //public static DAOEmpregado getDAOEmpregados(){
    //    return daoEmpregado;
    //}
    
    //public static GerenteDAO getGerentesDAO(){
    //    return gerenteDAO;
    //}
    
    public static DAODepartamento getDAODepartamento(){
        return daoDepartamento;
    }
}
