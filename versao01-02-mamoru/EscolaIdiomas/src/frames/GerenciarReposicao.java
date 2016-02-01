/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package frames;

import dados.*;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.ControladorDePersistencia;

/**
 *
 * @author Guilherme
 */
public class GerenciarReposicao extends javax.swing.JFrame {

    ArrayList<Aluno> listaAluno;  
    ArrayList<Turma> listaTurma;
    ArrayList<Curso> listaCurso;
    ArrayList<Matricula> listaMatricula;
    ArrayList<Reposicao> listaReposicao;
    ArrayList<Reposicao> listaReposicaoAtivas;
    
    int selecionado;
    
    /**
     * Creates new form GerenciarPresenca
     */
    public GerenciarReposicao() {
        initComponents();
        this.setJCBoxCurso();
        this.setJCBoxTurma();
        this.reload();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Gerenciar Reposição");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Aluno", "Turma", "Nível", "Curso", "Data Reposto", "Data Reposicao"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Inserir Reposição");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Alterar Reposição");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Excluir Reposição");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel7.setText("Aluno: ");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Turma:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {""}));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] {""  }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Curso:");

        jButton6.setText("Buscar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton6)
                        .addComponent(jLabel3)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        InserirReposicao f = new InserirReposicao(this);
        f.setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try{
            int posicaoSelecionado = this.jTable1.getSelectedRow();
            if(posicaoSelecionado < 0){
                JOptionPane.showMessageDialog(this,"Nenhuma reposicao selecionada.","Error",JOptionPane.ERROR_MESSAGE);
                return;
            }
            Reposicao r1 = new Reposicao();
            r1.clonarReposicao(listaReposicaoAtivas.get(posicaoSelecionado));
            AlterarReposicao ar = new AlterarReposicao(this, r1);
            this.setEnabled(false);
            ar.setVisible(true);
        }
        catch(Exception ex){

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try{
            int posicaoSelecionado = this.jTable1.getSelectedRow();
            if(posicaoSelecionado < 0){
                JOptionPane.showMessageDialog(this,"Nenhuma reposicao selecionada.","Error",JOptionPane.ERROR_MESSAGE);
                return;
            }
            Reposicao r1 = new Reposicao();
            r1.clonarReposicao(listaReposicaoAtivas.get(posicaoSelecionado));
            Excluir exc = new Excluir(this, r1);
            this.setEnabled(false);
            exc.setVisible(true);
        }
        catch(Exception ex){

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    public void reload(){
        this.carregaReposicao();
        this.listarAtivos();
    }
    
    private void carregaReposicao(){
        listaReposicaoAtivas = new ArrayList<>();
        listaReposicao = new ArrayList<>();
        try{
            ControladorDePersistencia con = new ControladorDePersistencia();            
            ArrayList<Reposicao> lstR = con.carregaReposicao();
            for (Reposicao r:lstR){
                if (r.getStatus() == 1){
                    //listaAlunoAtivo.add(a);
                    this.listaReposicao.add(r);
                    this.listaReposicaoAtivas.add(r);
                }
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void listarAtivos(){
        try{
            DefaultTableModel tabelaP = (DefaultTableModel)
            jTable1.getModel();
            tabelaP.setNumRows(0);
            for (Reposicao r:listaReposicaoAtivas){
                tabelaP.addRow(new Object[]{
                                getAluno(getMatricula(r.getIdmatricula()).getIdAluno()).getNome(),
                                getTurma(getMatricula(r.getIdmatricula()).getIdTurma()).getNome(),
                                getNivel(getTurma(getMatricula(r.getIdmatricula()).getIdTurma()).getIdNivel()).getNome(),
                                getCurso(getTurma(getMatricula(r.getIdmatricula()).getIdTurma()).getIdCurso()).getNome(),
                                r.getDatareposto(),
                                r.getDatareposicao()
                                });

            }
            
        } catch (Exception e){
        }
    }
    
    public Matricula getMatricula(int id){
        listaMatricula = new ArrayList<Matricula>();
        try{
            ControladorDePersistencia con = new ControladorDePersistencia();
            listaMatricula = con.carregaMatricula();
        }
        catch(Exception ex){
        }
        Matricula m1 = new Matricula();
        for (Matricula m:listaMatricula){
            if(m.getId()==id){
                m1.clonarMatricula(m);
                return m1;
            }
        }
        return m1;
    }
    
    public Nivel getNivel(int id){
        Nivel n1 = new Nivel();
        ArrayList<Nivel> listaNivel;
        try{
            ControladorDePersistencia con = new ControladorDePersistencia();
            listaNivel = con.carregaNivel();
            for (Nivel n:listaNivel){
                if(n.getId()==id){
                    n1.clonarNivel(n);
                    return n1;
                }
            }
        }
        catch(Exception ex){
        }
        return n1;
    }
    
    public Turma getTurma(int id){
        listaTurma = new ArrayList<Turma>();
        try{
            ControladorDePersistencia con = new ControladorDePersistencia();
            listaTurma= con.carregaTurma();
        }
        catch(Exception ex){
        }
        Turma t1 = new Turma();
        for (Turma t:listaTurma){
            if(t.getId()==id){
                t1.clonarTurma(t);
                return t1;
            }
        }
        return t1;
    }
    
    public Curso getCurso(int id){
        listaCurso = new ArrayList<Curso>();
        try{
            ControladorDePersistencia con = new ControladorDePersistencia();
            listaCurso = con.carregaCurso();
        }
        catch(Exception ex){
        }
        Curso c1 = new Curso();
        for (Curso c:listaCurso){
            if(c.getId()==id){
                c1.clonarCurso(c);
                return c1;
            }
        }
        return c1;
    }
    
    public Aluno getAluno(int id){
        listaAluno = new ArrayList<Aluno>();
        try{
            ControladorDePersistencia con = new ControladorDePersistencia();
            listaAluno = con.carregaAluno();
        }
        catch(Exception ex){
        }
        Aluno a1 = new Aluno();
        for (Aluno a:listaAluno){
            if(a.getId()==id){
                a1.clonarAluno(a);
                return a1;
            }
        }
        return a1;
    }
    
    public void setJCBoxTurma(){
        Vector vetor = new Vector();   
        listaTurma = new ArrayList<Turma>();
        try{
            ControladorDePersistencia con = new ControladorDePersistencia();
            listaTurma = con.carregaTurma();
        }
        catch(Exception ex){            
        }
        vetor.add("");
        for(int i=0;i<listaTurma.size();i++){
            Turma t = listaTurma.get(i);
            vetor.add(t.getNome());            
        }         
        DefaultComboBoxModel model = new DefaultComboBoxModel(vetor);  
        jComboBox1.setModel(model);  
    }
    
    public void setJCBoxCurso(){
        Vector vetor = new Vector();   
        listaCurso = new ArrayList<Curso>();
        try{
            ControladorDePersistencia con = new ControladorDePersistencia();
            listaCurso = con.carregaCurso();
        }
        catch(Exception ex){            
        }
        vetor.add("");
        for(int i=0;i<listaCurso.size();i++){
            Curso c = listaCurso.get(i);
            vetor.add(c.getNome());            
        }         
        DefaultComboBoxModel model = new DefaultComboBoxModel(vetor);  
        jComboBox2.setModel(model);  
    }
    
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if(formatar(jTextField1.getText().toString()).equals("")){
            if(jComboBox1.getSelectedIndex() == 0){
                if(jComboBox2.getSelectedIndex() == 0){
                    reload();
                    return;
                    
                }
            }
        }
        buscar();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    public void buscar(){
        this.carregaBusca();
        this.listarAtivos();
    }
    
    public void carregaBusca(){
        String nomeAluno = formatar(jTextField1.getText().toString());        
        int tSelect = jComboBox1.getSelectedIndex();
        int cSelect = jComboBox2.getSelectedIndex();
        
        Turma turmaq = new Turma();
        Curso cursoq = new Curso();
        if(tSelect != 0){
           turmaq.clonarTurma(listaTurma.get(tSelect-1));
        }
        if(cSelect != 0){
            cursoq.clonarCurso(listaCurso.get(cSelect-1));
        }
        
        listaAluno = new ArrayList<Aluno>();
        
        ArrayList<Curso> lcurso= new ArrayList<Curso>();
        ArrayList<Nivel> lnivel= new ArrayList<Nivel>();
        ArrayList<Turma> lturma = new ArrayList<Turma>();
        listaMatricula = new ArrayList<Matricula>();
        
        listaReposicao = new ArrayList<>();
        listaReposicaoAtivas = new ArrayList<>();
        
        try{
            ControladorDePersistencia con1 = new ControladorDePersistencia();
            lnivel = con1.carregaNivel();

            ControladorDePersistencia con2 = new ControladorDePersistencia();
            listaMatricula = con2.carregaMatricula();
            
            ControladorDePersistencia con3 = new ControladorDePersistencia();
            listaAluno= con3.carregaAluno();

            ControladorDePersistencia con4 = new ControladorDePersistencia();
            lturma = con4.carregaTurma();
            
            ControladorDePersistencia con5 = new ControladorDePersistencia();
            lcurso = con5.carregaCurso();
            
            ControladorDePersistencia con6 = new ControladorDePersistencia();
            listaReposicao = con6.carregaReposicao();
          
            for(Reposicao r:listaReposicao){
                if(formatar(getAluno(getMatricula(r.getIdmatricula()).getIdAluno()).getNome()).toUpperCase().contains(formatar(nomeAluno.toUpperCase()))){
                    if(tSelect != 0 || cSelect != 0){
                        if(tSelect != 0){
                            if(cSelect != 0){
                                if(getMatricula(r.getIdmatricula()).getIdTurma() == turmaq.getId()){
                                    if(turmaq.getIdCurso() == cursoq.getId()){
                                        Reposicao r1 = new Reposicao();
                                        r1.clonarReposicao(r);
                                        listaReposicaoAtivas.add(r1);
                                    }
                                }
                            }
                            else{
                                if(getMatricula(r.getIdmatricula()).getIdTurma() == turmaq.getId()){
                                    Reposicao r1 = new Reposicao();
                                        r1.clonarReposicao(r);
                                        listaReposicaoAtivas.add(r1);                                        
                                }
                            }
                        }
                        else{
                            for(Turma tk :lturma){
                                if(getMatricula(r.getIdmatricula()).getIdTurma() == tk.getId()){
                                    if(tk.getIdCurso() == cursoq.getId()){
                                        Reposicao r1 = new Reposicao();
                                        r1.clonarReposicao(r);
                                        listaReposicaoAtivas.add(r1);     
                                    }
                                }
                            }
                        }
                    }
                    else{
                        Reposicao r1 = new Reposicao();
                        r1.clonarReposicao(r);
                        listaReposicaoAtivas.add(r1);
                    }                     
                     
                }
            }
        }
        catch(Exception ex){
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
            java.util.logging.Logger.getLogger(GerenciarReposicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarReposicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarReposicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarReposicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciarReposicao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}