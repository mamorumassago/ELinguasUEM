/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persistencia;

import dados.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Super
 */
public class ControladorDePersistencia {
    
    private Connection connection = null;
        
    public ControladorDePersistencia() throws SQLException {        
        // conecta com o banco de dados
        connection = Conexao.conecta();
    }

/*
Métodos de consulta, inserção, alteração e remoção são escritos aqui!
Todos usam a conexão connection (variável de conexão).   
    
*/

    public ArrayList<Funcionario> carregaFuncionario(){
        ArrayList<Funcionario> listaFuncionario = null;
        try{
            String query = "SELECT id, nome, endereco, telefone, salario, email, senha, tipo, status FROM funcionario WHERE status=1";
            
            //preparando para a consulta citada acima (O parentese antes do valor atribuido serve apenas para evitar erros)
            PreparedStatement statement = (com.mysql.jdbc.PreparedStatement)this.connection.prepareStatement(query);

            //obtendo os resultados (O parenteses antes do valor atribuido serve apenas para nÃ£o causar conflito entre os tipos)
            ResultSet rs = (com.mysql.jdbc.ResultSet)statement.executeQuery(query);

            //declarando variÃ¡veis para usar a seguir
            Funcionario func1 = null;
            String Nome, Endereco, Telefone, Email, Senha;
            int Id, Tipo, Status;
            double Salario;
            listaFuncionario = new ArrayList<Funcionario>();
            while(rs.next()){
                Id = rs.getInt("id");
                Nome = rs.getString("nome");
                Endereco = rs.getString("endereco");
                Telefone = rs.getString("telefone");
                Salario = rs.getDouble("salario");
                Email = rs.getString("email");
                Senha = rs.getString("senha");
                Tipo = rs.getInt("tipo");
                Status = rs.getInt("status");
                
                func1 = new Funcionario(Id, Nome, Endereco, Telefone, Salario, Email, Senha,Tipo,Status);
                listaFuncionario.add(func1);
                
            }

            statement.close();
            connection.close();
            return listaFuncionario;
         }
         catch(Exception ex){
             ex.printStackTrace();
             return listaFuncionario;
         }
     }
    
    public boolean cadastraFuncionario(Funcionario funcionario) throws Exception{
 
        try{
                
            String query = "INSERT INTO funcionario (nome, endereco, telefone, salario, email, senha, tipo, status)  VALUES (?,?,?,?,?,?,?,?)";
                
            
            PreparedStatement statement = 
                           this.connection.prepareStatement(query);
            

            statement.setString(1, funcionario.getNome());
            statement.setString(2, funcionario.getEndereco());
            statement.setString(3, funcionario.getTelefone());
            statement.setDouble(4, funcionario.getSalario());
            statement.setString(5, funcionario.getEmail());
            statement.setString(6, funcionario.getSenha());
            statement.setInt(7, funcionario.getTipo());
            statement.setInt(8, 1);
            
            statement.executeUpdate();
            
            statement.close();
            connection.close();
            return true;
        }
        catch(Exception ex){
            ex.printStackTrace();
            return false;
             
        }

     }
    
    public boolean alteraFuncionario(Funcionario funcionario){
            try{

                String query = "UPDATE funcionario SET nome=?, endereco=?, email=?, telefone=?, salario=?, tipo=? WHERE id=?";
                PreparedStatement statement = this.connection.prepareStatement(query);
                statement.setString(1, funcionario.getNome());
                statement.setString(2, funcionario.getEndereco());
                statement.setString(3, funcionario.getEmail());
                statement.setString(4, funcionario.getTelefone());
                statement.setDouble(5,funcionario.getSalario());
                statement.setInt(6,funcionario.getTipo());
                statement.setInt(7,funcionario.getId());

                //executando alteração
                statement.executeUpdate();

                statement.close();
                connection.close();
                return true;

            }
            catch(SQLException sqlex){
                sqlex.printStackTrace();
            }
            return false;
    }
    
    public boolean alteraSenha(Funcionario funcionario){
            try{
                String query = "UPDATE funcionario SET senha=?  WHERE email=?";
                PreparedStatement statement = this.connection.prepareStatement(query);
                statement.setString(1, funcionario.getSenha());
                statement.setString(2, funcionario.getEmail());

                //executando alteração
                statement.executeUpdate();

                statement.close();
                connection.close();
                return true;

            }
            catch(SQLException sqlex){
                sqlex.printStackTrace();
            }
            return false;
    }
    
    public boolean removeFuncionario(Funcionario funcionario){
            try{
                String query = "UPDATE funcionario SET status=0 WHERE email=?";
                PreparedStatement statement = this.connection.prepareStatement(query);

                statement.setString(1, funcionario.getEmail());

                //executando alteração
                statement.executeUpdate();

                statement.close();
                connection.close();
                return true;

            }
            catch(Exception ex){
                ex.printStackTrace();
            }
            return false;
    }
    
    
    
    
    
    public ArrayList<Curso> carregaCurso(){
        ArrayList<Curso> listaFuncioanrio = null;
        try{
            String query = "SELECT id, nome, carga, mensalidade, status FROM curso WHERE status=1";
            

            //preparando para a consulta citada acima (O parentese antes do valor atribuido serve apenas para evitar erros)
            PreparedStatement statement = (com.mysql.jdbc.PreparedStatement)this.connection.prepareStatement(query);

            //obtendo os resultados (O parenteses antes do valor atribuido serve apenas para nÃ£o causar conflito entre os tipos)
            ResultSet rs = (com.mysql.jdbc.ResultSet)statement.executeQuery(query);

            //declarando variÃ¡veis para usar a seguir
            Curso c1 = null;
            String Nome;
            int Status, Id;
            double Carga, Mensalidade;
            listaFuncioanrio = new ArrayList<Curso>();

            while(rs.next()){
                Id = rs.getInt("id");
                Nome = rs.getString("nome");
                Carga = rs.getDouble("carga");
                Mensalidade = rs.getDouble("mensalidade");
                Status = rs.getInt("status");
                
                c1 = new Curso(Id,Nome, Carga, Mensalidade, Status);
                listaFuncioanrio.add(c1);
                
            }

            statement.close();
            connection.close();
            return listaFuncioanrio;
         }
         catch(Exception ex){
             ex.printStackTrace();
             return listaFuncioanrio;
         }
     }
    
    public boolean cadastraCurso(Curso curso) throws Exception{
 
        try{
                
            String query = "INSERT INTO curso (nome, carga, mensalidade, status)  VALUES (?,?,?,?)";
                
            
            PreparedStatement statement = 
                           this.connection.prepareStatement(query);
            

            statement.setString(1, curso.getNome());
            statement.setDouble(2, curso.getCarga());
            statement.setDouble(3, curso.getMensalidade());
            statement.setInt(4, 1);
            
            statement.executeUpdate();
            
            statement.close();
            connection.close();
            return true;
        }
        catch(Exception ex){
            ex.printStackTrace();
            return false;
             
        }

     }
    
    public boolean alteraCurso(Curso curso){
            try{
                String query = "UPDATE curso SET nome=?, carga=?, mensalidade=? WHERE id=?";
                PreparedStatement statement = this.connection.prepareStatement(query);
                statement.setString(1, curso.getNome());
                statement.setDouble(2, curso.getCarga());
                statement.setDouble(3, curso.getMensalidade());
                statement.setInt(4, curso.getId());

                //executando alteração
                statement.executeUpdate();

                statement.close();
                connection.close();
                return true;

            }
            catch(SQLException sqlex){
                sqlex.printStackTrace();
            }
            return false;
    }
           
    public boolean removeCurso(Curso curso){
            try{
                String query = "UPDATE curso SET status=0 WHERE id=?";
                PreparedStatement statement = this.connection.prepareStatement(query);

                statement.setInt(1, curso.getId());

                //executando alteração
                statement.executeUpdate();

                statement.close();
                connection.close();
                return true;

            }
            catch(Exception ex){
                ex.printStackTrace();
            }
            return false;
    }
    
    
    
    
    
    
    public ArrayList<Nivel> carregaNivel(){
        ArrayList<Nivel> listaNivel = null;
        try{
            String query = "SELECT id, nome, idcurso, descricao, status FROM nivel WHERE status=1";
            

            //preparando para a consulta citada acima (O parentese antes do valor atribuido serve apenas para evitar erros)
            PreparedStatement statement = (com.mysql.jdbc.PreparedStatement)this.connection.prepareStatement(query);

            //obtendo os resultados (O parenteses antes do valor atribuido serve apenas para nÃ£o causar conflito entre os tipos)
            ResultSet rs = (com.mysql.jdbc.ResultSet)statement.executeQuery(query);

            //declarando variÃ¡veis para usar a seguir
            Nivel n1 = null;
            String Nome, Descricao;
            int Status, Id, Idcurso;
            listaNivel = new ArrayList<Nivel>();

            while(rs.next()){
                Id = rs.getInt("id");
                Nome = rs.getString("nome");
                Idcurso = rs.getInt("idcurso");
                Descricao = rs.getString("descricao");
                Status = rs.getInt("status");
                
                n1 = new Nivel(Id, Nome, Idcurso, Descricao, Status);
                listaNivel.add(n1);
                
            }

            statement.close();
            connection.close();
            return listaNivel;
         }
         catch(Exception ex){
             ex.printStackTrace();
             return listaNivel;
         }
     }
    
    public boolean cadastraNivel(Nivel nivel) throws Exception{
 
        try{   
            String query = "INSERT INTO nivel (nome, idcurso, descricao, status)  VALUES (?,?,?,?)";
                
            
            PreparedStatement statement = 
                           this.connection.prepareStatement(query);
            

            statement.setString(1, nivel.getNome());
            statement.setInt(2, nivel.getIdcurso());
            statement.setString(3, nivel.getDescricao());
            statement.setInt(4, 1);
            
            statement.executeUpdate();
            
            statement.close();
            connection.close(); 
            return true;
        }
        catch(Exception ex){
            ex.printStackTrace();
            return false;
             
        }

     }
    
    public boolean alteraNivel(Nivel nivel){
            try{
                String query = "UPDATE nivel SET nome=?, idcurso=?, descricao=? WHERE id=?";
                PreparedStatement statement = this.connection.prepareStatement(query);
                statement.setString(1, nivel.getNome());
                statement.setInt(2, nivel.getIdcurso());
                statement.setString(3, nivel.getDescricao());
                statement.setInt(4, nivel.getId());

                //executando alteração
                statement.executeUpdate();

                statement.close();
                connection.close();
                return true;

            }
            catch(SQLException sqlex){
                sqlex.printStackTrace();
            }
            return false;
    }
           
    public boolean removeNivel(Nivel nivel){
            try{
                String query = "UPDATE nivel SET status=0 WHERE id=?";
                PreparedStatement statement = this.connection.prepareStatement(query);

                statement.setInt(1, nivel.getId());

                //executando alteração
                statement.executeUpdate();

                statement.close();
                connection.close();
                return true;

            }
            catch(Exception ex){
                ex.printStackTrace();
            }
            return false;
    }
    
    
    
    
    
    
    public ArrayList<Aluno> carregaAluno(){
        ArrayList<Aluno> listaAluno = null;
        try{
            String query = "SELECT id, nome, rg, endereco, telefone, nascimento, idade, pai, mae, status FROM aluno WHERE status=1";
            

            //preparando para a consulta citada acima (O parentese antes do valor atribuido serve apenas para evitar erros)
            PreparedStatement statement = (com.mysql.jdbc.PreparedStatement)this.connection.prepareStatement(query);

            //obtendo os resultados (O parenteses antes do valor atribuido serve apenas para nÃ£o causar conflito entre os tipos)
            ResultSet rs = (com.mysql.jdbc.ResultSet)statement.executeQuery(query);

            //declarando variÃ¡veis para usar a seguir
            Aluno a1 = null;
            String Nome, Rg, Endereco, Telefone, Pai, Mae;
            int Id, Status, Idade;
            Date Nascimento;
            listaAluno = new ArrayList<Aluno>();

            while(rs.next()){
                Id = rs.getInt("id");
                Nome = rs.getString("nome");
                Rg = rs.getString("rg");
                Endereco = rs.getString("endereco");
                Telefone = rs.getString("telefone");
                Pai = rs.getString("pai");
                Mae = rs.getString("mae");
                
                Status = rs.getInt("status");
                Idade = rs.getInt("idade");
                
                Nascimento = rs.getDate("nascimento");
                
                a1 = new Aluno(Id, Nome, Rg, Endereco, Telefone, Nascimento, Idade, Pai, Mae, Status);
                listaAluno.add(a1);
                
            }

            statement.close();
            connection.close();
            return listaAluno;
         }
         catch(Exception ex){
             ex.printStackTrace();
             return listaAluno;
         }
     }
    
    public boolean cadastraAluno (Aluno aluno) throws Exception{
 
        try{   
            String query = "INSERT INTO aluno (nome, rg, endereco, telefone, nascimento, idade, pai, mae, status)  VALUES (?,?,?,?,?,?,?,?,?)";
                
            
            PreparedStatement statement = 
                           this.connection.prepareStatement(query);
            

            statement.setString(1, aluno.getNome());
            statement.setString(2, aluno.getRg());
            statement.setString(3, aluno.getEndereco());
            statement.setString(4, aluno.getTelefone());
            statement.setDate(5, aluno.getNascimento());
            statement.setInt(6, aluno.getIdade());
            statement.setString(7, aluno.getPai());
            statement.setString(8, aluno.getMae());
            statement.setInt(9, 1);
            
            statement.executeUpdate();
            
            statement.close();
            connection.close(); 
            return true;
        }
        catch(Exception ex){
            ex.printStackTrace();
            return false;
             
        }

     }
    
    public boolean alteraAluno(Aluno aluno){
            try{
                String query = "UPDATE aluno SET nome=?, rg=?, endereco=?, telefone=?, nascimento=?, idade=?, pai=?, mae=? WHERE id=?";
                PreparedStatement statement = this.connection.prepareStatement(query);
                statement.setString(1, aluno.getNome());
                statement.setString(2, aluno.getRg());
                statement.setString(3, aluno.getEndereco());
                statement.setString(4, aluno.getTelefone());
                statement.setDate(5, aluno.getNascimento());
                statement.setInt(6, aluno.getIdade());
                statement.setString(7, aluno.getPai());
                statement.setString(8, aluno.getMae());
                statement.setInt(9, aluno.getId());

                //executando alteração
                statement.executeUpdate();

                statement.close();
                connection.close();
                return true;

            }
            catch(SQLException sqlex){
                sqlex.printStackTrace();
            }
            return false;
    }
           
    public boolean removeAluno(Aluno aluno){
            try{
                String query = "UPDATE aluno SET status=0 WHERE rg=?";
                PreparedStatement statement = this.connection.prepareStatement(query);

                statement.setString(1, aluno.getRg());

                //executando alteração
                statement.executeUpdate();

                statement.close();
                connection.close();
                return true;

            }
            catch(Exception ex){
                ex.printStackTrace();
            }
            return false;
    }
    
    
    public ArrayList<Turma> carregaTurma(){
        ArrayList<Turma> listaTurma = null;
        try{
            String query = "SELECT id, nome, idcurso, idnivel, emailprofessor, vagas, nalunos, horarios, status FROM turma WHERE status=1";
            

            //preparando para a consulta citada acima (O parentese antes do valor atribuido serve apenas para evitar erros)
            PreparedStatement statement = (com.mysql.jdbc.PreparedStatement)this.connection.prepareStatement(query);

            //obtendo os resultados (O parenteses antes do valor atribuido serve apenas para nÃ£o causar conflito entre os tipos)
            ResultSet rs = (com.mysql.jdbc.ResultSet)statement.executeQuery(query);

            //declarando variÃ¡veis para usar a seguir
            Turma t1 = null;
            String Nome, EmailProfessor, Horarios;
            int Id, Idcurso, Idnivel, Vagas,Nalunos, Status;
            listaTurma = new ArrayList<Turma>();

            while(rs.next()){
                Nome = rs.getString("nome");
                EmailProfessor = rs.getString("emailprofessor");
                Horarios = rs.getString("horarios");
                Id = rs.getInt("id");
                Idcurso = rs.getInt("idcurso");
                Idnivel = rs.getInt("idnivel");
                Vagas = rs.getInt("vagas");
                Nalunos = rs.getInt("nalunos");
                Status = rs.getInt("status");
                
                t1 = new Turma(Id, Nome, Idcurso, Idnivel, EmailProfessor, Vagas,Nalunos , Horarios, Status);
                listaTurma.add(t1);
                
            }

            statement.close();
            connection.close();
            return listaTurma;
         }
         catch(Exception ex){
             ex.printStackTrace();
             return listaTurma;
         }
     }
    
    public boolean cadastraTurma(Turma turma) throws Exception{
 
        try{
                
            String query = "INSERT INTO turma ( nome, idcurso, idnivel, emailprofessor, vagas, horarios, status)  VALUES (?,?,?,?,?,?,?)";
                
            
            PreparedStatement statement = 
                           this.connection.prepareStatement(query);
            

            
            statement.setString(1, turma.getNome());
            statement.setInt(2, turma.getIdCurso());
            statement.setInt(3, turma.getIdNivel());
            statement.setString(4, turma.getEmailProfessor());
            statement.setInt(5, turma.getVagas());
            statement.setString(6, turma.getHorarios());
            statement.setInt(7, 1);
            
            statement.executeUpdate();
            
            statement.close();
            connection.close();
            return true;
        }
        catch(Exception ex){
            ex.printStackTrace();
            return false;
             
        }

     }
    
    public boolean alteraTurma(Turma turma){
            try{
                // id, nome, idcurso, idnivel, emailprofessor, vagas, horarios, status
                String query = "UPDATE turma SET nome=?, idcurso=?, idnivel=?, emailprofessor=?, vagas=?, horarios=? WHERE id=?";
                PreparedStatement statement = this.connection.prepareStatement(query);
                
                statement.setString(1, turma.getNome());
                statement.setInt(2, turma.getIdCurso());
                statement.setInt(3, turma.getIdNivel());
                statement.setString(4, turma.getEmailProfessor());
                statement.setInt(5, turma.getVagas());
                statement.setString(6, turma.getHorarios());
                statement.setInt(7, turma.getId());

                //executando alteração
                statement.executeUpdate();

                statement.close();
                connection.close();
                return true;

            }
            catch(SQLException sqlex){
                sqlex.printStackTrace();
            }
            return false;
    }
        
    public boolean removeTurma(Turma turma){
            try{
                String query = "UPDATE turma SET status=0 WHERE id=?";
                PreparedStatement statement = this.connection.prepareStatement(query);

                statement.setInt(1, turma.getId());

                //executando alteração
                statement.executeUpdate();

                statement.close();
                connection.close();
                return true;

            }
            catch(Exception ex){
                ex.printStackTrace();
            }
            return false;
    }
    
    public boolean diminuiVaga(Turma turma){
            try{
               
                // id, nome, idcurso, idnivel, emailprofessor, vagas, horarios, status
                String query = "UPDATE turma SET vagas=?, nalunos=? WHERE id=?";
                PreparedStatement statement = this.connection.prepareStatement(query);
                
                statement.setInt(1, turma.getVagas()-1);
                statement.setInt(2, turma.getNalunos()+1);
                statement.setInt(3, turma.getId());

                //executando alteração
                statement.executeUpdate();

                statement.close();
                connection.close();
                return true;

            }
            catch(SQLException sqlex){
                sqlex.printStackTrace();
            }
            return false;
    }
    
    public ArrayList<Matricula> carregaMatricula(){
        ArrayList<Matricula> listaMatricula = null;
        try{
            String query = "SELECT id, idaluno, idturma, ano FROM matricula WHERE status=1";
            

            //preparando para a consulta citada acima (O parentese antes do valor atribuido serve apenas para evitar erros)
            PreparedStatement statement = (com.mysql.jdbc.PreparedStatement)this.connection.prepareStatement(query);

            //obtendo os resultados (O parenteses antes do valor atribuido serve apenas para nÃ£o causar conflito entre os tipos)
            ResultSet rs = (com.mysql.jdbc.ResultSet)statement.executeQuery(query);

            //declarando variÃ¡veis para usar a seguir
            Matricula m1 = null;
            int Id, Idaluno, Idturma, Ano, Status;
            listaMatricula = new ArrayList<Matricula>();

            while(rs.next()){
                Id = rs.getInt("id");
                Idaluno = rs.getInt("idaluno");
                Idturma = rs.getInt("idturma");
                Ano = rs.getInt("ano");
                Status = 1;
                
                m1 = new Matricula(Id, Idaluno, Idturma, Ano, Status);
                listaMatricula.add(m1);
                
            }

            statement.close();
            connection.close();
            return listaMatricula;
         }
         catch(Exception ex){
             ex.printStackTrace();
             return listaMatricula;
         }
     }
    
    public boolean cadastraMatricula(Matricula matricula) throws Exception{
 
        try{
                
            String query = "INSERT INTO matricula ( idaluno, idturma, ano, status)  VALUES (?,?,?,?)";
                
            
            PreparedStatement statement = 
                           this.connection.prepareStatement(query);
            

            
            statement.setInt(1, matricula.getIdAluno());
            statement.setInt(2, matricula.getIdTurma());
            statement.setInt(3, matricula.getAno());
            statement.setInt(4, 1);
            
            statement.executeUpdate();
            
            statement.close();
            
            connection.close();
            
            return true;
        }
        catch(Exception ex){
            ex.printStackTrace();
            return false;
             
        }

     }
    
    public boolean alteraMatricula(Matricula matricula){
            try{
                // id, nome, idcurso, idnivel, emailprofessor, vagas, horarios, status
                String query = "UPDATE matricula SET idaluno=?, idturma=?, ano=? WHERE id=?";
                PreparedStatement statement = this.connection.prepareStatement(query);
                
                statement.setInt(1, matricula.getIdAluno());
                statement.setInt(2, matricula.getIdTurma());
                statement.setInt(3, matricula.getAno());
                statement.setInt(4, matricula.getId());

                //executando alteração
                statement.executeUpdate();

                statement.close();
                connection.close();
                return true;

            }
            catch(SQLException sqlex){
                sqlex.printStackTrace();
            }
            return false;
    }
        
    public boolean removeMatricula(Matricula matricula){
            try{
                String query = "UPDATE matricula SET status=0 WHERE id=?";
                PreparedStatement statement = this.connection.prepareStatement(query);

                statement.setInt(1, matricula.getId());

                //executando alteração
                statement.executeUpdate();

                statement.close();
                connection.close();
                return true;

            }
            catch(Exception ex){
                ex.printStackTrace();
            }
            return false;
    }
    
    public ArrayList<Mensalidade> carregaMensalidade(){
        ArrayList<Mensalidade> listaMensalidade = null;
        try{
            String query = "SELECT id, idaluno, idturma, parcelaspagas, valorparcela  FROM mensalidade WHERE status=1";
            

            //preparando para a consulta citada acima (O parentese antes do valor atribuido serve apenas para evitar erros)
            PreparedStatement statement = (com.mysql.jdbc.PreparedStatement)this.connection.prepareStatement(query);

            //obtendo os resultados (O parenteses antes do valor atribuido serve apenas para nÃ£o causar conflito entre os tipos)
            ResultSet rs = (com.mysql.jdbc.ResultSet)statement.executeQuery(query);

            //declarando variÃ¡veis para usar a seguir
            Mensalidade m1 = null;
            int Id, Idaluno, Idturma, ParcelasPagas, Status;
            double ValorParcela;
            listaMensalidade = new ArrayList<Mensalidade>();

            while(rs.next()){
                Id = rs.getInt("id");
                Idaluno = rs.getInt("idaluno");
                Idturma = rs.getInt("idturma");
                ParcelasPagas = rs.getInt("parcelaspagas");
                ValorParcela = rs.getDouble("valorparcela");
                Status = 1;
                
                m1 = new Mensalidade(Id, Idaluno, Idturma, ParcelasPagas, ValorParcela, Status);
                listaMensalidade.add(m1);
                
            }

            statement.close();
            connection.close();
            return listaMensalidade;
         }
         catch(Exception ex){
             ex.printStackTrace();
             return listaMensalidade;
         }
     }
    
    public boolean cadastraMensalidade(Mensalidade mensalidade) throws Exception{
 
        try{
                
            String query = "INSERT INTO mensalidade ( idaluno, idturma, parcelaspagas, valorparcela, status)  VALUES (?,?,?,?,?)";
                
            
            PreparedStatement statement = 
                           this.connection.prepareStatement(query);
            

            
            statement.setInt(1, mensalidade.getIdAluno());
            statement.setInt(2, mensalidade.getIdTurma());
            statement.setInt(3, mensalidade.getParcelasPagas());
            statement.setDouble(4, mensalidade.getValorParcela());
            statement.setInt(5, 1);
            
            statement.executeUpdate();
            
            statement.close();
            
            connection.close();
            
            return true;
        }
        catch(Exception ex){
            ex.printStackTrace();
            return false;
             
        }

     }
    
    public boolean alteraMensalidade(Mensalidade mensalidade){
            try{
                // id, nome, idcurso, idnivel, emailprofessor, vagas, horarios, status
                String query = "UPDATE mensalidade SET idaluno=?, idturma=?, parcelaspagas=?, valorparcela=? WHERE id=?";
                PreparedStatement statement = this.connection.prepareStatement(query);
                
                statement.setInt(1, mensalidade.getIdAluno());
                statement.setInt(2, mensalidade.getIdTurma());
                statement.setInt(3, mensalidade.getParcelasPagas());
                statement.setDouble(4, mensalidade.getValorParcela());
                statement.setInt(5, mensalidade.getId());

                //executando alteração
                statement.executeUpdate();

                statement.close();
                connection.close();
                return true;

            }
            catch(SQLException sqlex){
                sqlex.printStackTrace();
            }
            return false;
    }
        
    public boolean removeMensalidade(Mensalidade mensalidade){
            try{
                String query = "UPDATE mensalidade SET status=0 WHERE id=?";
                PreparedStatement statement = this.connection.prepareStatement(query);

                statement.setInt(1, mensalidade.getId());

                //executando alteração
                statement.executeUpdate();

                statement.close();
                connection.close();
                return true;

            }
            catch(Exception ex){
                ex.printStackTrace();
            }
            return false;
    }
    
    public ArrayList<Presenca> carregaPresenca(){
        ArrayList<Presenca> listaPresenca = null;
        try{
            String query = "SELECT id, idmatricula, data, status FROM presenca";
            

            //preparando para a consulta citada acima (O parentese antes do valor atribuido serve apenas para evitar erros)
            PreparedStatement statement = (com.mysql.jdbc.PreparedStatement)this.connection.prepareStatement(query);

            //obtendo os resultados (O parenteses antes do valor atribuido serve apenas para nÃ£o causar conflito entre os tipos)
            ResultSet rs = (com.mysql.jdbc.ResultSet)statement.executeQuery(query);

            //declarando variÃ¡veis para usar a seguir
            Presenca p1 = null;
            String Data;
            int Status, Id, Idmatricula;
            listaPresenca = new ArrayList<Presenca>();

            while(rs.next()){
                Id = rs.getInt("id");
                Data = rs.getString("data");
                Idmatricula = rs.getInt("idmatricula");
                Status = rs.getInt("status");
                
                p1 = new Presenca(Id, Idmatricula, Data, Status);
                listaPresenca.add(p1);
            }

            statement.close();
            connection.close();
         }
         catch(Exception ex){
             ex.printStackTrace();
         }
        return listaPresenca;
     }
    
    public boolean cadastraPresenca(Presenca presenca) throws Exception{
 
        try{
                
            String query = "INSERT INTO presenca (idmatricula, data, status)  VALUES (?,?,?)";
                
            
            PreparedStatement statement = 
                           this.connection.prepareStatement(query);
            

            statement.setInt(1, presenca.getIdmatricula());
            statement.setString(2, presenca.getData());
            statement.setInt(3, presenca.getStatus());           
            statement.executeUpdate();          
            statement.close();
            connection.close();
            return true;
        }
        catch(Exception ex){
            ex.printStackTrace();
            return false;
             
        }

     }
    
    public boolean alteraPresenca(Presenca presenca){
            try{
                String query = "UPDATE presenca SET idmatricula=?, data=?, status=? WHERE id=?";
                PreparedStatement statement = this.connection.prepareStatement(query);
                statement.setInt(1, presenca.getIdmatricula());
                statement.setString(2, presenca.getData());
                statement.setInt(3, presenca.getStatus());
                statement.setInt(4, presenca.getId());
                statement.executeUpdate();
                statement.close();
                connection.close();
                return true;
            }
            catch(SQLException sqlex){
                sqlex.printStackTrace();
            }
            return false;
    }
           
    public boolean removePresenca(Presenca presenca){
            try{
                String query = "UPDATE presenca SET status=0 WHERE id=?";
                PreparedStatement statement = this.connection.prepareStatement(query);
                statement.setInt(1, presenca.getId());
                statement.executeUpdate();
                statement.close();
                connection.close();
                return true;
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
            return false;
    }
    
    public ArrayList<Notas> carregaNota(){
        ArrayList<Notas> listaNota = null;
        try{
            String query = "SELECT * FROM notas WHERE status=1";
            

            //preparando para a consulta citada acima (O parentese antes do valor atribuido serve apenas para evitar erros)
            PreparedStatement statement = (com.mysql.jdbc.PreparedStatement)this.connection.prepareStatement(query);

            //obtendo os resultados (O parenteses antes do valor atribuido serve apenas para nÃ£o causar conflito entre os tipos)
            ResultSet rs = (com.mysql.jdbc.ResultSet)statement.executeQuery(query);

            //declarando variÃ¡veis para usar a seguir
            Notas n1 = null;
            Double Nota1, Nota2, Nota3, Nota4;
            int Status, Id, Idmatricula, Faltas;
            listaNota = new ArrayList<Notas>();
            
            while(rs.next()){
                Id = rs.getInt("id");
                Nota1 = rs.getDouble("nota1");
                Nota2 = rs.getDouble("nota2");
                Nota3 = rs.getDouble("nota3");
                Nota4 = rs.getDouble("nota4");
                Idmatricula = rs.getInt("idmatricula");
                Faltas = rs.getInt("faltas");
                Status = rs.getInt("status");
                
                n1 = new Notas(Id, Idmatricula, Nota1, Nota2, Nota3, Nota4, Faltas, Status);
                listaNota.add(n1);
            }

            statement.close();
            connection.close();
         }
         catch(Exception ex){
             ex.printStackTrace();
         }
        return listaNota;
     }
    
    public Notas buscaNotaId(int id){
        Notas n1 = new Notas();
        try{
            String query = "SELECT * FROM notas WHERE id=?";
            

            //preparando para a consulta citada acima (O parentese antes do valor atribuido serve apenas para evitar erros)
            PreparedStatement statement = (com.mysql.jdbc.PreparedStatement)this.connection.prepareStatement(query);
            statement.setInt(1, id);
            //obtendo os resultados (O parenteses antes do valor atribuido serve apenas para nÃ£o causar conflito entre os tipos)
            ResultSet rs = (com.mysql.jdbc.ResultSet)statement.executeQuery(query);

            //declarando variÃ¡veis para usar a seguir
           
            Double Nota1, Nota2, Nota3, Nota4;
            int Status, Id, Idmatricula, Faltas;
            
            while(rs.next()){
                Id = rs.getInt("id");
                Nota1 = rs.getDouble("nota1");
                Nota2 = rs.getDouble("nota2");
                Nota3 = rs.getDouble("nota3");
                Nota4 = rs.getDouble("nota4");
                Idmatricula = rs.getInt("idmatricula");
                Faltas = rs.getInt("faltas");
                Status = rs.getInt("status");
                
                n1 = new Notas(Id, Idmatricula, Nota1, Nota2, Nota3, Nota4, Faltas, Status);
                return n1;
            }
            statement.close();
            connection.close();
         }
         catch(Exception ex){
             ex.printStackTrace();
         }
        return n1;
     }
    
    public boolean cadastraNota(Notas nota) throws Exception{
 
        try{
                
            String query = "INSERT INTO notas (idmatricula, nota1, nota2, nota3, nota4, faltas, status)  VALUES (?,?,?,?,?,?,?)";
                
            
            PreparedStatement statement = 
                           this.connection.prepareStatement(query);
            

            statement.setInt(1, nota.getIdmatricula());
            statement.setDouble(2, nota.getNota1());
            statement.setDouble(3, nota.getNota2());
            statement.setDouble(4, nota.getNota3());
            statement.setDouble(5, nota.getNota4());
            statement.setInt(6, nota.getFaltas());
            statement.setInt(7, 1);
            statement.executeUpdate();          
            statement.close();
            connection.close();
            return true;
        }
        catch(Exception ex){
            ex.printStackTrace();
            return false;
             
        }

     }
    
    public boolean alteraNotas(Notas notas){
            try{
                String query = "UPDATE notas SET nota1=?, nota2=?, nota3=?, nota4=? WHERE id=?";
                PreparedStatement statement = this.connection.prepareStatement(query);
                statement.setDouble(1, notas.getNota1());
                statement.setDouble(2, notas.getNota2());
                statement.setDouble(3, notas.getNota3());
                statement.setDouble(4, notas.getNota4());
                statement.setInt(5, notas.getId());
                statement.executeUpdate();
                statement.close();
                connection.close();
                return true;
            }
            catch(SQLException sqlex){
                sqlex.printStackTrace();
            }
            return false;
    }
    
    public boolean alteraFalta(Notas notas){
            try{
                String query = "UPDATE notas SET faltas=? WHERE id=?";
                PreparedStatement statement = this.connection.prepareStatement(query);
                statement.setInt(1, notas.getFaltas());
                statement.setInt(2, notas.getId());
                statement.executeUpdate();
                statement.close();
                connection.close();
                return true;
            }
            catch(SQLException sqlex){
                sqlex.printStackTrace();
            }
            return false;
    }
          
    public ArrayList<Reposicao> carregaReposicao(){
        ArrayList<Reposicao> listaReposicao = null;
        try{
            String query = "SELECT * FROM reposicao";
            

            //preparando para a consulta citada acima (O parentese antes do valor atribuido serve apenas para evitar erros)
            PreparedStatement statement = (com.mysql.jdbc.PreparedStatement)this.connection.prepareStatement(query);

            //obtendo os resultados (O parenteses antes do valor atribuido serve apenas para nÃ£o causar conflito entre os tipos)
            ResultSet rs = (com.mysql.jdbc.ResultSet)statement.executeQuery(query);

            //declarando variÃ¡veis para usar a seguir
            Reposicao r1 = null;
            String Datareposto, Datareposicao;
            int Status, Id, Idmatricula;
            listaReposicao = new ArrayList<Reposicao>();

            while(rs.next()){
                Id = rs.getInt("id");
                Datareposto = rs.getString("datareposto");
                Datareposicao = rs.getString("datareposicao");
                Idmatricula = rs.getInt("idmatricula");
                Status = rs.getInt("status");
                
                r1 = new Reposicao(Id, Idmatricula, Datareposto, Datareposicao, Status);
                listaReposicao.add(r1);
            }

            statement.close();
            connection.close();
         }
         catch(Exception ex){
             ex.printStackTrace();
         }
        return listaReposicao;
     }
    
    public boolean cadastraReposicao(Reposicao reposicao) throws Exception{
 
        try{
                
            String query = "INSERT INTO reposicao (idmatricula, datareposto, datareposicao, status)  VALUES (?,?,?,?)";
                
            
            PreparedStatement statement = 
                           this.connection.prepareStatement(query);
            

            statement.setInt(1, reposicao.getIdmatricula());
            statement.setString(2, reposicao.getDatareposto());
            statement.setString(3, reposicao.getDatareposicao());
            statement.setInt(4, reposicao.getStatus());           
            statement.executeUpdate();          
            statement.close();
            connection.close();
            return true;
        }
        catch(Exception ex){
            ex.printStackTrace();
            return false;
             
        }

     }
    
    public boolean alteraReposicao(Reposicao reposicao){
            try{
                String query = "UPDATE reposicao SET idmatricula=?, datareposto=?, datareposicao=?, status=? WHERE id=?";
                PreparedStatement statement = this.connection.prepareStatement(query);
                statement.setInt(1, reposicao.getIdmatricula());
                statement.setString(2, reposicao.getDatareposto());
                statement.setString(3, reposicao.getDatareposicao());
                statement.setInt(4, reposicao.getStatus());
                statement.setInt(5, reposicao.getId());
                statement.executeUpdate();
                statement.close();
                connection.close();
                return true;
            }
            catch(SQLException sqlex){
                sqlex.printStackTrace();
            }
            return false;
    }
           
    public boolean removeReposicao(Reposicao reposicao){
            try{
                String query = "UPDATE reposicao SET status=0 WHERE id=?";
                PreparedStatement statement = this.connection.prepareStatement(query);
                statement.setInt(1, reposicao.getId());
                statement.executeUpdate();
                statement.close();
                connection.close();
                return true;
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
            return false;
    }
    
}

