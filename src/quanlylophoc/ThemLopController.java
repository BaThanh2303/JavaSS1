package quanlylophoc;

import javafx.HomeController;
import javafx.Student;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class ThemLopController {
    public TextField tenLop;
    public TextField phongHoc;

    public TextField khoaHoc;
    public void Back(ActionEvent actionEvent) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("danhSach.fxml"));
        Main.mainStage.setScene(new Scene(root,600,400));
    }

    public void Submit(ActionEvent actionEvent) {
        try {
            String tenlop = tenLop.getText();
            String phonghoc = phongHoc.getText();
            String khoahoc = khoaHoc.getText();
            for (LopHoc s : DanhSController.listLopHoc){
                if(s.getTenLop().equals(tenlop))
                    throw new Exception("Tên Lớp đã tồn tại");
                if(s.getPhongHoc().equals(phonghoc))
                    throw new Exception("Phòng đã hết");
            }
            LopHoc lp = new LopHoc(tenlop,phonghoc,khoahoc);
            DanhSController.listLopHoc.add(lp);
            Back(null);
        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(e.getMessage());
            alert.show();
        }
    }
}
