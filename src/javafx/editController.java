package javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class editController implements Initializable {
    public TextField edName;
    public TextField edTel;
    public TextField edMail;

    public void edSubmit(ActionEvent actionEvent) {
        try {
            String name = edName.getText();
            String email = edMail.getText();
            String tel = edTel.getText();
            HomeController.editStudent.setName(name);
            HomeController.editStudent.setTel(tel);
            Student sv = new Student(name,email,tel);
            HomeController.listStudents.add(sv);
            HomeController.editStudent = null;
            edBack(null);
        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(e.getMessage());
            alert.show();
        }
    }

    public void edBack(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Main.mainStage.setScene(new Scene(root,600,400));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        edName.setText(HomeController.editStudent.getName());
        edTel.setText(HomeController.editStudent.getTel());
        edMail.setText(HomeController.editStudent.getEmail());

    }
}
