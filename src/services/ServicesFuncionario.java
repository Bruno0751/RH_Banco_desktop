package services;

import dao.DAOFactory;
import dao.DAOFuncionario;
import model.Funcionario;
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
 * @version 2
 * @since 12/10/2020
 */
public class ServicesFuncionario {
    
    private Funcionario objFuncionario;
    private ArrayList<Funcionario> listaDEFuncionarios;

    public ServicesFuncionario() {
        this.objFuncionario = objFuncionario;
        this.listaDEFuncionarios = new ArrayList<>();
    }

    private void cadastrandoFuncionario(Funcionario funcionario) throws SQLException{
        DAOFuncionario daoFuncionario = DAOFactory.getDAOFuncionario();
        daoFuncionario.cadastrarFuncionarios(funcionario);
    }
    
    private ArrayList<Funcionario> filtrandoFuncionario(String query) throws SQLException {
        DAOFuncionario daoFuncionario = DAOFactory.getDAOFuncionario();
        return daoFuncionario.filtrarFuncionarios(query);
    }
    
    
    
    
    public void cadastrarFuncionario(JTextField id, JTextField nome, JTextField cpf, JTextField fk){
        try {      
            objFuncionario.setS_idFuncionario(id.getText());
            objFuncionario.setS_nome(nome.getText());
            objFuncionario.setS_cpf(cpf.getText());
            objFuncionario.setS_idDepartamento(fk.getText());

            cadastrandoFuncionario(objFuncionario);
            
            JOptionPane.showMessageDialog(null,"Funcionario Cadastrada");
           
            id.setText(null);
            nome.setText(null);
            cpf.setText(null);
            fk.setText(null);
            id.grabFocus();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro Ao Cadastrar Funcionario "
                    + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            
            id.setText(null);
            nome.setText(null);
            cpf.setText(null);
            fk.setText(null);
            id.grabFocus();
        }
    }

    public void atualizaTabela(DefaultTableModel defaultTableModel, JTable tabela) {
        try {
                
            ServicesFuncionario servicesFuncionario = ServicesFactory.getFuncionariosServicos();
            
            ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
            
            listaFuncionarios = servicesFuncionario.buscarFuncionario();

            for (int i = 0; i < listaFuncionarios.size(); i++) {
                defaultTableModel.addRow(new String[]{
                    listaFuncionarios.get(i).getS_idFuncionario(),
                    listaFuncionarios.get(i).getS_nome(),
                    listaFuncionarios.get(i).getS_cpf(),
                    listaFuncionarios.get(i).getS_idDepartamento()
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
        objFuncionario.setS_idFuncionario(null);
        
    }
    
    public ArrayList<Funcionario> buscarFuncionario() throws SQLException {
        DAOFuncionario daoFuncionario = DAOFactory.getDAOFuncionario();
        return daoFuncionario.buscarFuncionarios();
    }
    
    public void filtrarFuncionario(String pesquisa, DefaultTableModel defaultTableModel, JTable tabela, JComboBox filtro){
       try {
           if (pesquisa.isEmpty()){
               atualizaTabela(defaultTableModel, tabela);
           } else{
                String pesq = pesquisa;
                String filt = filtro.getSelectedItem().toString();
                String query = "";
                if (filt.equalsIgnoreCase("Identificacao")){
                    query = "WHERE id_funcionario LIKE '%" + pesq + "%'";                    
                } else if (filt.equalsIgnoreCase("Nome")){
                    query = "WHERE nome LIKE '%" + pesq + "%'";
                } else if (filt.equalsIgnoreCase("cpf")){
                    query = "WHERE cpf LIKE '%" + pesq + "%'";
                }else if (filt.equalsIgnoreCase("Cod_departamento")){
                    query = "WHERE cod_departamento LIKE '%" + pesq + "%'";
                }
                ServicesFuncionario ServicesFuncionario = ServicesFactory.getFuncionariosServicos();
                ArrayList<Funcionario> listaFuncionarios = ServicesFuncionario.filtrandoFuncionario(query);
                
                for (int i = 0 ; i < listaFuncionarios.size() ; i ++){
                    defaultTableModel.addRow(new String[]{
                        
                        listaFuncionarios.get(i).getS_idFuncionario(),
                        listaFuncionarios.get(i).getS_nome(),
                        listaFuncionarios.get(i).getS_cpf(),
                        listaFuncionarios.get(i).getS_idDepartamento(),
                    
                    });
                }
                tabela.setModel(defaultTableModel);
            }
           
        } catch (Exception e) {           
            pesquisa = null;
            JOptionPane.showMessageDialog(null,"Erro ao Filtrar Funcionario " + e.getMessage(),
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
    private void deletandoFuncionario(String id) throws SQLException {
      DAOFuncionario daoFuncionario = DAOFactory.getDAOFuncionario();
      daoFuncionario.deletarFuncionario(id);
    }
    
    public void alterarDepartamentos(Funcionario funcionario) throws SQLException {
        DAOFuncionario daoFuncionario = DAOFactory.getDAOFuncionario();
        daoFuncionario.atualizarFuncionarios(funcionario);
    } 
    
    public Funcionario verificarCNPJ(String cpf){
        for(int i = 0;i < this.listaDEFuncionarios.size();i++){
            if(this.listaDEFuncionarios.get(i).getS_cpf().equals(cpf)){
                return this.listaDEFuncionarios.get(i);
            }
        }
        return null;
    }
}
