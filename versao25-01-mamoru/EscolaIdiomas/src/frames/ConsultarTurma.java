/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package frames;

import dados.*;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.ControladorDePersistencia;

/**
 *
 * @author Guilherme
 */
public class ConsultarTurma extends javax.swing.JFrame {

    MenuPrincipal mp;
    Matricular mt;
    Rematricular rm;
    
    ArrayList<Turma> listaTurma;
    ArrayList<Turma> listaTurmaAtivo;
    int selecionado;
    
    Turma turma;
    Nivel nivel;
    Curso curso;
    Funcionario funcionario;
    
    
    /**
     * Creates new form GerenciarNotas
     */
    public ConsultarTurma() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public ConsultarTurma(MenuPrincipal f1) {
        initComponents();
        this.mp = f1;
        this.selecionado = 1;
        this.reload();
        this.setLocationRelativeTo(this);
    }
    
    public ConsultarTurma(Matricular m1) {
        initComponents();
        this.mt = m1;
        this.reload();
        this.selecionado = 2;
        this.jButton4.setVisible(false);
        this.jButton4.setEnabled(false);
        this.jButton3.setText("Selecionar");
        this.setLocationRelativeTo(this);
    }
    
    public ConsultarTurma(Rematricular r1) {
        initComponents();
        this.rm = r1;
        this.reload();
        this.selecionado = 3;
        this.jButton4.setVisible(false);
        this.jButton4.setEnabled(false);
        this.jButton3.setText("Selecionar");
        this.setLocationRelativeTo(this);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Consultar Turma");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Turma", "Nível", "Curso", "Vagas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Nível:");

        jLabel5.setText("Curso:");

        jButton3.setText("Alterar Turma");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Excluir Turma");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(this.selecionado == 1){
            mp.setEnabled(true);
        }
        if(selecionado == 2){
            mt.setEnabled(true);
        }
        if(selecionado == 3){
            rm.setEnabled(true);
        }
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try{
            int posicaoSelecionado = this.jTable1.getSelectedRow();
            if(posicaoSelecionado < 0){
                JOptionPane.showMessageDialog(this,"Nenhuma turma selecionado.","Error",JOptionPane.ERROR_MESSAGE);
                return;
            }
            Turma t1 = new Turma();
            t1.clonarTurma(listaTurma.get(posicaoSelecionado));
            Excluir f = new Excluir(this,t1);
            f.setVisible(true);
            this.setEnabled(false);
        }
        catch(Exception ex){
            
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try{
            if(selecionado == 1){
                int posicaoSelecionado = this.jTable1.getSelectedRow();
                if(posicaoSelecionado < 0){
                    JOptionPane.showMessageDialog(this,"Nenhuma turma selecionado.","Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                turma = new Turma();
                turma.clonarTurma(listaTurma.get(posicaoSelecionado));

                this.setCurso();
                this.setNivel();
                this.setFuncionario();
                InserirTurma f = new InserirTurma(this,turma,curso,nivel,funcionario);
                f.setVisible(true);
                this.setEnabled(false);
            }
            if(selecionado == 2){
                int posicaoSelecionado = this.jTable1.getSelectedRow();
                if(posicaoSelecionado < 0){
                    JOptionPane.showMessageDialog(this,"Nenhuma turma selecionado.","Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                turma = new Turma();
                turma.clonarTurma(listaTurma.get(posicaoSelecionado));
                if(turma.getVagas() == 0){
                    JOptionPane.showMessageDialog(this,"Não tem vagas para essa turma.","Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                mt.setTurma(turma);
                mt.setEnabled(true);
                this.dispose();
            }
            if(selecionado == 3){
                int posicaoSelecionado = this.jTable1.getSelectedRow();
                if(posicaoSelecionado < 0){
                    JOptionPane.showMessageDialog(this,"Nenhuma turma selecionado.","Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                turma = new Turma();
                turma.clonarTurma(listaTurma.get(posicaoSelecionado));
                rm.setTurma(turma);
                rm.setEnabled(true);
                this.dispose();
            }
            
        }
        catch(Exception ex){
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(formatar(jTextField1.getText().toString()).equals("")){
            if(formatar(jTextField2.getText().toString()).equals("")){
                if(formatar(jTextField4.getText().toString()).equals("")){
                    reload();
                    return;
                }
            }
        }
        
        buscar();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void buscar(){
        this.carregaBusca();
        this.listarAtivos();
    }
    
    public void carregaBusca(){
        String nomeBusca = formatar(jTextField1.getText().toString());
        String nomeNivelBusca = formatar(jTextField2.getText().toString());
        String nomeCursoBusca = formatar(jTextField4.getText().toString());
        listaTurma.clear();
        ArrayList<Curso> lcurso= new ArrayList<Curso>();
        ArrayList<Nivel> lnivel= new ArrayList<Nivel>();
        try{
            ControladorDePersistencia con1 = new ControladorDePersistencia();
            lcurso = con1.carregaCurso();



            ControladorDePersistencia con2 = new ControladorDePersistencia();
            lnivel = con2.carregaNivel();
            for(Turma t:listaTurmaAtivo){
                if(formatar(t.getNome().toUpperCase()).contains(formatar(nomeBusca.toUpperCase()))){
                    Curso curso1 = new Curso();
                    Nivel nivel1 = new Nivel();
                    for (Curso c1: lcurso){
                        if(c1.getId() == t.getIdCurso()){
                            curso1.clonarCurso(c1);
                        }
                    }
                    for (Nivel n1:lnivel){
                        if(n1.getId() == t.getIdNivel()){
                            nivel1.clonarNivel(n1);
                        }
                    }
                    if(formatar(curso1.getNome().toUpperCase()).contains(formatar(nomeCursoBusca.toUpperCase()))){

                        if(formatar(nivel1.getNome().toUpperCase()).contains(formatar(nomeNivelBusca.toUpperCase()))){

                            Turma t1 = new Turma();
                            t1.clonarTurma(t);
                            listaTurma.add(t1);
                        }
                    }
                }
            }
        }
        catch(Exception ex){
            
        }
        
    }
    
    public void reload(){
        this.carregaCurso();
        this.listarAtivos();
    }
    
    private void carregaCurso(){
        listaTurmaAtivo = new ArrayList<>();
        listaTurma = new ArrayList<>();
        try{
            ControladorDePersistencia con = new ControladorDePersistencia();            
            ArrayList<Turma> lstT = con.carregaTurma();   
            for (Turma t:lstT){
                if (t.getStatus() == 1){
                    listaTurmaAtivo.add(t);
                    this.listaTurma.add(t);

                    Collections.sort(listaTurmaAtivo, Turma.TurmaNameComparator);
                    Collections.sort(listaTurma, Turma.TurmaNameComparator);
                }
                
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void listarAtivos(){
        try{
            ArrayList<Curso> lcurso= new ArrayList<Curso>();
            ArrayList<Nivel> lnivel= new ArrayList<Nivel>();
            
            ControladorDePersistencia con1 = new ControladorDePersistencia();
            lcurso = con1.carregaCurso();
            
            
            
            ControladorDePersistencia con2 = new ControladorDePersistencia();
            lnivel = con2.carregaNivel();
            
            
            
            DefaultTableModel tabelaP = (DefaultTableModel)
            jTable1.getModel();
            tabelaP.setNumRows(0);
            for (Turma t:listaTurma){
                Curso curso1 = new Curso();
                Nivel nivel1 = new Nivel();
                for (Curso c1: lcurso){
                    if(c1.getId() == t.getIdCurso()){
                        curso1.clonarCurso(c1);
                    }
                }
                for (Nivel n1:lnivel){
                    if(n1.getId() == t.getIdNivel()){
                        nivel1.clonarNivel(n1);
                    }
                }
                
                tabelaP.addRow(new Object[]{
                                t.getNome(),
                                nivel1.getNome(),
                                curso1.getNome(),
                                t.getVagas(),
                                });

            }
            
        } catch (Exception e){
        }
    } 
    
    public String formatar(String s){
        String saida = "";
        for (int i=0;i<s.length();i++){
            if(s.charAt(i) != ' '){
                saida += s.charAt(i);
            }
        }
        return saida;
    }
    
    public void setCurso(){
        curso = new Curso();
        try{
            ArrayList<Curso> lcurso = new ArrayList<Curso>();
            ControladorDePersistencia con1 = new ControladorDePersistencia();
            lcurso = con1.carregaCurso();
            for (Curso c1: lcurso){
                if(c1.getId() == turma.getIdCurso()){
                    curso.clonarCurso(c1);
                }
            }
            
        }
        catch(Exception ex){
            
        }
    }
    
    public void setNivel(){
        nivel = new Nivel();
        try{
            ArrayList<Nivel> lnivel= new ArrayList<Nivel>();
            ControladorDePersistencia con1 = new ControladorDePersistencia();
            lnivel = con1.carregaNivel();
            for (Nivel n1:lnivel){
                if(n1.getId() == turma.getIdNivel()){
                    nivel.clonarNivel(n1);
                }
            }
            
        }
        catch(Exception ex){
            
        }
    }
    
    public void setFuncionario(){
       funcionario = new Funcionario();
        try{
            ArrayList<Funcionario> lfuncionario= new ArrayList<Funcionario>();
            ControladorDePersistencia con1 = new ControladorDePersistencia();
            lfuncionario = con1.carregaFuncionario();
            for (Funcionario f1:lfuncionario){
                if(f1.getTipo() == 1){
                    if(f1.getEmail().equals(turma.getEmailProfessor())){
                        funcionario.clonarFuncionario(f1);
                    }
                }
            }
            
        }
        catch(Exception ex){
            
        }
    }
    
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
            java.util.logging.Logger.getLogger(ConsultarTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarTurma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}