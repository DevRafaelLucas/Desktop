/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancodados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement; // Para executar comandos SQL
import java.sql.ResultSet; // Para obter resultados de consultas SELECT
    
/**
 *
 * @author Rafael55957146
 */
public class ConexaoMysql {
    
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
      private static final String URL = "jdbc:mysql://localhost:3306/vendas";
      private static final String USER = "root";
      private static final String PASS = "senac";
   
   
    public static Connection conexaoBanco() throws SQLException {
       
       
        try {
             Class.forName(DRIVER);
             return DriverManager.getConnection(URL,USER, PASS);
        } catch (ClassNotFoundException ex) {
           
             
      throw new RuntimeException("Erro no banco de dados",ex);
       
         }
    }
}
