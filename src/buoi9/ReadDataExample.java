package buoi9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadDataExample {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //ket noi CSDL
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;

        //tai driver cho app
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        String url = "jdbc:mysql://localhost:3306/db221403";
        String user = "root";
        String password = "12345678";
        //lay ket noi den CSDL db221403
        connection = DriverManager.getConnection(url, user, password);
        
        //truy vấn
        String sql = "Select Emp_Id, Emp_No, Emp_Name from Employee";
        //chạy / thực thi truy vấn sql
        statement = connection.createStatement();
        rs = statement.executeQuery(sql);

        //in danh sách nhân viên trong rs
        while (rs.next()) {
            int empId = rs.getInt(1);
            String empNo = rs.getString(2);
            String empName = rs.getString("Emp_Name");
            System.out.println("--------------------");
            System.out.println("EmpId:" + empId);
            System.out.println("EmpNo:" + empNo);
            System.out.println("EmpName:" + empName);
        }

        //đóng kết nối
        connection.close();
    }

}
