package java2.demo2;

import javafx.stage.Stage;

import java.sql.*;

public class DemoDB {
    private  final static String connectionString = "jdbc:mysql://localhost:3306/demo";
    private final static String user = "root";
    private final static String pwd = "";
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(connectionString,user,pwd);

            //query
            Statement stt = conn.createStatement();
            String sql = "select * from student";
            ResultSet rs = stt.executeQuery(sql);
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String tel = rs.getString("tel");
                System.out.println(id+ "-" +name+ "-" + email + "-" + tel);
            }
        }catch (Exception e ){
            System.out.println("error:"+e.getMessage());
        }
    }
}
