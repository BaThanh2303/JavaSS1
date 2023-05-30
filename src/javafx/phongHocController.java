package javafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class phongHocController implements Initializable {
    public ListView<phongHoc> viewPh;
    private  final static String connectionString = "jdbc:mysql://localhost:3306/demo";
    private final static String user = "root";
    private final static String pwd = "";

    public void Back(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Main.mainStage.setScene(new Scene(root,600,400));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(connectionString,user,pwd);
            ObservableList<phongHoc> listPh = FXCollections.observableArrayList();
            //query
            Statement stt = conn.createStatement();
            String sql = "select * from classrooms";
            ResultSet rs = stt.executeQuery(sql);
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String room = rs.getString("room");
                phongHoc ph = new phongHoc(name, room);
                listPh.add(ph);
            }
            viewPh.setItems(listPh);
            viewPh.refresh();
        }catch (Exception e ){
            System.out.println("error:"+e.getMessage());
        }
    }
}
