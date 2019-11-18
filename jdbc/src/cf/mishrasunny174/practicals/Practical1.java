package cf.mishrasunny174.practicals;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.util.Scanner;

public class Practical1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Connection connection;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/practicals", "root", "root");
            Statement s1 = connection.createStatement();
            ResultSet res1 = s1.executeQuery("select count(*) as count from students");
            while (res1.next()) {
                System.out.println("Total number of students: " + res1.getString("count"));
            }
            System.out.print("Enter subject you wanna know average score of: ");
            String subject = scanner.next();
            PreparedStatement s2 = connection.prepareStatement("select avg(maths),avg(science),avg(english) as avgscore from results");
            ResultSet res2 = s2.executeQuery();
            while (res2.next()) {
                System.out.println("Average score in " + subject + " is: " + res2.getString("avg("+subject+")"));
            }
            Statement s3 = connection.createStatement();
            ResultSet res3 = s3.executeQuery(
                    "select name from students where rollnumber in (select rollnumber from results group by rollnumber order by sum(maths+science+english) desc) limit 1");

            while (res3.next()) {
                System.out.println("Student having maximum marks is: " + res3.getString("name"));
            }
            Statement s4 = connection.createStatement();
            ResultSet res4 = s4.executeQuery(
                    "select name from students where rollnumber in (select rollnumber from results where (maths+science+english)/3 > 70)");
            System.out.println("Students getting first division are");
            while (res4.next()) {
                System.out.println(res4.getString("name"));
            }
            connection.close();
        } catch (SQLException e) {
            System.err.println("Fatal error: " + e);
        } finally {
            scanner.close();
        }
    }
}