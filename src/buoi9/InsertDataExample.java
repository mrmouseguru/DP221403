package buoi9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //kết nối DB
        Connection connection = null;
        Statement statement = null;

        //tai driver cho app
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        String url = "jdbc:mysql://localhost:3306/db221403";
        String user = "root";
        String password = "12345678";
        //lay ket noi den CSDL db221403
        connection = DriverManager.getConnection(url, user, password);
        //truy vấn
        String sql = "Insert into Salary_Grade (Grade, High_Salary, Low_Salary) " +
                 "values (2, 20000, 10000) ";
        statement = connection.createStatement();
        int rowCount = statement.executeUpdate(sql);

        System.out.println("Row Count Affected: " + rowCount);

        connection.close();
    }

}
