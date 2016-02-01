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
public class Mensalidade {
    
    private int id;
    private int idAluno;
    private int idTurma;
    private int parcelasPagas;
    private double valorParcela;
    private int status;

    public Mensalidade() {
    }

    public Mensalidade(int id, int idAluno, int idTurma, int parcelasPagas, double valorParcela, int status) {
        this.id = id;
        this.idAluno = idAluno;
        this.idTurma = idTurma;
        this.parcelasPagas = parcelasPagas;
        this.valorParcela = valorParcela;
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

    public int getParcelasPagas() {
        return parcelasPagas;
    }

    public void setParcelasPagas(int parcelasPagas) {
        this.parcelasPagas = parcelasPagas;
    }

    public double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(double valorParcela) {
        this.valorParcela = valorParcela;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
}
