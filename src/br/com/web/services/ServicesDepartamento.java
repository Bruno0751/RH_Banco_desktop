//PROJECT NAME: prjRHBanco
package br.com.web.services;

import br.com.web.dao.DAODepartamento;
import br.com.web.dao.DAOFactory;
import br.com.web.model.Departamento;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Bruno Gressler da Silveira
 * @version 2.0
 * @since 15/03/2020
 */
public class ServicesDepartamento {

    private Departamento objDepartamento;
    private ArrayList<Departamento> listaDeDepartamentos;
    

    public ServicesDepartamento() {
        this.listaDeDepartamentos = new ArrayList<>();
        this.objDepartamento = new Departamento();
    }

    
    /*
    public void selecionandoONumeroDeDepartamentos() throws SQLException {
        DAODepartamento daoDepartamento = DAOFactory.getDAODepartamento();
        daoDepartamento.selecionandoONumeroDeDepartamentos();
    }
    */
 
    public ArrayList<Departamento> buscarDepartamento() throws SQLException {
        DAODepartamento daoDepartamento = DAOFactory.getDAODepartamento();
        return daoDepartamento.buscarDepartamentos();
    }
   
    public void atualizaTabela(DefaultTableModel defaultTableModel, JTable tabela) {
        try {
                
            ServicesDepartamento servicesDepartamento = ServicesFactory.getDepartamentosServicos();
            
            ArrayList<Departamento> listaDepartamentos = new ArrayList<>();
            
            listaDepartamentos = servicesDepartamento.buscarDepartamento();

            for (int i = 0; i < listaDepartamentos.size(); i++) {
                defaultTableModel.addRow(new String[]{
                    String.valueOf(listaDepartamentos.get(i).getIdDepartamento()),
                    String.valueOf(listaDepartamentos.get(i).getNome()),
                    String.valueOf(listaDepartamentos.get(i).getCNPJ())
                   
                });
            }
            
            tabela.setModel(defaultTableModel);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Erro ao Atualizar Tabela " + e.getMessage(),
                        "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        objDepartamento.setIdDepartamento(null);
        
    }
    
    /*
    public void limparTabela(DefaultTableModel defaultTableModel, String id, String nome, String numero){
        defaultTableModel.setNumRows(0);
        id = null;
        nome = null;
        numero = null;
    }
    
    public void cadastrarDepartamento(String id, String nome, int cnpj) {
        try {      
            objDepartamento.setIdDepartamento(id);
            objDepartamento.setNome(nome);
            objDepartamento.setCNPJ(cnpj);
                    
            //setVerificaCNPJ(verificarCNPJ(cnpj));
                      
            //if (getVerificaCNPJ() == null){
            //    JOptionPane.showMessageDialog(null, "CNPJ Inválida", "ERRO", JOptionPane.ERROR_MESSAGE);
            //}else{
            //    ServicesDepartamento servicesDepartamento = br.com.web.services.ServicesFactory.getDepartamentosServicos();
            //    servicesDepartamento.cadastrarDepartamento(objDepartamento);
            //    JOptionPane.showMessageDialog(null, "Departamento Cadastrado");
            //}
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro Ao Cadastrar Departamento " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
*/
    
    public void cadastrarDepartamento(Departamento departamento) throws SQLException{
        DAODepartamento daoDepartamento = DAOFactory.getDAODepartamento();
        daoDepartamento.cadastrarDepartamentos(departamento);
    }
    

    
    public void filtrarDepartamento(String pesquisa, DefaultTableModel defaultTableModel, JTable tabela, JComboBox filtro){
       try {
           if (pesquisa.isEmpty()){
               atualizaTabela(defaultTableModel, tabela);
           } else{
                String pesq = pesquisa;
                String filt = filtro.getSelectedItem().toString();
                String query = "";
                if (filt.equalsIgnoreCase("Identificação")){
                    query = "WHERE id_departamento LIKE '%" + pesq + "%'";                    
                } else if (filt.equalsIgnoreCase("Nome")){
                    query = "WHERE nome LIKE '%" + pesq + "%'";
                } else if (filt.equalsIgnoreCase("cnpj")){
                    query = "WHERE cnpj LIKE '%" + pesq + "%'";
                }
                ServicesDepartamento ServicesDepartamento = ServicesFactory.getDepartamentosServicos();
                ArrayList<Departamento> listaDepartamentos = ServicesDepartamento.filtrarDepartamento(query);
                
                for (int i = 0 ; i < listaDepartamentos.size() ; i ++){
                    defaultTableModel.addRow(new String[]{
                        
                        listaDepartamentos.get(i).getIdDepartamento(),
                        listaDepartamentos.get(i).getNome(),
                        String.valueOf(listaDepartamentos.get(i).getCNPJ()),
                    
                    });
                }
                tabela.setModel(defaultTableModel);
            }
           
        } catch (Exception e) {           
            pesquisa = null;
            JOptionPane.showMessageDialog(null,"Erro ao Filtrar Departamento " + e.getMessage(),
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
    protected ArrayList<Departamento> filtrarDepartamento(String query) throws SQLException {
        DAODepartamento daoDepartamento = DAOFactory.getDAODepartamento();
        return daoDepartamento.filtrarDepartamentos(query);
    }
    
    
    
    public void deletarDepartamento(JTable tabela, String id){
       try {
           int linha = tabela.getSelectedRow();
           if (linha == -1){
               JOptionPane.showMessageDialog(null, "Selecione Uma Linha");
           } else{
               String identification = tabela.getValueAt(linha, 0).toString();
               ServicesDepartamento servicesDepartamento = ServicesFactory.getDepartamentosServicos();
               servicesDepartamento.deletarDepartamento(id);
               
               JOptionPane.showMessageDialog(null, "Departamento Deletado");
           }
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Erro ao Deletar Departamento " + e.getMessage(),
                   "ERRO",
                   JOptionPane.ERROR_MESSAGE);
        }   
        id = null;
        
    }
    
    protected void deletarDepartamento(String id) throws SQLException {
      DAODepartamento daoDepartamento = DAOFactory.getDAODepartamento();
      daoDepartamento.deletarDepartamento(id);
    }
    
    

    public void alterarDepartamentos(Departamento departamento) throws SQLException {
        DAODepartamento daoDepartamento = DAOFactory.getDAODepartamento();
        daoDepartamento.atualizarDepartamentos(departamento);
    }    
    
    
    
    public Departamento verificarCNPJ(int cnpj){
        for(int i = 0;i < this.listaDeDepartamentos.size();i++){
            if(this.listaDeDepartamentos.get(i).getCNPJ() == cnpj){
                return this.listaDeDepartamentos.get(i);
            }
        }
        return null;
    }
}
