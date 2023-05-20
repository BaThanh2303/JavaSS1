package javafx2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class productController {
    public TextField fxTen;
    public TextField fxGia;
    public TextField fxSoluong;
    public TextField fxDanhMuc;
    public TextArea fxMoTa;
    public static ObservableList<Product> listProduct = FXCollections.observableArrayList();
    public ListView<Product> lview;
    public static Product editProduct;
    public void Submit(ActionEvent actionEvent) {
        try {
            String name = fxTen.getText();
            String gia = fxGia.getText();
            String soLuong = fxSoluong.getText();
            String danhMuc = fxDanhMuc.getText();
            String moTa = fxMoTa.getText();
            try {
                double number = Double.parseDouble(gia);
            }catch (NumberFormatException e){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Nhập Số!!!");
            }
            if (editProduct != null){
                editProduct.setTenSP(name);
                editProduct.setGia(gia);
                editProduct.setSoLuong(soLuong);
                editProduct.setDanhMuc(danhMuc);
                editProduct.setMoTa(moTa);
                lview.setItems(listProduct);
                lview.refresh();
                editProduct = null;
                fxTen.clear();
                fxGia.clear();
                fxSoluong.clear();
                fxDanhMuc.clear();
                fxMoTa.clear();
                return;
            }
            for (Product p: listProduct){
                if(p.getTenSP().equals(name))
                    throw new Exception("Tên SP đã tồn tại");
            }
            Product pd = new Product(name,gia,soLuong,danhMuc,moTa);
            listProduct.add(pd);
            lview.setItems(listProduct);
            fxTen.clear();
            fxGia.clear();
            fxSoluong.clear();
            fxDanhMuc.clear();
            fxMoTa.clear();

        }catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(e.getMessage());
            alert.show();
        }
    }

    public void edit(ActionEvent actionEvent) {
        editProduct = lview.getSelectionModel().getSelectedItem();
        if(editProduct != null){
            fxTen.setText(editProduct.getTenSP());
            fxGia.setText(editProduct.getGia());
            fxSoluong.setText(editProduct.getSoLuong());
            fxDanhMuc.setText(editProduct.getDanhMuc());
            fxMoTa.setText(editProduct.getMoTa());
        }
    }

    public void delete(ActionEvent actionEvent) {
        editProduct = lview.getSelectionModel().getSelectedItem();
        if(editProduct != null){
            lview.getItems().remove(editProduct);
        }
    }
}
