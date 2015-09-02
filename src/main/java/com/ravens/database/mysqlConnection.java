/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ravens.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author pratibhakakarla
 */
public class mysqlConnection {
    
   public static Connection connectMe(){
////    
// public static void main(String[] argv) {
    System.out.println("-------- MySQL JDBC Connection Testing ------------");
 
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("Where is your MySQL JDBC Driver?");
		e.printStackTrace();
                return null;
		
	}
 
	System.out.println("MySQL JDBC Driver Registered!");
	Connection connection = null;
 
	try {
		connection = DriverManager
		.getConnection("jdbc:mysql://sql4.freemysqlhosting.net:3306/sql458286","sql458286", "mJ8*iU2!");
                
               
	} catch (SQLException e) {
		System.out.println("Connection Failed! Check output console");
		e.printStackTrace();
		
	}
 
	if (connection != null) {
		System.out.println("You made it, take control your database now!");
                
                 return connection;
        
	} else {
		System.out.println("Failed to make connection!");
	}
        return null;
      
  }
}

