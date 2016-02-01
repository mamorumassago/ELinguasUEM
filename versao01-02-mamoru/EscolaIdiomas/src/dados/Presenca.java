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
public class Presenca {
    
    private int id;
    private int idmatricula;
    private String data;
    private int status;

    public Presenca() {
    }

    public Presenca(int id, int idmatricula, String data, int status) {
        this.id = id;
        this.idmatricula = idmatricula;
        this.data = data;
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

    

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    public void clonarPresenca(Presenca p){
        id = p.getId();
        idmatricula = p.getIdmatricula();
        data = p.getData();
        status = p.getStatus();
    }
    
        
}
