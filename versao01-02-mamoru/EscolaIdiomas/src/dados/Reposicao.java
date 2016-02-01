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
public class Reposicao {
    
    private int id;
    private int idmatricula;
    private String datareposto;
    private String datareposicao;
    private int status;

    public Reposicao() {
    }

    public Reposicao(int id, int idmatricula, String datareposto, String datareposicao, int status) {
        this.id = id;
        this.idmatricula = idmatricula;
        this.datareposto = datareposto;
        this.datareposicao = datareposicao;
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

    public String getDatareposto() {
        return datareposto;
    }

    public void setDatareposto(String datareposto) {
        this.datareposto = datareposto;
    }

    public String getDatareposicao() {
        return datareposicao;
    }

    public void setDatareposicao(String datareposicao) {
        this.datareposicao = datareposicao;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    public void clonarReposicao(Reposicao r){
        this.id = r.getId();
        this.idmatricula =  r.getIdmatricula();
        this.datareposto = r.getDatareposto();
        this.datareposicao = r.getDatareposicao();
        this.status = r.getStatus();
    }
    
}
