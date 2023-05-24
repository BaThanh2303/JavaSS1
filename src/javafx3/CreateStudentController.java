package javafx3;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;


public class CreateStudentController {
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtPhone;
    public void submit(ActionEvent actionEvent) throws Exception {

        try {
            String name = txtName.getText() ;
            String email = txtEmail.getText();
            String phone = txtPhone.getText();

            for (Student s : StudentController.listStudent) {
                if (s.getName().equals(name))
                    throw new Exception("Tên SV đã tồn tại");
                if (s.getEmail().equals(email))
                    throw new Exception("Email đã tồn tại");
            }
            Student sv = new Student(name,email, phone);
            StudentController.listStudent.add(sv);
            BackToList(null);

        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(e.getMessage());
            alert.show();
        }
    }

    public void BackToList(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("StudentList.fxml"));
        Main.mainStage.setScene(new Scene(root,600,400));
    }
}
