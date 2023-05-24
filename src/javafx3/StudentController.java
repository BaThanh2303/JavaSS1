package javafx3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentController implements Initializable {


    public static ObservableList<Student> listStudent = FXCollections.observableArrayList();
    public ListView<Student> lv;
    public static Student editStudent;
    public void Create(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("CreateStudent.fxml"));
        Main.mainStage.setScene(new Scene(root,600,400));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lv.setItems(listStudent);
    }

    public void edit(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("StudentList.fxml"));
        Main.mainStage.setScene(new Scene(root,600,400));
    }
}
