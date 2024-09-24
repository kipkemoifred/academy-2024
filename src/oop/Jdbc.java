package oop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc {
        public static void main(String args[]){
            try{
//                Class.forName("com.mysql.jdbc.Driver");
                Class.forName("org.postgresql.Driver");
                Connection con= DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5435/books","postgres","pass123");
                //here sonoo is database name, root is username and password
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from books");
                while(rs.next())
                    System.out.println(rs.getString(5)+"  "+rs.getString(6)+"  "+rs.getString(7));
                con.close();
            }catch(Exception e){ System.out.println(e);}
        }

}
