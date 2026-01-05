/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newproject;

/**
 *
 * @author krish
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;

public class DataBase {
    
      static  String url  = "jdbc:mysql://localhost:3306/archive"; 
      
      static void saveUser( String name, String phone, String email, String dob, String gender, String password) throws Exception {
       
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection( 
                url, "root", "root"); 
            
        Statement stmt = conn.createStatement(); 
           
        stmt.executeUpdate("insert into users values ('"+name+"','"+phone+"','"+email+"','"+dob+"','"+gender+"','"+password+"')");
        
  
            // closing connection 
            conn.close(); 
    }
      
      
      static Boolean getUser(String name, String password) throws Exception{
       Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection( 
                url, "root", "root"); 
            
        Statement stmt = conn.createStatement(); 
        
        ResultSet rs = stmt.executeQuery("Select * from users where name='"+name+"' AND password='"+password+"'");
        return rs.next();
        
        
        
    }
      
      static void saveDoc(String id, String type, String time, String fileUrl) throws Exception {

    Class.forName("com.mysql.jdbc.Driver");

    Connection conn = DriverManager.getConnection(
            url, "root", "root");

    Statement stmt = conn.createStatement();

    stmt.executeUpdate(
        "insert into documentdetails values ('" + id + "','" + type + "','" + time + "','" + fileUrl + "')"
    );

    conn.close();
}
static ResultSet getDocument(String type) throws Exception {

    Class.forName("com.mysql.jdbc.Driver");

    Connection conn = DriverManager.getConnection(
            url, "root", "root");

    Statement stmt = conn.createStatement();

    ResultSet rs = stmt.executeQuery(
        "select * from documentdetails where type = '" + type + "'" );

    return rs;
}

}
