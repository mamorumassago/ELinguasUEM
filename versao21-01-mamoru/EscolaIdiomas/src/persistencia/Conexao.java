/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Super
 */
public class Conexao {
	
	private static final String username = "root";
	private static final String password = "";
	
	
    public static Connection conecta() throws SQLException{  
	//endereço banco de dados
        String url = new String("jdbc:mysql://localhost:3306/linguas");
        //username do administrador de banco de dados
        //String username = "root";
        //senha do administrador de banco de dados
        //String password = "";
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
            return(con);
        }
        catch(ClassNotFoundException cnfex){
            new SQLException("Driver não encontrado!");
            System.err.print("Driver não encontrado!");
            cnfex.printStackTrace();
            System.exit(1);
        }
        catch(SQLException sqlex){
            System.err.print("Falha na conexão!");
            sqlex.printStackTrace();
            System.exit(1);
	}
        return null;
  }


    
}
