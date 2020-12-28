//PROJECT NAME: prjRHBanco
package services;

import dao.DAODepartamento;
import dao.DAOFactory;
import java.awt.HeadlessException;
import model.Departamento;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Bruno Gressler da Silveira
 * @version 2.0
 * @since 15/03/2020
 */
public class ServicesDepartamento {

    private final Departamento objDepartamento;
    private final ArrayList<Departamento> listaDeDepartamentos;
    

    public ServicesDepartamento() {
        this.listaDeDepartamentos = new ArrayList<>();
        this.objDepartamento = new Departamento();
    }

    private void cadastrandoDepartamento(Departamento departamento) throws SQLException{
        DAODepartamento daoDepartamento = DAOFactory.getDAODepartamento();
        daoDepartamento.cadastrarDepartamentos(departamento);
    }
    
    private ArrayList<Departamento> filtrandoDepartamento(String query) throws SQLException {
        DAODepartamento daoDepartamento = DAOFactory.getDAODepartamento();
        return daoDepartamento.filtrarDepartamentos(query);
    }
    
    private void deletandoDepartamento(String id) throws SQLException {
      DAODepartamento daoDepartamento = DAOFactory.getDAODepartamento();
      daoDepartamento.deletarDepartamento(id);
    }
    
    private ArrayList<Departamento> buscandoDepartamento() throws SQLException {
        DAODepartamento daoDepartamento = DAOFactory.getDAODepartamento();
        return daoDepartamento.buscarDepartamentos();
    }
    
    
    public void cadastrarDepartamento(JTextField id, JTextField nome, JTextField cnpj){
        try {      
            objDepartamento.setIdDepartamento(id.getText());
            objDepartamento.setNome(nome.getText());
            objDepartamento.setCNPJ(Integer.parseInt(cnpj.getText()));
                      
            //if (verificarCNPJ(objDepartamento.getCNPJ()) != null){
            //    JOptionPane.showMessageDialog(null, "CNPJ Inválida", "ERRO", JOptionPane.ERROR_MESSAGE);
            //    cnpj.setText(null);
            //    cnpj.grabFocus();
            //}
            //else if(verificarCNPJ(objDepartamento.getCNPJ()) == null){
                ServicesDepartamento servicesDepartamento = services.ServicesFactory.getDepartamentosServicos();
                cadastrandoDepartamento(objDepartamento);
                JOptionPane.showMessageDialog(null, "Departamento Cadastrado");
                
                cadastrandoDepartamento(objDepartamento);
            
                JOptionPane.showMessageDialog(null,"Departamento Cadastrada");
                id.setText(null);
                nome.setText(null);
                cnpj.setText(null);
                id.grabFocus();
            //}
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro Ao Cadastrar Departamento "
                    + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            
            id.setText(null);
            nome.setText(null);
            cnpj.setText(null);
            id.grabFocus();
        }  
    }
   
    public void atualizandoTabela(DefaultTableModel defaultTableModel, JTable tabela) {
        try {
                
            ServicesDepartamento servicesDepartamento = ServicesFactory.getDepartamentosServicos();
            
            ArrayList<Departamento> listaDepartamentos = new ArrayList<>();
            
            listaDepartamentos = servicesDepartamento.buscandoDepartamento();

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

    public void filtrarDepartamento(String pesquisa, DefaultTableModel defaultTableModel, JTable tabela, JComboBox filtro){
       try {
           if (pesquisa.isEmpty()){
               atualizandoTabela(defaultTableModel, tabela);
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
                ArrayList<Departamento> listaDepartamentos = ServicesDepartamento.filtrandoDepartamento(query);
                
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

    public void deletarDepartamento(JTable tabela, String id){
       try {
           int linha = tabela.getSelectedRow();
           if (linha == -1){
               JOptionPane.showMessageDialog(null, "Selecione Uma Linha");
           } else{
               String identification = tabela.getValueAt(linha, 0).toString();
               ServicesDepartamento servicesDepartamento = ServicesFactory.getDepartamentosServicos();
               deletandoDepartamento(id);
               
               JOptionPane.showMessageDialog(null, "Departamento Deletado");
           }
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Erro ao Deletar Departamento " + e.getMessage(),
                   "ERRO",
                   JOptionPane.ERROR_MESSAGE);
        }   
        id = null;
        
    }    
    
    public void alterarDepartamento(Departamento departamento) throws SQLException {
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
