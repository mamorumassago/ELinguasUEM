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
public class Funcionario {
    
    private int id;
    private String nome;
    private String endereco;
    private String telefone;
    private double salario;
    private String email;
    private String senha;
    private int tipo;
    private int status;

    public Funcionario() {
        id = -1;
    }

    public Funcionario(String nome, String endereco, String telefone, double salario, String email, String senha, int tipo, int status) {
        this.id = -1;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.salario = salario;
        this.email = email;
        this.senha = senha;
        this.tipo = tipo;
        this.status = status;
    }

    public Funcionario(int id, String nome, String endereco, String telefone, double salario, String email, String senha, int tipo, int status) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.salario = salario;
        this.email = email;
        this.senha = senha;
        this.tipo = tipo;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    public void clonarFuncionario(Funcionario f){
        id = f.getId();
        nome = f.getNome();
        endereco = f.getEndereco();
        telefone = f.getTelefone();
        salario = f.getSalario();
        email = f.getEmail();
        senha = f.getSenha();
        tipo = f.getTipo();
        status = f.getStatus();
    }
    
    public static Comparator<Funcionario> FuncNameComparator = new Comparator<Funcionario>() {

	public int compare(Funcionario f1, Funcionario f2) {
	   String func1 = f1.getNome().toUpperCase();
	   String func2 = f2.getNome().toUpperCase();

	   //ascending order
	   return func1.compareTo(func2);

	   //descending order
	   //return StudentName2.compareTo(StudentName1);
    }};
}
