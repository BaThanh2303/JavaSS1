package quanlylophoc;

import database.Connector;
import javafx.HomeController;
import javafx.Student;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.PreparedStatement;

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
            LopHoc lp = new LopHoc(tenlop,phonghoc);
            Connection conn = new Connector().getConn();
            String sql = "insert into classrooms(name,room) values(?,?)";
            PreparedStatement stt = conn.prepareStatement(sql);
            stt.setString(1,lp.getTenLop());
            stt.setString(2, lp.getPhongHoc());
            stt.executeUpdate();

            Back(null);
        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(e.getMessage());
            alert.show();
        }
    }
}
