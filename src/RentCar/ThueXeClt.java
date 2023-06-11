package RentCar;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;

public class ThueXeClt implements Initializable {
    public TableView<Car> tbView;
    public TableColumn<Car, Integer> TCID;
    public TableColumn<Car, String> TCBrand;
    public TableColumn<Car, String> TCModel;
    public TableColumn<Car, Double> TCPrice;
    public TableColumn<Car, String> TCStatus;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        TCID.setCellValueFactory(new PropertyValueFactory<>("Carid"));
        TCBrand.setCellValueFactory(new PropertyValueFactory<>("Brand"));
        TCModel.setCellValueFactory(new PropertyValueFactory<>("Model"));
        TCPrice.setCellValueFactory(new PropertyValueFactory<>("Price"));
        TCStatus.setCellValueFactory(new PropertyValueFactory<>("Status"));
        try{
            ObservableList<Car> Carlist = FXCollections.observableArrayList();
            Carlist.addAll(RepoFactory.createRepositoryInstance(RepoType.Car).getAll());
            tbView.setItems(Carlist);
        }catch (Exception e){
            System.out.println("error:"+e.getMessage());
        }

    }
}
