/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package frames;

import dados.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.ControladorDePersistencia;

/**
 *
 * @author Guilherme
 */
public class GerenciarPresenca extends javax.swing.JFrame {

    
    ArrayList<Aluno> listaAluno;  
    ArrayList<Turma> listaTurma;
    ArrayList<Curso> listaCurso;
    ArrayList<Matricula> listaMatricula;
    ArrayList<Notas> listaNotas;
    ArrayList<Notas> listaNotasAtivas;
    
    ArrayList<Presenca> listaPresenca;
    int selecionado;
    
    MenuPrincipal mp;
    
    Presenca presenca;
    
    int fat;
    
    /**
     * Creates new form GerenciarPresenca
     */
    public GerenciarPresenca() {
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
        jTextField1 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Gerenciar Presença");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Aluno", "Turma", "Nivel", "Curso", "Faltas"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Inserir Presença");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Alterar Presença");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });

        jLabel6.setText("Idade:");

        jLabel3.setText("Turma:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {""}));

        jLabel5.setText("Curso:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] {""  }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton5.setText("Buscar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel7.setText("Aluno: ");

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
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton5)
                        .addComponent(jLabel3)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
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
        try{
            int posicaoSelecionado = this.jTable1.getSelectedRow();
            if(posicaoSelecionado < 0){
                JOptionPane.showMessageDialog(this,"Nenhum aluno selecionado.","Error",JOptionPane.ERROR_MESSAGE);
                return;
            }
            presenca = new Presenca();
            presenca.setId(-1);
            presenca.setIdmatricula(listaNotasAtivas.get(posicaoSelecionado).getIdmatricula());
            presenca.setStatus(1);
            InserirPresenca f = new InserirPresenca(this,presenca,1);
            f.setVisible(true);
            this.setEnabled(false);
        }
        catch(Exception ex){

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try{
            int posicaoSelecionado = this.jTable1.getSelectedRow();
            if(posicaoSelecionado < 0){
                JOptionPane.showMessageDialog(this,"Nenhum aluno selecionado.","Error",JOptionPane.ERROR_MESSAGE);
                return;
            }
            presenca = new Presenca();
            
            presenca.setId(-1);
            presenca.setIdmatricula(listaNotasAtivas.get(posicaoSelecionado).getIdmatricula());
            presenca.setStatus(1);
            InserirPresenca f = new InserirPresenca(this,presenca,2);
            f.setVisible(true);
            this.setEnabled(false);
        }
        catch(Exception ex){

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        // TODO add your handling code here:
        String caracteres="0987654321";
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(formatar(jTextField1.getText().toString()).equals("")){
            if(jComboBox1.getSelectedIndex() == 0){
                if(jComboBox2.getSelectedIndex() == 0){
                    if(formatar(jTextField5.getText().toString()).equals("")){
                        reload();
                        return;
                    }
                }
            }
        }
        buscar();

    }//GEN-LAST:event_jButton5ActionPerformed

    public void setPresenca(Presenca p){
        presenca.clonarPresenca(p);
        if(presenca.getStatus() == 0){
            try{
                ControladorDePersistencia con = new ControladorDePersistencia();
                Notas n1 = new Notas();
                int posicaoSelecionado = this.jTable1.getSelectedRow();
                n1.clonarNotas(listaNotasAtivas.get(posicaoSelecionado));
                n1.setFaltas(n1.getFaltas()+1);
                con.alteraFalta(n1);
                this.reload();
            }
            catch(Exception ex){
                
            }
        }
    }
    
    public void atualizaPresenca(Presenca p, int fat){
        presenca = new Presenca();
        presenca.clonarPresenca(p);
        if(fat != 0){
            try{
                ControladorDePersistencia con = new ControladorDePersistencia();
                Notas n1 = new Notas();
                int posicaoSelecionado = this.jTable1.getSelectedRow();
                n1.clonarNotas(listaNotasAtivas.get(posicaoSelecionado));
                n1.setFaltas(n1.getFaltas()+fat);
                con.alteraFalta(n1);
                this.reload();
            }
            catch(Exception ex){
                
            }
        }
    }
    
    public void buscar(){
        this.carregaBusca();
        this.listarAtivos();
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
        
        String buscaIdade = formatar(jTextField5.getText().toString());
        listaAluno = new ArrayList<Aluno>();
        
        ArrayList<Curso> lcurso= new ArrayList<Curso>();
        ArrayList<Nivel> lnivel= new ArrayList<Nivel>();
        ArrayList<Turma> lturma = new ArrayList<Turma>();
        listaMatricula = new ArrayList<Matricula>();
        
        listaNotas = new ArrayList<Notas>();
        listaNotasAtivas = new ArrayList<Notas>();
        
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
            listaNotas = con6.carregaNota();
          
            for(Notas n:listaNotas){
                if(formatar(getAluno(getMatricula(n.getId()).getIdAluno()).getNome()).toUpperCase().contains(formatar(nomeAluno.toUpperCase()))){
                    if(formatar((""+getAluno(getMatricula(n.getId()).getIdAluno()).getIdade()).toUpperCase()).contains(formatar(buscaIdade.toUpperCase()))){
                        if(tSelect != 0 || cSelect != 0){
                            if(tSelect != 0){
                                if(cSelect != 0){
                                    if(getMatricula(n.getId()).getIdTurma() == turmaq.getId()){
                                        if(turmaq.getIdCurso() == cursoq.getId()){
                                            Notas not = new Notas();
                                            not.clonarNotas(n);
                                            listaNotasAtivas.add(not);
                                        }
                                    }
                                }
                                else{
                                    if(getMatricula(n.getId()).getIdTurma() == turmaq.getId()){
                                        Notas not = new Notas();
                                        not.clonarNotas(n);
                                        listaNotasAtivas.add(not);                                        
                                    }
                                }
                            }
                            else{
                                for(Turma tk :lturma){
                                    if(getMatricula(n.getId()).getIdTurma() == tk.getId()){
                                        if(tk.getIdCurso() == cursoq.getId()){
                                            Notas not = new Notas();
                                            not.clonarNotas(n);
                                            listaNotasAtivas.add(not);     
                                        }
                                    }
                                }
                            }
                        }
                        else{
                            Notas not = new Notas();
                            not.clonarNotas(n);
                            listaNotasAtivas.add(not);
                        }                     
                    }  
                }
            }
        }
        catch(Exception ex){
        }
    }
    
    public void reload(){
        this.carregaNotas();
        this.listarAtivos();
    }
    
    private void carregaNotas(){
        listaNotasAtivas = new ArrayList<Notas>();
        listaNotas = new ArrayList<Notas>();
        try{
            ControladorDePersistencia con = new ControladorDePersistencia();            
            ArrayList<Notas> lstN = con.carregaNota();   
            for (Notas n: lstN){
                if (n.getStatus() == 1){
                    //listaAlunoAtivo.add(a);
                    this.listaNotas.add(n);
                    this.listaNotasAtivas.add(n);
                    //Collections.sort(listaAlunoAtivo, Aluno.AlunoNameComparator);
                    //Collections.sort(listaAluno, Aluno.AlunoNameComparator);
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
            for (Notas n:listaNotasAtivas){
                tabelaP.addRow(new Object[]{
                                getAluno(getMatricula(n.getIdmatricula()).getIdAluno()).getNome(),
                                getTurma(getMatricula(n.getIdmatricula()).getIdTurma()).getNome(),
                                getNivel(getTurma(getMatricula(n.getIdmatricula()).getIdTurma()).getIdNivel()).getNome(),
                                getCurso(getTurma(getMatricula(n.getIdmatricula()).getIdTurma()).getIdCurso()).getNome(),
                                n.getFaltas()
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
            java.util.logging.Logger.getLogger(GerenciarPresenca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarPresenca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarPresenca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarPresenca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciarPresenca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
