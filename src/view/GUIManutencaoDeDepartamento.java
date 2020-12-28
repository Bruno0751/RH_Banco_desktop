//PROJECT NAME: prjRHBanco
package view;

import model.Departamento;
import services.ServicesDepartamento;
import services.ServicesFactory;
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
        servicesDepartamento.atualizandoTabela(this.defaultTableModel, this.jTableDepartamento);        
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
        jTextFieldCNPJDepartamento = new javax.swing.JTextField();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jButtonDesligar = new javax.swing.JButton();
        jButtonLimparAlteração = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manutenção de Departamento");

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
        jLayeredPane2.setLayer(jTextFieldCNPJDepartamento, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldIDDepartamento)
                    .addComponent(jTextFieldNomeDepartamento)
                    .addComponent(jTextFieldCNPJDepartamento))
                .addContainerGap())
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addComponent(jTextFieldIDDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldNomeDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldCNPJDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonLimparAlteração, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonDesligar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(116, 116, 116))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar)
                    .addComponent(jButtonAtualizar)
                    .addComponent(jButtonDesligar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoltar)
                    .addComponent(jButtonLimparAlteração)
                    .addComponent(jButtonDeletar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAlterar)
                .addContainerGap(40, Short.MAX_VALUE))
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

    private void limparTabela(){
        defaultTableModel.setNumRows(0);
        jTextFieldIDDepartamento.setText(null);
        jTextFieldNomeDepartamento.setText(null);
        jTextFieldCNPJDepartamento.setText(null);
    }
    
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
        alterarDepartamento();
    }//GEN-LAST:event_jTableDepartamentoMouseClicked

    private void jButtonLimparAlteraçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparAlteraçãoActionPerformed
        limparTabela();      
    }//GEN-LAST:event_jButtonLimparAlteraçãoActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        limparTabela();
        
        servicesDepartamento.atualizandoTabela(this.defaultTableModel, 
                this.jTableDepartamento);
              
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        servicesDepartamento.deletarDepartamento(this.jTableDepartamento, 
                this.jTextFieldIDDepartamento.getText());
        
        limparTabela();
        
        servicesDepartamento.atualizandoTabela(this.defaultTableModel, 
                this.jTableDepartamento);            
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
                    
        confirmarAlteracao();
        
        defaultTableModel.setNumRows(0);
        jTextFieldNomeDepartamento.setText(null);
        jTextFieldCNPJDepartamento.setText(null);
        
        servicesDepartamento.atualizandoTabela(this.defaultTableModel, 
                this.jTableDepartamento);              
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jTextFieldPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaKeyReleased
        limparTabela();
        
        servicesDepartamento.filtrarDepartamento(this.jTextFieldPesquisa.
                getText(), this.defaultTableModel, this.jTableDepartamento, 
                this.jComboBoxFiltro);           
    }//GEN-LAST:event_jTextFieldPesquisaKeyReleased

    private void jComboBoxFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxFiltroItemStateChanged
        limparTabela();
        
        servicesDepartamento.filtrarDepartamento(this.jTextFieldPesquisa.
                getText(), this.defaultTableModel, this.jTableDepartamento, 
                this.jComboBoxFiltro);   
    }//GEN-LAST:event_jComboBoxFiltroItemStateChanged

    private void jComboBoxFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxFiltroKeyReleased
        limparTabela();  
        
        servicesDepartamento.filtrarDepartamento(this.jTextFieldPesquisa.
                getText(), this.defaultTableModel, this.jTableDepartamento, 
                this.jComboBoxFiltro);                     
    }//GEN-LAST:event_jComboBoxFiltroKeyReleased
    
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
                jTextFieldCNPJDepartamento.setText(numero);
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
                objDepartamento.setCNPJ(Integer.parseInt(jTextFieldCNPJDepartamento.getText()));

                ServicesDepartamento servicesDepartamento = services.ServicesFactory.getDepartamentosServicos();

                servicesDepartamento.alterarDepartamento(objDepartamento);
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
    private javax.swing.JTextField jTextFieldCNPJDepartamento;
    private javax.swing.JTextField jTextFieldIDDepartamento;
    private javax.swing.JTextField jTextFieldNomeDepartamento;
    private javax.swing.JTextField jTextFieldPesquisa;
    // End of variables declaration//GEN-END:variables
}
