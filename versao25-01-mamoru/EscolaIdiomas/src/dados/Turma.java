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
public class Turma {
    int id;
    String nome;
    int idCurso;
    int idNivel;
    String emailProfessor;
    int vagas;
    int nalunos;
    String horarios;
    int status;

    public Turma() {
    }

    public Turma(int id, String nome, int idCurso, int idNivel, String emailProfessor, int vagas,int nalunos , String horarios, int status) {
        this.id = id;
        this.nome = nome;
        this.idCurso = idCurso;
        this.idNivel = idNivel;
        this.emailProfessor = emailProfessor;
        this.vagas = vagas;
        this.nalunos = nalunos;
        this.horarios = horarios;
        this.status = status;
    }

    public Turma(String nome, int idCurso, int idNivel, String emailProfessor, int vagas, int nalunos,String horarios) {
        this.id = -1;
        this.nome = nome;
        this.idCurso = idCurso;
        this.idNivel = idNivel;
        this.emailProfessor = emailProfessor;
        this.vagas = vagas;
        this.nalunos = nalunos;
        this.horarios = horarios;
        this.status = 1;
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

    

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(int idNivel) {
        this.idNivel = idNivel;
    }

    public String getEmailProfessor() {
        return emailProfessor;
    }

    public void setEmailProfessor(String emailProfessor) {
        this.emailProfessor = emailProfessor;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public int getNalunos() {
        return nalunos;
    }

    public void setNalunos(int nalunos) {
        this.nalunos = nalunos;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    public void clonarTurma(Turma t){
        this.id = t.getId();
        this.nome = t.getNome();
        this.idCurso = t.getIdCurso();
        this.idNivel = t.getIdNivel();
        this.emailProfessor = t.getEmailProfessor();
        this.vagas = t.getVagas();
        this.nalunos = t.getNalunos();
        this.horarios = t.getHorarios();
        this.status = t.getStatus();
    }
    
    public static Comparator<Turma> TurmaNameComparator = new Comparator<Turma>() {

	public int compare(Turma t1, Turma t2) {
	   String turma1 = t1.getNome().toUpperCase();
	   String turma2 = t2.getNome().toUpperCase();

	   //ascending order
	   return turma1.compareTo(turma2);

	   //descending order
	   //return StudentName2.compareTo(StudentName1);
    }};
}
    

