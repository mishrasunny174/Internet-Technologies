package cf.mishrasunny174.random;

import java.sql.*;

public class SqlFunctions {
    public static void main(String args[]) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/practicals", "root", "root")) {
            CallableStatement cStatement = conn.prepareCall("{?= call num_of_rows()}");
            ResultSet resultSet = cStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("No of rows: " + resultSet.getInt(1));
            }
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rSet = stmt.executeQuery("Select * from students");
            rSet.last();
            System.out.println("Last student's name is: " + rSet.getString("name"));
            System.out.println("Now going backwards");
            while (rSet.previous()) {
                System.out.println("student's name is: " + rSet.getString("name"));
            }
            CallableStatement cStatement2 = conn.prepareCall("{ call proc1(?) }");
            cStatement2.registerOutParameter(1, java.sql.Types.INTEGER);
            cStatement2.execute();
            System.out.println("Num of rows using out parameter: " + cStatement2.getInt(1));
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
}