package RentCar;

import java.sql.Struct;

public class Car {
    private int id;
    private String tenXe;
    private String bienSoXe;
    private String dangKiem;
    private String baoDuong;
    private int giaXe;

    public Car(int id, String tenXe, String bienSoXe, String dangKiem, String baoDuong, int giaXe) {
        this.id = id;
        this.tenXe = tenXe;
        this.bienSoXe = bienSoXe;
        this.dangKiem = dangKiem;
        this.baoDuong = baoDuong;
        this.giaXe = giaXe;
    }

    public Car(String tenXe, String bienSoXe, String dangKiem, String baoDuong, int giaXe) {
        this.tenXe = tenXe;
        this.bienSoXe = bienSoXe;
        this.dangKiem = dangKiem;
        this.baoDuong = baoDuong;
        this.giaXe = giaXe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public String getBienSoXe() {
        return bienSoXe;
    }

    public void setBienSoXe(String bienSoXe) {
        this.bienSoXe = bienSoXe;
    }

    public String getDangKiem() {
        return dangKiem;
    }

    public void setDangKiem(String dangKiem) {
        this.dangKiem = dangKiem;
    }

    public String getBaoDuong() {
        return baoDuong;
    }

    public void setBaoDuong(String baoDuong) {
        this.baoDuong = baoDuong;
    }

    public int getGiaXe() {
        return giaXe;
    }

    public void setGiaXe(int giaXe) {
        this.giaXe = giaXe;
    }
}
