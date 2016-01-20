/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package frames;

import dados.*;
import javax.swing.JOptionPane;
import persistencia.ControladorDePersistencia;

/**
 *
 * @author Guilherme
 */
public class Excluir extends javax.swing.JFrame {

    private int selecionado;
    private Funcionario funcionario;
    private Curso curso;
    private Nivel nivel;
    private Aluno aluno;
    private Turma turma;
    
    public ConsultarFuncionario cf;
    public ConsultarCurso cc;
    public ConsultarNivel cn;
    public ConsultarAluno ca;
    public ConsultarTurma ct;
    /**
     * Creates new form ExcluirAluno
     */
    public Excluir(){
        initComponents();
        this.setLocationRelativeTo(this);
    }
    
    public Excluir(ConsultarFuncionario consul,Funcionario f) {
        initComponents();
        cf = consul;
        this.funcionario = f;
        this.selecionado = 1;
         if (f.getTipo() == 1){
            this.jLabel1.setText("Excluir Professor");
            this.jLabel2.setText("Excluir professor do sistema?");
        }
        if (f.getTipo() == 2){
            this.jLabel1.setText("Excluir Secretário");
            this.jLabel2.setText("Excluir secretário do sistema?");
        }
        if(f.getTipo() > 2){
            this.jLabel1.setText("Excluir Auxiliar Geral");
            this.jLabel2.setText("Excluir auxiliar geral do sistema?");
        }
        this.setLocationRelativeTo(null);
    }
    
    public Excluir(ConsultarCurso cur,Curso c) {
        initComponents();
        cc = cur;
        this.curso = c;
        this.selecionado = 2;
        this.jLabel1.setText("Excluir Curso");
        this.jLabel2.setText("Excluir curso do sistema?");
        
        this.setLocationRelativeTo(null);
    }
    
    public Excluir(ConsultarNivel niv,Nivel n) {
        initComponents();
        cn = niv;
        this.nivel = n;
        this.selecionado = 3;
        this.jLabel1.setText("Excluir Nivel");
        this.jLabel2.setText("Excluir nivel do sistema?");
        
        this.setLocationRelativeTo(null);
    }
    
    public Excluir(ConsultarAluno calu,Aluno a) {
        initComponents();
        ca = calu;
        this.aluno = a;
        this.selecionado = 4;
        this.jLabel1.setText("Excluir Aluno");
        this.jLabel2.setText("Excluir aluno do sistema?");
        
        this.setLocationRelativeTo(null);
    }

    public Excluir(ConsultarTurma ctur,Turma tur) {
        initComponents();
        ct = ctur;
        this.turma = new Turma();
        turma.clonarTurma(tur);
        this.selecionado = 5;
        this.jLabel1.setText("Excluir Turma");
        this.jLabel2.setText("Excluir turma do sistema?");
        
        this.setLocationRelativeTo(null);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Excluir Professor");

        jLabel2.setText("Excluir professor do sistema?");

        jButton1.setText("Excluir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel1))
                            .addComponent(jLabel2))
                        .addGap(0, 59, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(selecionado == 1){
            cf.setEnabled(true);
        }
        if(selecionado == 2){
            cc.setEnabled(true);
        }
        if(selecionado == 3){
            cn.setEnabled(true);
        }
        if(selecionado == 4){
            ca.setEnabled(true);
        }
        if(selecionado == 5){
            ct.setEnabled(true);
        }
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(this.selecionado == 1){
            try{
                ControladorDePersistencia c = new ControladorDePersistencia();
                boolean resultado = c.removeFuncionario(funcionario);
                if(resultado){
                    if(funcionario.getTipo() == 1){
                        JOptionPane.showMessageDialog(this,"Professor excluido com sucesso.");
                    }
                    if(funcionario.getTipo() == 2){
                        JOptionPane.showMessageDialog(this,"Secretário excluido com sucesso.");
                    }
                    if(funcionario.getTipo() > 2){
                        JOptionPane.showMessageDialog(this,"Auxiliar Geral excluido com sucesso.");
                    }
                }
                else{
                    if(funcionario.getTipo() == 1){
                        JOptionPane.showMessageDialog(this,"Não foi possível excluir o professor");
                    }
                    if(funcionario.getTipo() == 2){
                        JOptionPane.showMessageDialog(this,"Não foi possível excluir o secretário");
                    }
                    if(funcionario.getTipo() > 2){
                        JOptionPane.showMessageDialog(this,"Não foi possível excluir o funcionario");
                    }
            
                }
            
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
            cf.reload();
            cf.setEnabled(true);
        }
        if(this.selecionado == 2){
            try{
                ControladorDePersistencia c = new ControladorDePersistencia();
                boolean resultado = c.removeCurso(curso);
                if(resultado){
                    JOptionPane.showMessageDialog(this,"Curso excluido com sucesso.");
                }
                else{
                    JOptionPane.showMessageDialog(this,"Não foi possível excluir o curso");
            
                }
            
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
            cc.reload();
            cc.setEnabled(true);
        }
        if(this.selecionado == 3){
            try{
                ControladorDePersistencia c = new ControladorDePersistencia();
                boolean resultado = c.removeNivel(nivel);
                if(resultado){
                    JOptionPane.showMessageDialog(this,"Nível excluido com sucesso.");
                }
                else{
                    JOptionPane.showMessageDialog(this,"Não foi possível excluir o nível");
            
                }
            
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
            cn.reload();
            cn.setEnabled(true);
        }
        if(this.selecionado == 4){
            try{
                ControladorDePersistencia c = new ControladorDePersistencia();
                boolean resultado = c.removeAluno(aluno);
                if(resultado){
                    JOptionPane.showMessageDialog(this,"Aluno excluido com sucesso.");
                }
                else{
                    JOptionPane.showMessageDialog(this,"Não foi possível excluir o aluno");
            
                }
            
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
            ca.reload();
            ca.setEnabled(true);
        }
        if(this.selecionado == 5){
            try{
                ControladorDePersistencia c = new ControladorDePersistencia();
                boolean resultado = c.removeTurma(turma);
                if(resultado){
                    JOptionPane.showMessageDialog(this,"Turma excluido com sucesso.");
                }
                else{
                    JOptionPane.showMessageDialog(this,"Não foi possível excluir o turma");
            
                }
            
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
            ct.reload();
            ct.setEnabled(true);
        }
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Excluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Excluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Excluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Excluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Excluir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}