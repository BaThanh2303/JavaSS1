package quanlylophoc;

import database.Connector;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class DanhSController implements Initializable {
    public static LopHoc editLophoc;
    public TableView<LopHoc> tbV;
    public TableColumn<LopHoc, Integer> tcId;
    public TableColumn<LopHoc, String> tcName;
    public TableColumn<LopHoc, String> tcPhong;
    public TableColumn<LopHoc, Button> Action;

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
        tcId.setCellValueFactory(new PropertyValueFactory<>("id"));
        tcName.setCellValueFactory(new PropertyValueFactory<>("tenLop"));
        tcPhong.setCellValueFactory(new PropertyValueFactory<>("phongHoc"));
        try {
            Connection conn = new Connector().getConn();
            //query
            Statement stt = conn.createStatement();
            String sql = "select * from classrooms";
            ResultSet rs = stt.executeQuery(sql);
            ObservableList<LopHoc> list = FXCollections.observableArrayList();
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String room = rs.getString("room");
                LopHoc lp = new LopHoc(id,name,room);
                list.add(lp);

            }
            tbV.setItems(list);
        }catch (Exception e){
            System.out.println("error"+e.getMessage());
        }

    }
}
