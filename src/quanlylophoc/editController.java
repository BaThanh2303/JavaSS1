package quanlylophoc;

import javafx.HomeController;
import javafx.Student;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class editController implements Initializable {
    public TextField editLop;
    public TextField editPhong;
    public TextField editKhoa;
    public ListView<LopHoc> olView;
    public void Delete(ActionEvent actionEvent) {
        DanhSController.editLophoc = olView.getSelectionModel().getSelectedItem();
        if (DanhSController.editLophoc != null){
            olView.getItems().remove(DanhSController.editLophoc);
        }
    }

    public void Submit(ActionEvent actionEvent) {
        try {
            String lop = editLop.getText();
            String phong = editPhong.getText();
            String khoa = editKhoa.getText();
            if (DanhSController.editLophoc != null) {
                DanhSController.editLophoc.setTenLop(lop);
                DanhSController.editLophoc.setKhoaHoc(khoa);
                DanhSController.editLophoc.setPhongHoc(phong);
                olView.setItems(DanhSController.listLopHoc);
                olView.refresh();
                return;
            }
            LopHoc lp = new LopHoc(lop,phong,khoa);
            DanhSController.listLopHoc.add(lp);
        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(e.getMessage());
            alert.show();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        olView.setItems(DanhSController.listLopHoc);
    }

    public void Back(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("danhSach.fxml"));
        Main.mainStage.setScene(new Scene(root,600,400));

    }

    public void edit(ActionEvent actionEvent) {
        DanhSController.editLophoc = olView.getSelectionModel().getSelectedItem();
        if (DanhSController.editLophoc != null){
            editLop.setText(DanhSController.editLophoc.tenLop);
            editPhong.setText(DanhSController.editLophoc.phongHoc);
            editKhoa.setText(DanhSController.editLophoc.khoaHoc);
        }
    }
}
