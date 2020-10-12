//PROJECT NAME: prjRHBanco
package br.com.web.view;
import br.com.web.services.ServicesFactory;
/**
 *
 * @author Bruno Gressler da Silveira
 * @version 2.0
 * @since 09/01/2020
 */
public class Menu extends javax.swing.JFrame {

    ServicesFactory servicesFactory = new ServicesFactory();

    public Menu() {
        
        initComponents();   

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBarPrincipal = new javax.swing.JMenuBar();
        jMenuCadastrar = new javax.swing.JMenu();
        jMenuItemCadastrarDepartamento = new javax.swing.JMenuItem();
        jMenuManutencao = new javax.swing.JMenu();
        jMenuItemManutencaoDepartamento = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jMenuCadastrar.setText("Cadastrar");

        jMenuItemCadastrarDepartamento.setText("Departamento");
        jMenuItemCadastrarDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarDepartamentoActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemCadastrarDepartamento);

        jMenuBarPrincipal.add(jMenuCadastrar);

        jMenuManutencao.setText("Manutenção");

        jMenuItemManutencaoDepartamento.setText("Departamento");
        jMenuItemManutencaoDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemManutencaoDepartamentoActionPerformed(evt);
            }
        });
        jMenuManutencao.add(jMenuItemManutencaoDepartamento);

        jMenuBarPrincipal.add(jMenuManutencao);

        jMenuSair.setText("Sair");
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });
        jMenuBarPrincipal.add(jMenuSair);

        setJMenuBar(jMenuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadastrarDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarDepartamentoActionPerformed
       
       servicesFactory.abrirCadastroDeDepartamento();
       this.dispose();
       
    }//GEN-LAST:event_jMenuItemCadastrarDepartamentoActionPerformed

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked
       
        servicesFactory.desligarSistema();
        this.dispose();
        
    }//GEN-LAST:event_jMenuSairMouseClicked

    private void jMenuItemManutencaoDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemManutencaoDepartamentoActionPerformed
       
        servicesFactory.abrirManutencaoDeDepartamento();
        this.dispose();
        
    }//GEN-LAST:event_jMenuItemManutencaoDepartamentoActionPerformed

    /*private void CadastrarFruta(){
        try {
            Tabela tabela = new Tabela();
            
            tabela.setNome(jtNome.getText());
            tabela.setValorCusto(Double.parseDouble(jtValor.getText()));
            tabela.setQuantidade(Integer.parseInt(jtQuantidade.getText()));
              
            FrutasServicos fs = servicos.ServicosFactory.getFrutasServicos();
            
            fs.insertFrutas(fVO);
            
            JOptionPane.showMessageDialog(
                    rootPane,
                    "Fruta Cadastrada");
            limpar();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro GUICadastro Fruta " + e.getMessage(),
                    "ERRO",
                    JOptionPane.ERROR_MESSAGE);
        }
    }*/
    
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBarPrincipal;
    private javax.swing.JMenu jMenuCadastrar;
    private javax.swing.JMenuItem jMenuItemCadastrarDepartamento;
    private javax.swing.JMenuItem jMenuItemManutencaoDepartamento;
    private javax.swing.JMenu jMenuManutencao;
    private javax.swing.JMenu jMenuSair;
    // End of variables declaration//GEN-END:variables
}
