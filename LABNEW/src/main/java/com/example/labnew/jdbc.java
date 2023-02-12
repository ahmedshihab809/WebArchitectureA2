package com.example.labnew;

import java.sql.*;
public class jdbc {

    //Method to set up connection with the database
    public static Connection getConnection() throws ClassNotFoundException, SQLException {

            Connection connection;
            String url="com.example.labnew.jdbc:mysql://localhost:3307/web_arch2";
            String username="root";
            String password="";
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = (Connection)DriverManager.getConnection(url,username,password);
            System.out.println("Connection Successful");
            return connection;
    }
}