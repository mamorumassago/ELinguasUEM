/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

/**
 *
 * @author Mamoru
 */
public class Matricula {
    
    private int id;
    private int idAluno;
    private int idTurma;
    private int ano;
    private int status;

    public Matricula() {
    }

    public Matricula(int id, int idAluno, int idTurma, int ano, int status) {
        this.id = id;
        this.idAluno = idAluno;
        this.idTurma = idTurma;
        this.ano = ano;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public int getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(int idTurma) {
        this.idTurma = idTurma;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    public void clonarMatricula(Matricula m){
        this.id = m.getId();
        this.idAluno = m.getIdAluno();
        this.idTurma = m.getIdTurma();
        this.ano = m.getAno();
        this.status = m.getStatus();
    }
    
}
