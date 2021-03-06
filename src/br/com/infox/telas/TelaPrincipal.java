package br.com.infox.telas;

import java.sql.*;
import java.beans.PropertyVetoException;
import java.text.DateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import br.com.infox.dal.ModuloConexao;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class TelaPrincipal extends javax.swing.JFrame {

    Connection conexao = null;

    public TelaPrincipal() {
        initComponents();
        conexao = ModuloConexao.conector();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        lblUsuario = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        menCad = new javax.swing.JMenu();
        menCadCli = new javax.swing.JMenuItem();
        menCadOs = new javax.swing.JMenuItem();
        menCadUsuarios = new javax.swing.JMenuItem();
        menRela = new javax.swing.JMenu();
        menRelaCli = new javax.swing.JMenuItem();
        menRelaServ = new javax.swing.JMenuItem();
        menAjuda = new javax.swing.JMenu();
        menAjudaSob = new javax.swing.JMenuItem();
        menOpcoes = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menOpcoesSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("InfoX - Sistema para controle de OS");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        desktop.setPreferredSize(new java.awt.Dimension(680, 500));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 0, 0));
        lblUsuario.setText("Usuário");

        lblData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblData.setText("Data");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icones/256.png"))); // NOI18N

        menCad.setText("Cadastro");

        menCadCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        menCadCli.setText("Clientes");
        menCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadCliActionPerformed(evt);
            }
        });
        menCad.add(menCadCli);

        menCadOs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        menCadOs.setText("OS");
        menCadOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadOsActionPerformed(evt);
            }
        });
        menCad.add(menCadOs);

        menCadUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        menCadUsuarios.setText("Usuários");
        menCadUsuarios.setEnabled(false);
        menCadUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadUsuariosActionPerformed(evt);
            }
        });
        menCad.add(menCadUsuarios);

        menu.add(menCad);

        menRela.setText("Relatório");
        menRela.setEnabled(false);

        menRelaCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        menRelaCli.setText("Clientes");
        menRelaCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menRelaCliActionPerformed(evt);
            }
        });
        menRela.add(menRelaCli);

        menRelaServ.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        menRelaServ.setText("Serviços");
        menRelaServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menRelaServActionPerformed(evt);
            }
        });
        menRela.add(menRelaServ);

        menu.add(menRela);

        menAjuda.setText("Ajuda");

        menAjudaSob.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        menAjudaSob.setText("Sobre");
        menAjudaSob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menAjudaSobActionPerformed(evt);
            }
        });
        menAjuda.add(menAjudaSob);

        menu.add(menAjuda);

        menOpcoes.setText("Opções");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Logoff");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menOpcoes.add(jMenuItem1);

        menOpcoesSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_MASK));
        menOpcoesSair.setText("Sair");
        menOpcoesSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menOpcoesSairActionPerformed(evt);
            }
        });
        menOpcoes.add(menOpcoesSair);

        menu.add(menOpcoes);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblData)
                            .addComponent(lblUsuario)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lblUsuario)
                .addGap(36, 36, 36)
                .addComponent(lblData)
                .addGap(55, 55, 55)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(84, 84, 84))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menCadUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadUsuariosActionPerformed

        //habilita o form usuário dentro do desktop pane
        TelaUsuario usuario = new TelaUsuario();
        usuario.setVisible(true);
        desktop.add(usuario);

        //para abrir o JInternalFrame maximilizado
        try {
            usuario.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_menCadUsuariosActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        //as linhas abaixo substituem a label txtData pela data atual do sistema
        Date data = new Date();
        DateFormat formato = DateFormat.getDateInstance(DateFormat.SHORT);
        lblData.setText(formato.format(data));

    }//GEN-LAST:event_formWindowActivated

    private void menOpcoesSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menOpcoesSairActionPerformed

        //exibe uma caixa de diálogo com a opção para sair
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_menOpcoesSairActionPerformed

    private void menAjudaSobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menAjudaSobActionPerformed

        //chamando o menu Sobre
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);

    }//GEN-LAST:event_menAjudaSobActionPerformed

    private void menCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadCliActionPerformed

        //chamar a tela de clientes
        TelaCliente cliente = new TelaCliente();
        cliente.setVisible(true);
        //habilita o form clientes dentro do desktop pane
        desktop.add(cliente);

        //para abrir o JInternalFrame maximilizado
        try {
            cliente.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_menCadCliActionPerformed

    private void menCadOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadOsActionPerformed

        TelaOS os = new TelaOS();
        os.setVisible(true);
        //habilita o form clientes dentro do desktop pane
        desktop.add(os);

        //para abrir o JInternalFrame maximilizado
        try {
            os.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_menCadOsActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        //mensagem de confirmação antes de realizar logoff
        int confirma = JOptionPane.showConfirmDialog(null, "Deseja realizar logoff do sistema?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            //realizar logoff no sistema e retornar a tela de login
            TelaLogin login = new TelaLogin();
            login.setVisible(true);
            dispose();
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menRelaCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menRelaCliActionPerformed

        //confirmação para emissão do relatório utilizando o Jasper/iReport
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a emissão do relatório de clientes?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            //imprimindo relatório com o framework JasperReports
            try {
                //usando a classe JasperPrint para imprimir o relatório
                JasperPrint print;
                print = JasperFillManager.fillReport("C:\\Users\\rodri_000\\Documents\\NetBeansProjects\\ProjetoInfoX\\src\\ireport\\clientes.jasper", null, conexao);
                //a linha abaixo exibe o relatório através da classe JasperViewer
                JasperViewer.viewReport(print, false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }//GEN-LAST:event_menRelaCliActionPerformed

    private void menRelaServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menRelaServActionPerformed

        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a emissão do relatório de serviços?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {

            try {
                JasperPrint printServ;
                printServ = JasperFillManager.fillReport("C:\\Users\\rodri_000\\Documents\\NetBeansProjects\\ProjetoInfoX\\src\\ireport\\servicos.jasper", null, conexao);
                JasperViewer.viewReport(printServ, false);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }

        }

    }//GEN-LAST:event_menRelaServActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */ //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblData;
    public static javax.swing.JLabel lblUsuario;
    private javax.swing.JMenu menAjuda;
    private javax.swing.JMenuItem menAjudaSob;
    private javax.swing.JMenu menCad;
    private javax.swing.JMenuItem menCadCli;
    private javax.swing.JMenuItem menCadOs;
    public static javax.swing.JMenuItem menCadUsuarios;
    private javax.swing.JMenu menOpcoes;
    private javax.swing.JMenuItem menOpcoesSair;
    public static javax.swing.JMenu menRela;
    private javax.swing.JMenuItem menRelaCli;
    private javax.swing.JMenuItem menRelaServ;
    private javax.swing.JMenuBar menu;
    // End of variables declaration//GEN-END:variables
}
