package com.isil.sesion1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainApp {

    public static void main(String[] args) throws Exception{

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/test",
                "root",
                "root"
        );

        Statement stmt= con.createStatement();

        //int resultUpdate = stmt.executeUpdate("update users set phone='894562348' where name='Messi' ");

        ResultSet result = stmt.executeQuery("select * from Users ");

        while (result.next()){
            if (result.getString("name").equals("Ronaldo")){
                System.out.println(result.getString("idUser"));
                System.out.println(result.getString("name"));
                System.out.println(result.getString("phone"));
                System.out.println(result.getString("city"));

            }
        }
    }
}
