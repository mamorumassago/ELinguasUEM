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
public class Notas {
    
    private int id;
    private int idmatricula;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private int faltas;
    private int status;

    public Notas() {
    }

    public Notas(int id, int idmatricula, double nota1, double nota2, double nota3, double nota4, int faltas, int status) {
        this.id = id;
        this.idmatricula = idmatricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.faltas = faltas;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdmatricula() {
        return idmatricula;
    }

    public void setIdmatricula(int idmatricula) {
        this.idmatricula = idmatricula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    public void clonarNotas(Notas n){
        this.id = n.getId();
        this.idmatricula = n.getIdmatricula();
        this.nota1 = n.getNota1();
        this.nota2 = n.getNota2();
        this.nota3 = n.getNota3();
        this.nota4 = n.getNota4();
        this.faltas = n.getFaltas();
        this.status = n.getStatus();
    }
    
}
