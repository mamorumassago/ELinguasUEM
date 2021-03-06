/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package frames;

import dados.Aluno;
import dados.Curso;
import dados.Matricula;
import dados.Nivel;
import dados.Notas;
import dados.Turma;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.ControladorDePersistencia;

/**
 *
 * @author Guilherme
 */
public class GerenciarNotas extends javax.swing.JFrame {

    //ArrayList<Aluno> listaAlunoAtivo;
    ArrayList<Aluno> listaAluno;
    
    ArrayList<Turma> listaTurma;
    ArrayList<Curso> listaCurso;
    ArrayList<Nivel> listaNivel;
    ArrayList<Matricula> listaMatricula;
    ArrayList<Matricula> listaMatriculaAtiva;
    
    /**
     * Creates new form GerenciarNotas
     */
    public GerenciarNotas() {
        initComponents();
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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Gerenciar Notas");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Aluno", "Turma", "Nível", "Curso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Aluno:");

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Turma:");

        jLabel4.setText("Nível:");

        jLabel5.setText("Curso:");

        jButton3.setText("Alterar Notas");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Exibir Notas");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
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
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
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
        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try{
                int posicaoSelecionado = this.jTable1.getSelectedRow();
                if(posicaoSelecionado < 0){
                    JOptionPane.showMessageDialog(this,"Nenhum aluno selecionado.","Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                Matricula m1 = new Matricula();
                Aluno a1 = new Aluno();
                Curso c1 = new Curso();
                Nivel n1 = new Nivel();
                Turma t1 = new Turma();
                
                m1.clonarMatricula(listaMatricula.get(posicaoSelecionado));
                a1.clonarAluno(listaAluno.get(posicaoSelecionado));
                c1.clonarCurso(listaCurso.get(posicaoSelecionado));
                n1.clonarNivel(listaNivel.get(posicaoSelecionado));
                t1.clonarTurma(listaTurma.get(posicaoSelecionado));
                
                Notas nt = new Notas();
                ControladorDePersistencia con = new ControladorDePersistencia();
                ArrayList<Notas> lstNotas = con.carregaNota();
                
                for (Notas n: lstNotas){
                    if (n.getIdmatricula()== m1.getId()){
                        nt = n;
                        break;
                    }
                }
                
                AlterarNotas f = new AlterarNotas(this,m1,a1,c1,n1,t1,nt);
                f.setVisible(true);
                this.setEnabled(false);
        }
        catch(Exception e){
            
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        buscar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try{
            String message;
            int posicaoSelecionado = this.jTable1.getSelectedRow();
            if(posicaoSelecionado < 0){
                JOptionPane.showMessageDialog(this,"Nenhum aluno selecionado.","Error",JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            Matricula m1 = new Matricula();
            Aluno a1 = new Aluno();
            Turma t1 = new Turma();
            
            m1.clonarMatricula(listaMatricula.get(posicaoSelecionado));
            a1.clonarAluno(listaAluno.get(posicaoSelecionado));
            t1.clonarTurma(listaTurma.get(posicaoSelecionado));
            
            Notas nt = new Notas();
            ControladorDePersistencia con = new ControladorDePersistencia();
            ArrayList<Notas> lstNotas = con.carregaNota();
            
            for (Notas n: lstNotas){
                if (n.getIdmatricula()== m1.getId()){
                    nt = n;
                    break;
                }
            }
            
            message = "Aluno(a): " + a1.getNome() +
                    "\nTurma: " + t1.getNome() +
                    "\n\nNota 1: " + nt.getNota1() + 
                    "\nNota 2: " + nt.getNota2() +
                    "\nNota 3: " + nt.getNota3() +
                    "\nNota 4: " + nt.getNota4();
            
            JOptionPane.showMessageDialog(this,message);
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    public void buscar(){
        String nomeAluno = formatar(jTextField1.getText().toString());
        String nomeCurso = formatar(jTextField4.getText().toString());
        String nomeNivel = formatar(jTextField3.getText().toString());
        String nomeTurma = formatar(jTextField2.getText().toString());
        
        listaMatriculaAtiva = new ArrayList<Matricula>();
        listaMatricula = new ArrayList<>();
        listaTurma = new ArrayList<>();
        //listaAlunoAtivo = new ArrayList<>();
        listaAluno = new ArrayList<>();
        listaCurso = new ArrayList<>();
        listaNivel = new ArrayList<>();
        
        try{
            ControladorDePersistencia con1 = new ControladorDePersistencia();
            ControladorDePersistencia con2 = new ControladorDePersistencia();
            ControladorDePersistencia con3 = new ControladorDePersistencia();
            ControladorDePersistencia con4 = new ControladorDePersistencia();
            ControladorDePersistencia con5 = new ControladorDePersistencia();
            
            ArrayList<Matricula> lstM = con1.carregaMatricula();
            ArrayList<Turma> lstT = con2.carregaTurma();
            ArrayList<Nivel> lstN = con3.carregaNivel();
            ArrayList<Curso> lstC = con4.carregaCurso();
            ArrayList<Aluno> lstA = con5.carregaAluno();
            
            for (Matricula m: lstM){
                if (m.getStatus() == 1){
                    listaMatriculaAtiva.add(m);
                }
            }
            
            Aluno aluno = null;
            Turma turma = null;
            Nivel nivel = null;
            Curso curso = null;
            boolean achou;
            
            DefaultTableModel tabelaP = (DefaultTableModel)
            jTable1.getModel();
            tabelaP.setNumRows(0);
            for (Matricula m:listaMatriculaAtiva){
                achou = false;
                for (Aluno a: lstA){
                    if (m.getIdAluno() == a.getId()){
                        for (Turma t: lstT){
                            if (m.getIdTurma() == t.getId()){
                                if (formatar(a.getNome().toUpperCase()).contains(formatar(nomeAluno.toUpperCase())) && formatar(t.getNome().toUpperCase()).contains(formatar(nomeTurma.toUpperCase()))){
                                    aluno = a;
                                    turma = t;
                                    achou = true;
                                }
                                break;
                            }
                        }
                        break;
                    }
                    if (achou){
                        break;
                    }
                }
                if (!achou){
                    continue;
                }
                achou = false;
                
                for (Nivel n: lstN){
                    if (n.getId() == turma.getIdNivel()){
                        if (formatar(n.getNome().toUpperCase()).contains(formatar(nomeNivel.toUpperCase()))){
                            nivel = n;
                            achou = true;
                        }
                        break;
                    }
                }
                if (!achou){
                    continue;
                }
                achou = false;
                
                for (Curso c: lstC){
                    if (c.getId() == turma.getIdCurso()){
                        if (formatar(c.getNome().toUpperCase()).contains(formatar(nomeCurso.toUpperCase()))){
                            curso = c;
                            achou = true;
                        }
                        break;
                    }
                }
                if (achou){
                    this.listaMatricula.add(m);
                    this.listaAluno.add(aluno);
                    this.listaCurso.add(curso);
                    this.listaNivel.add(nivel);
                    this.listaTurma.add(turma);
                    tabelaP.addRow(new Object[]{
                                aluno.getNome(),
                                turma.getNome(),
                                nivel.getNome(),
                                curso.getNome(),
                                });
                }
            }
        } catch(Exception e){
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
    
    public void reload(){
        this.carregaCurso();
        this.listarAtivos();
    }
    
    private void carregaCurso(){
        listaMatriculaAtiva = new ArrayList<>();
        listaMatricula = new ArrayList<>();
        listaTurma = new ArrayList<>();
        listaAluno = new ArrayList<>();
        listaCurso = new ArrayList<>();
        listaNivel = new ArrayList<>();
        
        try{
            ControladorDePersistencia con = new ControladorDePersistencia();
            ArrayList<Matricula> lstM = con.carregaMatricula();
            for (Matricula m: lstM){
                if (m.getStatus() == 1){
                    listaMatriculaAtiva.add(m);
                }
            }
            
            ControladorDePersistencia con1 = new ControladorDePersistencia();
            ControladorDePersistencia con2 = new ControladorDePersistencia();
            ControladorDePersistencia con3 = new ControladorDePersistencia();
            ControladorDePersistencia con4 = new ControladorDePersistencia();
            
            ArrayList<Turma> lstT = con1.carregaTurma();
            ArrayList<Nivel> lstN = con2.carregaNivel();
            ArrayList<Curso> lstC = con3.carregaCurso();
            ArrayList<Aluno> lstA = con4.carregaAluno();
            
            Aluno aluno = null;
            Turma turma = null;
            Nivel nivel = null;
            Curso curso = null;
            boolean achou;
            for (Matricula m:listaMatriculaAtiva){
                achou = false;
                for (Aluno a: lstA){
                    if (m.getIdAluno() == a.getId()){
                        for (Turma t: lstT){
                            if (m.getIdTurma() == t.getId()){
                                aluno = a;
                                turma = t;
                                achou = true;
                                break;
                            }
                        }
                        break;
                    }
                    if (achou){
                        break;
                    }
                }
                if (!achou){
                    continue;
                }
                achou = false;
                
                for (Nivel n: lstN){
                    if (n.getId() == turma.getIdNivel()){
                        nivel = n;
                        achou = true;
                        break;
                    }
                }
                if (!achou){
                    continue;
                }
                achou = false;
                
                for (Curso c: lstC){
                    if (c.getId() == turma.getIdCurso()){
                        curso = c;
                        achou = true;
                        break;
                    }
                }
                if (achou){
                    this.listaMatricula.add(m);
                    this.listaAluno.add(aluno);
                    this.listaCurso.add(curso);
                    this.listaNivel.add(nivel);
                    this.listaTurma.add(turma);
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
            for (int i = 0; i < listaMatricula.size(); i++){
                tabelaP.addRow(new Object[]{
                        listaAluno.get(i).getNome(),
                        listaTurma.get(i).getNome(),
                        listaNivel.get(i).getNome(),
                        listaCurso.get(i).getNome(),
                        });

            }
            
        } catch (Exception e){
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
            java.util.logging.Logger.getLogger(GerenciarNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciarNotas().setVisible(true);
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
