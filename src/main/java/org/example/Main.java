package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        String dbUrl = "jdbc:mysql://3.239.253.255:3306/syntaxhrm_mysql";
        String username = "syntax_hrm";
        String password = "syntaxhrm123";

        Connection conn;

        try {
            //creating the connection
            conn = DriverManager.getConnection(dbUrl, username, password);

            //this method creates a Statement object for sending SQL statements to the database.
            Statement statement = conn.createStatement();

            ResultSet rset = statement.executeQuery("select * from person");

            while (rset.next()){
                String id = rset.getString("id");
                String firstName = rset.getString("firstname");
                String lastName = rset.getString("lastname");

                System.out.println(id + " " + firstName + " " + lastName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
