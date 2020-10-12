//PROJECT NAME: prjRHBanco
package br.com.web.view;
import br.com.web.model.Departamento;
import br.com.web.services.ServicesDepartamento;
import br.com.web.services.ServicesFactory;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Bruno Gressler da Silveira
 * @version 2.0
 * @since 09/01/2020
 */
public class GUIManutencaoDeDepartamento extends javax.swing.JFrame {

    DefaultTableModel defaultTableModel = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"identificacao", "nome", "cnpj"});
    
    ServicesDepartamento servicesDepartamento= new ServicesDepartamento();
    ServicesFactory servicesFactory = new ServicesFactory();
    Departamento objDepartamento = new Departamento();
    
    public GUIManutencaoDeDepartamento() {
        initComponents();
        //atualizaTabela();
        servicesDepartamento.atualizaTabela(this.defaultTableModel, this.jTableDepartamento);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDepartamento = new javax.swing.JTable();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jComboBoxFiltro = new javax.swing.JComboBox<>();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jTextFieldIDDepartamento = new javax.swing.JTextField();
        jTextFieldNomeDepartamento = new javax.swing.JTextField();
        jTextFieldNumeroDepartamento = new javax.swing.JTextField();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jButtonDesligar = new javax.swing.JButton();
        jButtonLimparAlteração = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableDepartamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificação", "nome", "cnpj"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableDepartamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDepartamentoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableDepartamento);
        if (jTableDepartamento.getColumnModel().getColumnCount() > 0) {
            jTableDepartamento.getColumnModel().getColumn(0).setResizable(false);
            jTableDepartamento.getColumnModel().getColumn(1).setResizable(false);
            jTableDepartamento.getColumnModel().getColumn(2).setResizable(false);
        }

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jComboBoxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Identificação", "nome", "cnpj" }));
        jComboBoxFiltro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxFiltroItemStateChanged(evt);
            }
        });
        jComboBoxFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jComboBoxFiltroKeyReleased(evt);
            }
        });

        jTextFieldPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldPesquisaKeyReleased(evt);
            }
        });

        jLayeredPane1.setLayer(jComboBoxFiltro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTextFieldPesquisa, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxFiltro, 0, 252, Short.MAX_VALUE)
                    .addComponent(jTextFieldPesquisa))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alterar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jTextFieldIDDepartamento.setEnabled(false);

        jLayeredPane2.setLayer(jTextFieldIDDepartamento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jTextFieldNomeDepartamento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jTextFieldNumeroDepartamento, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldIDDepartamento)
                    .addComponent(jTextFieldNomeDepartamento)
                    .addComponent(jTextFieldNumeroDepartamento))
                .addContainerGap())
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addComponent(jTextFieldIDDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldNomeDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldNumeroDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jButtonDesligar.setText("Desligar");
        jButtonDesligar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDesligarActionPerformed(evt);
            }
        });

        jButtonLimparAlteração.setText("Limpar Tabela");
        jButtonLimparAlteração.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparAlteraçãoActionPerformed(evt);
            }
        });

        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jButtonDeletar.setText("Deletar");
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jLayeredPane3.setLayer(jButtonCadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jButtonVoltar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jButtonDesligar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jButtonLimparAlteração, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jButtonAtualizar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jButtonDeletar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jButtonAlterar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDesligar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonLimparAlteração)
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(132, 132, 132))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar)
                    .addComponent(jButtonAtualizar))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoltar)
                    .addComponent(jButtonLimparAlteração)
                    .addComponent(jButtonDeletar))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDesligar)
                    .addComponent(jButtonAlterar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLayeredPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLayeredPane1)
                    .addComponent(jLayeredPane2))
                .addGap(22, 22, 22)
                .addComponent(jLayeredPane3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDesligarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesligarActionPerformed
        
        servicesFactory.desligarSistema();
        this.dispose();
        
    }//GEN-LAST:event_jButtonDesligarActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        
        servicesFactory.abirMenuPrincipal();
        this.dispose();
        
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        
        servicesFactory.abrirCadastroDeDepartamento();
        this.dispose();
        
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jTableDepartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDepartamentoMouseClicked
        
        //servicesDepartamento.alterarDepartamento(this.jTableDepartamento, this.jTextFieldIDDepartamento.getText(), this.jTextFieldNomeDepartamento.getText(), this.jTextFieldNumeroDepartamento.getText());
        
        alterarDepartamento();
    }//GEN-LAST:event_jTableDepartamentoMouseClicked

    private void jButtonLimparAlteraçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparAlteraçãoActionPerformed
        
        defaultTableModel.setNumRows(0);
        jTextFieldIDDepartamento.setText(null);
        jTextFieldNomeDepartamento.setText(null);
        jTextFieldNumeroDepartamento.setText(null);
        
        //servicesDepartamento.limparTabela(this.defaultTableModel, this.jTextFieldIDDepartamento.getText(), this.jTextFieldNomeDepartamento.getText(), this.jTextFieldNumeroDepartamento.getText());
        //servicesDepartamento.limparTabela(this.defaultTableModel, this.jTextFieldIDDepartamento, this.jTextFieldNomeDepartamento, this.jTextFieldNumeroDepartamento);
        
    }//GEN-LAST:event_jButtonLimparAlteraçãoActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        
        defaultTableModel.setNumRows(0);
        jTextFieldNomeDepartamento.setText(null);
        jTextFieldNumeroDepartamento.setText(null);
        
        //servicesDepartamento.limparTabela(this.defaultTableModel, this.jTextFieldIDDepartamento.getText(), this.jTextFieldNomeDepartamento.getText(), this.jTextFieldNumeroDepartamento.getText());
        //atualizaTabela();
        servicesDepartamento.atualizaTabela(this.defaultTableModel, 
                this.jTableDepartamento);
              
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        
        //servicesDepartamento.deletarDepartamento(this.jTableDepartamento, this.jTextFieldIDDepartamento.getText());
        servicesDepartamento.deletarDepartamento(this.jTableDepartamento, 
                this.jTextFieldIDDepartamento.getText());
        
        defaultTableModel.setNumRows(0);
        jTextFieldNomeDepartamento.setText(null);
        jTextFieldNumeroDepartamento.setText(null);
        
        //servicesDepartamento.limparTabela(this.defaultTableModel, this.jTextFieldIDDepartamento.getText(), this.jTextFieldNomeDepartamento.getText(), this.jTextFieldNumeroDepartamento.getText());
        
        servicesDepartamento.atualizaTabela(this.defaultTableModel, 
                this.jTableDepartamento);
        //atualizaTabela();        
        
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
                    
        confirmarAlteracao();
        
        defaultTableModel.setNumRows(0);
        jTextFieldNomeDepartamento.setText(null);
        jTextFieldNumeroDepartamento.setText(null);
        
        //servicesDepartamento.limparTabela(this.defaultTableModel, this.jTextFieldIDDepartamento.getText(), this.jTextFieldNomeDepartamento.getText(), this.jTextFieldNumeroDepartamento.getText());
        //servicesDepartamento.confirmarAlteracao(this.jTableDepartamento, this.jTextFieldIDDepartamento.getText(), this.jTextFieldNomeDepartamento.getText(), Integer.parseInt(this.jTextFieldNumeroDepartamento.getText()));
        
        servicesDepartamento.atualizaTabela(this.defaultTableModel, 
                this.jTableDepartamento);
        
        //atualizaTabela();
               
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jTextFieldPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaKeyReleased
        
        defaultTableModel.setNumRows(0);
        jTextFieldNomeDepartamento.setText(null);
        jTextFieldNumeroDepartamento.setText(null);
        
        //servicesDepartamento.limparTabela(this.defaultTableModel, this.jTextFieldIDDepartamento.getText(), this.jTextFieldNomeDepartamento.getText(), this.jTextFieldNumeroDepartamento.getText());
        
        servicesDepartamento.filtrarDepartamento(this.jTextFieldPesquisa.
                getText(), this.defaultTableModel, this.jTableDepartamento, 
                this.jComboBoxFiltro);
        
        //filtrarDepartamento();
              
    }//GEN-LAST:event_jTextFieldPesquisaKeyReleased

    private void jComboBoxFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxFiltroItemStateChanged
        
        defaultTableModel.setNumRows(0);
        jTextFieldNomeDepartamento.setText(null);
        jTextFieldNumeroDepartamento.setText(null);
        
        //servicesDepartamento.limparTabela(this.defaultTableModel, this.jTextFieldIDDepartamento.getText(), this.jTextFieldNomeDepartamento.getText(), this.jTextFieldNumeroDepartamento.getText());
        
        servicesDepartamento.filtrarDepartamento(this.jTextFieldPesquisa.
                getText(), this.defaultTableModel, this.jTableDepartamento, 
                this.jComboBoxFiltro);
        
        //filtrarDepartamento();
      
    }//GEN-LAST:event_jComboBoxFiltroItemStateChanged

    private void jComboBoxFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxFiltroKeyReleased
        
        defaultTableModel.setNumRows(0);
        jTextFieldNomeDepartamento.setText(null);
        jTextFieldNumeroDepartamento.setText(null);
        //servicesDepartamento.limparTabela(this.defaultTableModel, this.jTextFieldIDDepartamento.getText(), this.jTextFieldNomeDepartamento.getText(), this.jTextFieldNumeroDepartamento.getText());
        
        servicesDepartamento.filtrarDepartamento(this.jTextFieldPesquisa.
                getText(), this.defaultTableModel, this.jTableDepartamento, 
                this.jComboBoxFiltro);
        
        //filtrarDepartamento();
                       
    }//GEN-LAST:event_jComboBoxFiltroKeyReleased

    /*private void limparTabela(){
        defaultTableModel.setNumRows(0);
        jTextFieldIDDepartamento.setText(null);
        jTextFieldNomeDepartamento.setText(null);
        jTextFieldNumeroDepartamento.setText(null);
    }*/
    
    /*private void atualizaTabela() {
        try {
                
            ServicesDepartamento servicesDepartamento = ServicesFactory.getDepartamentosServicos();
            
            ArrayList<Departamento> listaDepartamentos = new ArrayList<>();
            
            listaDepartamentos = servicesDepartamento.buscarDepartamento();

            for (int i = 0; i < listaDepartamentos.size(); i++) {
                defaultTableModel.addRow(new String[]{
                    String.valueOf(listaDepartamentos.get(i).getIdDepartamento()),
                    String.valueOf(listaDepartamentos.get(i).getNome()),
                    String.valueOf(listaDepartamentos.get(i).getNumero())
                   
                });
            }
            
            jTableDepartamento.setModel(defaultTableModel);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(
                        this,
                        "Erro ao Atualizar Tabela " + e.getMessage(),
                        "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        jTextFieldIDDepartamento.setText(null);
        
    }*/
    
    /*private void deletarDepartamento(){
       try {
           int linha = jTableDepartamento.getSelectedRow();
           if (linha == -1){
               JOptionPane.showMessageDialog(
                       this,
                       "Selecione Uma Linha");
           } else{
               String id = jTableDepartamento.getValueAt(linha, 0).toString();
               ServicesDepartamento servicesDepartamento = ServicesFactory.getDepartamentosServicos();
               servicesDepartamento.deletarDepartamento(id);
               
               JOptionPane.showMessageDialog(
                       this,
                       "Departamento Deletado");
           }
        } catch (Exception e) {
           JOptionPane.showMessageDialog(
                   this,
                   "Erro ao Deletar Departamento " + e.getMessage(),
                   "ERRO",
                   JOptionPane.ERROR_MESSAGE);
        }   
        jTextFieldIDDepartamento.setText(null);
        
    }*/
    
    /*private void filtrarDepartamento(){
       try {
           if (jTextFieldPesquisa.getText().isEmpty()){
               servicesDepartamento.atualizaTabela(this.defaultTableModel, this.jTableDepartamento);
           } else{
                String pesq = jTextFieldPesquisa.getText();
                String filtro = jComboBoxFiltro.getSelectedItem().toString();
                String query = "";
                if (filtro.equalsIgnoreCase("Identificação")){
                    query = "WHERE id_departamento LIKE '%" + pesq + "%'";                    
                } else if (filtro.equalsIgnoreCase("Nome")){
                    
                    query = "WHERE nome LIKE '%" + pesq + "%'";

                } else if (filtro.equalsIgnoreCase("Numero")){
                    
                    query = "WHERE numero LIKE '%" + pesq + "%'";
                }
                
                ServicesDepartamento ServicesDepartamento = ServicesFactory.getDepartamentosServicos();
                ArrayList<Departamento> listaDepartamentos = ServicesDepartamento.filtrarDepartamento(query);
                
                for (int i = 0 ; i < listaDepartamentos.size() ; i ++){
                    defaultTableModel.addRow(new String[]{
                        listaDepartamentos.get(i).getIdDepartamento(),
                        listaDepartamentos.get(i).getNome(),
                        String.valueOf(listaDepartamentos.get(i).getNumero()),
                    
                    });
                }
                jTableDepartamento.setModel(defaultTableModel);
            }
           
        } catch (Exception e) {           
            jTextFieldPesquisa.setText(null);
            JOptionPane.showMessageDialog(this,
                    "Erro ao Filtrar Departamento " + e.getMessage(),
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE);
        }
    }*/
    
    private void alterarDepartamento(){
         try {
            int linha = jTableDepartamento.getSelectedRow();
            if (linha == -1) {
                JOptionPane.showMessageDialog(
                        this,
                       "Selecione uma Linha!");
            } else {
                String id = jTableDepartamento.getValueAt(linha, 0).toString();
                
                String nome = jTableDepartamento.getValueAt(linha, 1).toString();
                String numero = jTableDepartamento.getValueAt(linha, 2).toString();
                
                jTextFieldIDDepartamento.setText(id);
                jTextFieldNomeDepartamento.setText(nome);
                jTextFieldNumeroDepartamento.setText(numero);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao Selecionar Departamento " + e.getMessage(),
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void confirmarAlteracao() {
        try {
            int linha = jTableDepartamento.getSelectedRow();
            if (linha == -1) {
                JOptionPane.showMessageDialog(
                        this,
                       "Selecione uma Linha!");
            }else{
                objDepartamento.setIdDepartamento(jTextFieldIDDepartamento.getText());
                objDepartamento.setNome(jTextFieldNomeDepartamento.getText());
                objDepartamento.setCNPJ(Integer.parseInt(jTextFieldNumeroDepartamento.getText()));

                ServicesDepartamento servicesDepartamento = br.com.web.services.ServicesFactory.getDepartamentosServicos();

                servicesDepartamento.alterarDepartamentos(objDepartamento);
                JOptionPane.showMessageDialog(
                rootPane, 
                "Departamento Alterado Com Sucesso!");
            
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao Alterar Departamento " + e.getMessage(),
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE);
        }
        jTextFieldIDDepartamento.setText(null);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonDesligar;
    private javax.swing.JButton jButtonLimparAlteração;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboBoxFiltro;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDepartamento;
    private javax.swing.JTextField jTextFieldIDDepartamento;
    private javax.swing.JTextField jTextFieldNomeDepartamento;
    private javax.swing.JTextField jTextFieldNumeroDepartamento;
    private javax.swing.JTextField jTextFieldPesquisa;
    // End of variables declaration//GEN-END:variables
}
