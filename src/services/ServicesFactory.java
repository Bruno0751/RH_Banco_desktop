//PROJECT NAME: prjRHBanco
package services;

import view.GUICadastroDeDepartamento;
import view.GUICadastroDeFuncionario;
import view.GUIManutencaoDeDepartamento;
import view.GUIManutencaoFuncionario;
import view.Menu;
/**
 *
 * @author Bruno Gressler da Silveira
 * @version 2.0
 * @since 15/03/2020
 */
public class ServicesFactory {
    
    private static final ServicesFuncionario FUNCIONARIOBO = new ServicesFuncionario();
    //private static final GerenteServicos GERENTEBO = new GerenteServicos();
    private static final ServicesDepartamento DEPARTAMENTOBO = new ServicesDepartamento();

    
    public void desligarSistema(){
        System.exit(0);
    }
    
     public void abrirCadastroDeDepartamento(){
        new GUICadastroDeDepartamento().setVisible(true);
    }
     
    public void abrirCadastroDeFuncionario() {
        new GUICadastroDeFuncionario().setVisible(true);
    }
    
    public void abirMenuPrincipal(){
        new Menu().setVisible(true);
    }
    
    public void abrirManutencaoDepartamento(){
        new GUIManutencaoDeDepartamento().setVisible(true);
    }
    
    public void abrirManutencaoFuncionario(){
        new GUIManutencaoFuncionario().setVisible(true);
    }
    
    public static ServicesFuncionario getFuncionariosServicos(){
        return FUNCIONARIOBO;
    }
    
    //ESTE METODO É APENAS PARA MANUTENCAO DA TABELA
    public static ServicesDepartamento getDepartamentosServicos(){
        return DEPARTAMENTOBO;
    }
    
    //public static GerenteServicos getGerentesServicos(){
    //    return GERENTEBO;
    //}

    
}
