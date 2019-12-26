package main;

import java.sql.*;
public class Main {
    
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:sqlite:kata5.db";
                
        Connection con = null;
        con = DriverManager.getConnection(url);
       
        

        String sql = "SELECT * FROM PEOPLE";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            System.out.println(rs.getInt("id") + "\t" + rs.getString("Name") + "\t" + rs.getString("Apellidos") + "\t" + rs.getString("Departamento") + "\t");
        }
        

        sql = "CREATE TABLE IF NOT EXISTS EMAIL (\n"
            + " Id integer PRIMARY KEY AUTOINCREMENT,\n"
            + " Mail text NOT NULL);";
        stmt = con.createStatement();
        stmt.execute(sql);
    }
}