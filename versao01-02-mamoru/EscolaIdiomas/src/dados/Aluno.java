/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.sql.Date;
import java.text.DateFormat;
import java.util.Comparator;



/**
 *
 * @author Mamoru
 */
public class Aluno {
    
    private int id;
    private String nome;
    private String rg;
    private String endereco;
    private String telefone;
    private Date nascimento;
    private int idade;
    private String pai;
    private String mae;
    private int status;

    public Aluno() {
        this.id = -1;
    }

    public Aluno(String nome, String rg, String endereco, String telefone, Date nascimento, int idade, String pai, String mae, int status) {
        this.id = -1;
        this.nome = nome;
        this.rg = rg;
        this.endereco = endereco;
        this.telefone = telefone;
        this.nascimento = nascimento;
        this.idade = idade;
        this.pai = pai;
        this.mae = mae;
        this.status = status;
    }

    public Aluno(int id, String nome, String rg, String endereco, String telefone, Date nascimento, int idade, String pai, String mae, int status) {
        this.id = id;
        this.nome = nome;
        this.rg = rg;
        this.endereco = endereco;
        this.telefone = telefone;
        this.nascimento = nascimento;
        this.idade = idade;
        this.pai = pai;
        this.mae = mae;
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public String getDataToString(){
        DateFormat format = DateFormat.getDateInstance(DateFormat.SHORT);
        //DateFormat format = DateFormat.getDateInstance(DateFormat.MEDIUM);
        String dt = format.format(nascimento);

        return dt;
    }
    
    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    public void clonarAluno(Aluno a){
        id = a.getId();
        nome = a.getNome();
        rg = a.getRg();
        endereco = a.getEndereco();
        telefone = a.getTelefone();
        nascimento = a.getNascimento();
        idade = a.getIdade();
        pai = a.getPai();
        mae = a.getMae();
        status = a.getStatus();
    }
    
    public static Comparator<Aluno> AlunoNameComparator = new Comparator<Aluno>() {

	public int compare(Aluno a1, Aluno a2) {
	   String aluno1 = a1.getNome().toUpperCase();
	   String aluno2 = a2.getNome().toUpperCase();

	   //ascending order
	   return aluno1.compareTo(aluno2);

	   //descending order
	   //return StudentName2.compareTo(StudentName1);
    }};
}
