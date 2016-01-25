/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.util.Comparator;

/**
 *
 * @author Mamoru
 */
public class Curso {
    
    private int id;
    private String nome;
    private double carga;
    private double mensalidade;
    private int status;

    public Curso() {
        id = -1;
    }

    public Curso(int id, String nome, double carga, double mensalidade, int status) {
        this.id = id;
        this.nome = nome;
        this.carga = carga;
        this.mensalidade = mensalidade;
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

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    public static Comparator<Curso> CursoNameComparator = new Comparator<Curso>() {

	public int compare(Curso c1, Curso c2) {
	   String curso1 = c1.getNome().toUpperCase();
	   String curso2 = c2.getNome().toUpperCase();

	   //ascending order
	   return curso1.compareTo(curso2);

	   //descending order
	   //return StudentName2.compareTo(StudentName1);
    }};
    
    
    public void clonarCurso(Curso c){
        this.id = c.getId();
        this.nome = c.getNome();
        this.carga = c.getCarga();
        this.mensalidade = c.getMensalidade();
        this.status = c.getStatus();
    }
    
}
