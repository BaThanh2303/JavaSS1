package javafx;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class HomeController {
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtPhone;
//    public Text txtOut;
//    public ArrayList<String> emailList = new ArrayList<>();
//    public ArrayList<String> phoneList = new ArrayList<>();
    public static ObservableList<Student> listStudent = FXCollections.observableArrayList();
    public ListView<Student> lv;
    public static Student editStudent;

    public void submit(ActionEvent actionEvent) throws Exception {


//        if(emailList.contains(mail)){
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setContentText("Email này đã tồn tại");
//            alert.show();
//            return;
//        }
//        emailList.add(mail);
//        if(phoneList.contains(phone)){
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setContentText("Số Điện Thoại này đã tồn tại");
//            alert.show();
//            return;
//        }
//        phoneList.add(phone);


//        try {
//            if (emailList.contains(mail))
//                throw  new Exception("Mail đã tồn tại");
//            if (phoneList.contains(phone))
//                throw new Exception("Số Phone đã tồn tại");
//            emailList.add(mail);
//            phoneList.add(phone);
//            String sv = "\n" + name + "\n" + mail + "\n" +phone;
//            txtOut.setText(txtOut.getText()+sv);
//            txtName.clear();
//            Email.clear();
//            Phone.clear();
//        }catch (Exception e){
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setContentText("Số Điện Thoại này đã tồn tại");
//            alert.show();
//        }
        try {
            String name = txtName.getText() ;
            String email = txtEmail.getText();
            String phone = txtPhone.getText();
            if(editStudent != null){
                editStudent.setName(name);
                editStudent.setEmail(email);
                editStudent.setTel(phone);
                lv.setItems(listStudent);
                lv.refresh();
                editStudent = null;
                txtName.clear();;
                txtEmail.clear();
                txtPhone.clear();
                return;

            }
            for (Student s : listStudent) {
                if (s.getName().equals(name))
                    throw new Exception("Tên SV đã tồn tại");
                if (s.getEmail().equals(email))
                    throw new Exception("Email đã tồn tại");
            }
            Student sv = new Student(name,email, phone);
            listStudent.add(sv);
            lv.setItems(listStudent);
            txtName.clear();
            txtEmail.clear();
            txtPhone.clear();
        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(e.getMessage());
            alert.show();
        }
    }

    public void editStudent(MouseEvent mouseEvent) {
        editStudent = (Student) lv.getSelectionModel().getSelectedItems();
        txtName.setText(editStudent.getName());
        txtEmail.setText(editStudent.getEmail());
        txtPhone.setText(editStudent.getTel());
    }
}//List View
