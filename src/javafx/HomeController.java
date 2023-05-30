package javafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HomeController implements Initializable {

    public static ObservableList<Student> listStudents = FXCollections.observableArrayList();
    public ListView<Student> lv;
    public static Student editStudent;
    private  final static String connectionString = "jdbc:mysql://localhost:3306/demo";
    private final static String user = "root";
    private final static String pwd = "";

    public void goToForm(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("form.fxml"));
        Main.mainStage.setScene(new Scene(root,600,400));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(connectionString,user,pwd);
            ObservableList<Student> list = FXCollections.observableArrayList();
            //query
            Statement stt = conn.createStatement();
            String sql = "select * from student";
            ResultSet rs = stt.executeQuery(sql);
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String tel = rs.getString("tel");
                Student s = new Student(name, email, tel);
                list.add(s);
            }
            lv.setItems(list);
            lv.refresh();
        }catch (Exception e ){
            System.out.println("error:"+e.getMessage());
        }
    }

    public void edit(ActionEvent actionEvent) throws Exception {
        editStudent = lv.getSelectionModel().getSelectedItem();
        if(editStudent != null){
            Parent root = FXMLLoader.load(getClass().getResource("edit.fxml"));
            Main.mainStage.setScene(new Scene(root,600,400));
        }
    }

    public void Class(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("phongHoc.fxml"));
        Main.mainStage.setScene(new Scene(root,600,400));
    }
}