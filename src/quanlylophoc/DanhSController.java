package quanlylophoc;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class DanhSController implements Initializable {
    public static ObservableList<LopHoc> listLopHoc = FXCollections.observableArrayList();
    public ListView<LopHoc> viewDS;
    public static LopHoc editLophoc;
    public void NewClass(ActionEvent actionEvent) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("themLop.fxml"));
        Main.mainStage.setScene(new Scene(root,600,400));
    }

    public void EditClass(ActionEvent actionEvent) throws Exception {
            Parent root = FXMLLoader.load(getClass().getResource("editLop.fxml"));
            Main.mainStage.setScene(new Scene(root, 600, 400));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        viewDS.setItems(listLopHoc);
    }
}
