//PROJECT NAME: prjRHBanco
package br.com.web.services;
import br.com.web.view.GUICadastroDeDepartamento;
import br.com.web.view.GUIManutencaoDeDepartamento;
import br.com.web.view.Menu;
/**
 *
 * @author Bruno Gressler da Silveira
 * @version 2.0
 * @since 15/03/2020
 */
public class ServicesFactory {
    
    //private static final EmpregadoServicos EMPREGADOBO = new EmpregadoServicos();
    //private static final GerenteServicos GERENTEBO = new GerenteServicos();
    private static final ServicesDepartamento DEPARTAMENTOBO = new ServicesDepartamento();

    public void abrirDCadastroDeDepartamento(){
        new GUICadastroDeDepartamento().setVisible(true);
    }
    
    public void desligarSistema(){
        System.exit(0);
    }
    
     public void abrirCadastroDeDepartamento(){
        new GUICadastroDeDepartamento().setVisible(true);
    }
     
    public void abirMenuPrincipal(){
        new Menu().setVisible(true);
    }
    
    public void abrirManutencaoDeDepartamento(){
        new GUIManutencaoDeDepartamento().setVisible(true);
    }
    
    //public static EmpregadoServicos getEmpregadosServicos(){
    //    return EMPREGADOBO;
    //}
    
    public static ServicesDepartamento getDepartamentosServicos(){
        return DEPARTAMENTOBO;
    }
    
    //public static GerenteServicos getGerentesServicos(){
    //    return GERENTEBO;
    //}
}
