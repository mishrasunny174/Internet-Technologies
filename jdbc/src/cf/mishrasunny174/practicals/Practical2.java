package cf.mishrasunny174.practicals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;

public class Practical2 {
    public static void main(String args[]) {
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/practicals", "root", "root");
            CallableStatement cs = connection.prepareCall("{?= call num_of_rows()}");
            ResultSet res = cs.executeQuery();
            while(res.next()) {
                System.out.println("number of rows in students table: "+res.getInt(1));
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }
}