/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.util.ArrayList;
import java.util.Comparator;
import persistencia.ControladorDePersistencia;

/**
 *
 * @author Mamoru
 */
public class Nivel {
    
    private int id;
    private String nome;
    private int idcurso;
    private String descricao;
    private int status;

    public Nivel() {
        id = -1;
    }

    public Nivel(int id, String nome, int id_curso, String descricao,int status) {
        this.id = id;
        this.nome = nome;
        this.idcurso = id_curso;
        this.descricao = descricao;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int id_curso) {
        this.idcurso = id_curso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    public static Comparator<Nivel> NivelNameComparator = new Comparator<Nivel>() {

	public int compare(Nivel n1, Nivel n2) {
	   String nivel1 = n1.getNome().toUpperCase();
	   String nivel2 = n2.getNome().toUpperCase();

	   //ascending order
	   return nivel1.compareTo(nivel2);

	   //descending order
	   //return StudentName2.compareTo(StudentName1);
    }};
    
    public String getNomeCurso(){
        String Nome = "";
        try{
            ControladorDePersistencia c = new ControladorDePersistencia();
            ArrayList<Curso> listC = c.carregaCurso();
            for (Curso cur: listC){
                if(cur.getId() == idcurso){
                    Nome = cur.getNome();
                }
            }
        }
        catch(Exception ex){
            
        }
        return Nome;
    }
    
    public Curso getCurso(){
        Curso curso = new Curso();
        try{
            ControladorDePersistencia c = new ControladorDePersistencia();
            ArrayList<Curso> listC = c.carregaCurso();
            for (Curso cur: listC){
                if(cur.getId() == idcurso){
                    curso.clonarCurso(cur);
                }
            }
        }
        catch(Exception ex){
            
        }
        return curso;
    }
    
    public void clonarNivel(Nivel n){
        this.id = n.getId();
        this.nome = n.getNome();
        this.idcurso = n.getIdcurso();
        this.descricao = n.getDescricao();
        this.status = n.getStatus();
    }
    
}
