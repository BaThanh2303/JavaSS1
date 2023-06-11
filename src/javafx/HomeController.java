package javafx;

import database.Connector;
import enums.RepositoryType;
import factory.RepositoryFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
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

    public static Student editStudent;
    public TableView<Student> tbV;
    public TableColumn<Student,Integer> tcId;
    public TableColumn<Student, String> tcName;
    public TableColumn<Student, String> tcEmail;
    public TableColumn<Student, String> tcTel;
    public TableColumn<Student, Button> tcAction;

    public void goToForm(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("form.fxml"));
        Main.mainStage.setScene(new Scene(root,600,400));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tcId.setCellValueFactory(new PropertyValueFactory<>("id"));
        tcName.setCellValueFactory(new PropertyValueFactory<>("name"));
        tcEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        tcTel.setCellValueFactory(new PropertyValueFactory<>("tel"));
        tcAction.setCellValueFactory(new PropertyValueFactory<>("edit"));

        try {
            ObservableList<Student> list = FXCollections.observableArrayList();
            list.addAll(RepositoryFactory.createRepositoryInstance(RepositoryType.STUDENT).getAll());
            tbV.setItems(list);
        }catch (Exception e ){
            System.out.println("error:"+e.getMessage());
        }
    }

    public void edit(ActionEvent actionEvent) throws Exception {

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