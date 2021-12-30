/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritma;

import java.sql.*;


/**
 *
 * @author acer
 */
public class Koneksi {

    public static Connection con;
    public static Statement stm;
    
    
    //TODO connection to database with JDBC
    public Connection databaseConnection(){
        
        try {
            String url = "jdbc:mysql://localhost/dbsiswa";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            stm = con.createStatement();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("koneksi gagal" + e.getMessage());
           
        }
        return null;
    }
}
